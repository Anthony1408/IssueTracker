<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
<title>O_o!?</title>
</head>
<body>
	<center>
		<br> <br> <br> <br> <br> <br>
		<div class="jumbotron">
			<div style="color: gray; font-size: 40px">Hello ;)</div>
			<form method="post"
				action="<c:url value='j_spring_security_check' />">
				<table width="400px" height="150px">
					<tr>
						<td><input path="login" type="text" class="form-control"
							placeholder="Login" name="j_username" /></td>
					</tr>
					<tr>
						<td><input path="passWord" type="password"
							class="form-control" placeholder="Password" name="j_password" /></td>
					</tr>
					<tr>
						<td>
							<div class="checkbox">
								<label> <input name="remember-me" type="checkbox"
									value="true"> Remember me
								</label>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div style="color: red; font-size: 20px">${error}</div>
						</td>
					</tr>
					<tr>
						<td>
							<button class="btn btn-large btn-primary" type="submit">
								Sing in</button>
						</td>
					</tr>
				</table>
			</form>
		</div>
		<br>
	</center>
</body>
</html>