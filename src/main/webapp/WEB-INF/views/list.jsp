<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据列表</title>
</head>
<body>

	<c:if test="${empty requestScope.emps}">
		<h4>没有查出任何数据!</h4>
	</c:if>
	
	<c:if test="${!empty requestScope.emps}">
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<th>编号</th>
				<th>名字</th>
				<th>性别</th>
				<th>邮箱</th>
			</tr>
			<c:forEach items="${requestScope.emps}" var="e">
				<tr>
					<td>${e.id }</td>
					<td>${e.lastName }</td>
					<td>${e.gender == '0' ? '女' : '男'}</td>
					<td>${e.email }</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

</body>
</html>