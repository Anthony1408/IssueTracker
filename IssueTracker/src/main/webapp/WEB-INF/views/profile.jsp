<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<html>
<head>
<title>Profile Page | www.beingjavaguys.com</title>
</head>
<body>
	<c:url value="/j_spring_security_logout" var="logoutUrl" />
	<center>
		<br /> <br /> <br />
		<h2>Profile Page | You are now logged in</h2>
		<h3>
			<a href="${logoutUrl}">Logout</a>
		</h3>
	</center>

	<sec:authorize access="hasRole('ROLE_ADMIN')">
   YES, you are logged in!
</sec:authorize>
</body>
</html>