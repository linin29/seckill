var seckill = {
	// 相关url
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
					// 开始秒杀
					var md5 = exposer['md5'];
					var killUrl = seckill.URL.execution(seckillId, md5);
					$("#killBtn").one("click", function() {
						// 执行秒杀请求
						// 禁用按钮
						$(this).addClass("disabled");
						// 执行秒杀
						$.post(killUrl, {}, function(result) {
							if (result && result['success']) {
								var killResult = result['data'];
								var state = killResult['state'];
								var stateInfo = killResult['stateInfo'];
								//显示秒杀结果
								node.html("<span class=''label label-success>"+stateInfo+"</span>");
							}
						});
					});
					node.show();
				} else {
					// 未开始秒杀
					var now = exposer['now'];
					var start = exposer['start'];
					var end = exposer['end'];
					// 重新计时秒杀
					seckill.countdown(seckillId, now, start, end);
				}
			} else {

			}
		});
	},
	// 验证手机号
	validatePhone : function(phone) {
		if (phone && phone.length == 11 && !isNaN(phone)) {
			return true;
		} else {
			return false;
		}
	},
	countdown : function(seckillId, nowTime, startTime, endTime) {
		var seckillBox = $("#seckill-box");
		// 时间判断
		if (nowTime > endTime) {
			seckillBox.html("秒杀结束");
		} else if (nowTime < startTime) {
			// 秒杀未开始
			var killTime = new Date(parseInt(startTime));
			seckillBox.countdown(killTime, function(event) {
				var format = event.strftime("秒杀倒计时：%D天  %H小时  %M分钟  %S秒");
				seckillBox.html(format);
			}).on("finish.countdown", function(){
				//暴露秒杀地址
				seckill.handleSeckill(seckillId, seckillBox);
			});
		}else{
			//秒杀开始
			seckill.handleSeckill(seckillId, seckillBox);
		}
	},
	// 详情页相关逻辑
	detail : {
		// 初始化数据
		init : function(params) {
			// cookie中获取手机号
			var killPhone = $.cookie('killPhone');
			var startTime = params['startTime'];
			var endTime = params['endTime'];
			var seckillId = params['seckillId'];
			// 验证手机号
			if (!seckill.validatePhone(killPhone)) {
				var killPhoneModal = $("#killPhonemodal");
				killPhoneModal.modal({
					// 显示弹出层
					show : true,
					// 禁止位置关闭
					backdrop : 'static',
					// 关闭键盘事件
					keyboard : false
				});
				$("#killPhoneBtn").click(function() {
					var inputPhone = $("#killPhoneKey").val();
					// 验证手机号
					if (seckill.validatePhone(inputPhone)) {
						// 电话写入cookie
						$.cookie("killPhone", inputPhone, {
							expires : 7,
							path : "/seckill"
						});
						window.location.reload();
					}else{
						$("#killPhoneMeassage").hide().html("<label class='label label-danger'>手机号码错误</label>").show(300);
					}
				});
			}
			//已输入手机号
			$.get(seckill.URL.now(), {}, function(result) {
				if(result&&result['success']){
					var nowTime=result['data'];
					seckill.countdown(seckillId,nowTime,startTime,endTime);
				}
			})
		}
	}
}