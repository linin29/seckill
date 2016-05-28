var seckill = {
	// ���url
	URL : {
		now:function(){
			return "/seckill/now/time";
		},
		exposer : function(seckillId) {
			return "/seckill/" + seckillId + "/exposer";
		},
		execution : function(seckillId, md5) {
			return "/seckill/" + seckillId + "/" + md5 + "/execution";
		}
	},
	handleSeckill:function(seckillId, node){
		node.html("<button class='btn btn-primary btn-lg' id='killBtn'>start</button>");
		$.post(seckill.URL.exposer(seckillId), {}, function(result) {
			if (result && result['success']) {
				var exposer = result['data'];
				if (exposer['exposed']) {
					// ��ʼ��ɱ
					var md5 = exposer['md5'];
					var killUrl = seckill.URL.execution(seckillId, md5);
					$("#killBtn").one("click", function() {
						// ִ����ɱ����
						// ���ð�ť
						$(this).addClass("disabled");
						// ִ����ɱ
						$.post(killUrl, {}, function(result) {
							if (result && result['success']) {
								var killResult = result['data'];
								var state = killResult['state'];
								var stateInfo = killResult['stateInfo'];
								//��ʾ��ɱ���
								node.html("<span class=''label label-success>"+stateInfo+"</span>");
							}
						});
					});
					node.show();
				} else {
					// δ��ʼ��ɱ
					var now = exposer['now'];
					var start = exposer['start'];
					var end = exposer['end'];
					// ���¼�ʱ��ɱ
					seckill.countdown(seckillId, now, start, end);
				}
			} else {

			}
		});
	},
	// ��֤�ֻ���
	validatePhone : function(phone) {
		if (phone && phone.length == 11 && !isNaN(phone)) {
			return true;
		} else {
			return false;
		}
	},
	countdown : function(seckillId, nowTime, startTime, endTime) {
		var seckillBox = $("#seckill-box");
		// ʱ���ж�
		if (nowTime > endTime) {
			seckillBox.html("��ɱ����");
		} else if (nowTime < startTime) {
			// ��ɱδ��ʼ
			var killTime = new Date(parseInt(startTime));
			seckillBox.countdown(killTime, function(event) {
				var format = event.strftime("��ɱ����ʱ��%D��  %HСʱ  %M����  %S��");
				seckillBox.html(format);
			}).on("finish.countdown", function(){
				//��¶��ɱ��ַ
				seckill.handleSeckill(seckillId, seckillBox);
			});
		}else{
			//��ɱ��ʼ
			seckill.handleSeckill(seckillId, seckillBox);
		}
	},
	// ����ҳ����߼�
	detail : {
		// ��ʼ������
		init : function(params) {
			// cookie�л�ȡ�ֻ���
			var killPhone = $.cookie('killPhone');
			var startTime = params['startTime'];
			var endTime = params['endTime'];
			var seckillId = params['seckillId'];
			// ��֤�ֻ���
			if (!seckill.validatePhone(killPhone)) {
				var killPhoneModal = $("#killPhonemodal");
				killPhoneModal.modal({
					// ��ʾ������
					show : true,
					// ��ֹλ�ùر�
					backdrop : 'static',
					// �رռ����¼�
					keyboard : false
				});
				$("#killPhoneBtn").click(function() {
					var inputPhone = $("#killPhoneKey").val();
					// ��֤�ֻ���
					if (seckill.validatePhone(inputPhone)) {
						// �绰д��cookie
						$.cookie("killPhone", inputPhone, {
							expires : 7,
							path : "/seckill"
						});
						window.location.reload();
					}else{
						$("#killPhoneMeassage").hide().html("<label class='label label-danger'>�ֻ��������</label>").show(300);
					}
				});
			}
			//�������ֻ���
			$.get(seckill.URL.now(), {}, function(result) {
				if(result&&result['success']){
					var nowTime=result['data'];
					seckill.countdown(seckillId,nowTime,startTime,endTime);
				}
			})
		}
	}
}