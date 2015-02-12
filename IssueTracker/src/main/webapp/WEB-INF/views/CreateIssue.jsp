<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="style/css.css">
<script type="text/javascript" src="script/jquery-2.1.3.js"></script>
<script src="bootstrap/js/bootstrap.js" type="text/javascript"></script>
<title>CreateIssue</title>
</head>
<body>
	<center>
		<form:form method="post">
			<table width="400px" height="150px">
				<tr>
					<h1>CreateIssue</h1>
				</tr>
				<tr>
					<td><h2>Project Name</h2></td>
					<td><input name = "project_name" type="text" size="40"></td>
					<textarea class="form-control"  name = "project_name"></textarea>
				</tr>
				<tr>
					<td><button type="submit" class="btn btn-default" data-dismiss="modal">Close</button></td>
				</tr>
			</table>
		</form:form>
	</center>
</body>
</html>