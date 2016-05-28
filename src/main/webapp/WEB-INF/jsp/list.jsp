<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="common/tag.jsp"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<title>秒杀活动列表</title>
<%@include file="common/header.jsp"%>
</head>
<body>
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading text-center">
				<h2>秒杀列表</h2>
			</div>
			<div class="panel-body">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>名称</th>
							<th>开始时间</th>
							<th>结束时间</th>
							<th>创建时间</th>
							<th>详情页</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="seckill" items="${list}">
							<tr>
								<td>${seckill.name}</td>
								<td><fmt:formatDate value="${seckill.startTime}" pattern="yyyy-MM-dd HH:mm"/></td>
								<td><fmt:formatDate value="${seckill.endTime}" pattern="yyyy-MM-dd HH:mm"/></td>
								<td><fmt:formatDate value="${seckill.createTime}" pattern="yyyy-MM-dd HH:mm"/></td>
								<td><a class="btn btn-info" href="${seckill.seckillId}/detail" target="_blank">详情页</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>