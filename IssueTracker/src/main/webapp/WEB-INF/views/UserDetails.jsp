<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Being Java Guys | User Details</title>
</head>
<body>
	<center>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<div style="color: teal; font-size: 30px">Being Java Guys | User
			Details</div>
		<br>
		<br>
		<c:if test="${!empty employee}">
			<table border="1" bgcolor="black" width="600px">
				<tr
					style="background-color: teal; color: white; text-align: center;"
					height="40px">
					<td>User Id</td>
					<td>First Name</td>
					<td>Last Name</td>
				</tr>
				<c:forEach items="${employee}" var="employee">
					<tr
						style="background-color: white; color: black; text-align: center;"
						height="30px">
						<td><c:out value="${employee.id}" /></td>
						<td><c:out value="${employee.firstName}" /></td>
						<td><c:out value="${employee.lastName}" /></td>
						<td><c:out value="${employee.login}" /></td>
						<td><c:out value="${employee.passWord}" /></td>
						<td><c:out value="${employee.positionid.getName()}" /></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
		<br> <a href="authentication.html">Click Here to add new
			User</a>
	</center>
</body>
</html>