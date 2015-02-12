
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script type="text/javascript" src="script/jquery-2.1.3.js"></script>
<script src="bootstrap/js/bootstrap.js" type="text/javascript"></script>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<c:url value="/j_spring_security_logout" var="logoutUrl" />
<nav class="navbar navbar-default">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Epam</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li></li>
			</ul>
			<c:url var="dashboard" value="systemDashboard.html" />
			<form:form method="post" action="${dashboard}"
				class="navbar-form navbar-left">
				<div class="form-group">
					<button type="submit" class="btn btn-primary">DashBoards</button>
				</div>
			</form:form>

			<c:url var="project" value="" />
			<form:form method="post" action="${project}"
				class="navbar-form navbar-left">
				<div class="form-group">
					<button type="submit" class="btn btn-primary">Projects</button>
				</div>
			</form:form>

			<c:url var="search" value="search.html" />
			<form:form method="post" action="${search}"
				class="navbar-form navbar-left">
				<div class="form-group">
					<button type="submit" class="btn btn-primary">Issue</button>
				</div>
			</form:form>

			<sec:authorize access="hasRole('ROLE_ADMIN')">
				<form class="navbar-form navbar-left" role="search">
					<div class="form-group">
						<button type="button" class="btn btn-primary" data-toggle="modal"
							data-target="#exampleModal" data-whatever="@mdo">Create
							Issue</button>
					</div>
				</form>
			</sec:authorize>

			<ul class="nav navbar-nav navbar-right">
				<form class="navbar-form navbar-left" role="search">
					<div class="form-group">
						<a href="${logoutUrl}">
							<div style="color: blue; font-size: 20px">Logout</div>
						</a>
					</div>
				</form>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid -->
</nav>

<!-- modal window  -->

<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
	aria-labelledby="exampleModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<c:url var="createIssue" value="createIssue.html" />
		<form:form action="${createIssue}" method="post">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="exampleModalLabel">New Issue</h4>
				</div>
				<div class="modal-body">
					<form>
						<div class="form-group">
							<label for="recipient-name" class="control-label">Project:</label>
							<select class="form-control" name="projectName">
								<c:forEach items="${projectName}" var="projectName">
									<option name="projectName">
										<c:out value="${projectName}" />
									</option>
								</c:forEach>
							</select>
						</div>
						<div class="form-group">
							<label for="recipient-name" class="control-label">Assignee:</label>
							<select class="form-control" name="person">
								<c:forEach items="${person}" var="person">
									<option>
										<c:out value="${person[0]} ${person[1]} " />
									</option>
								</c:forEach>
							</select>
						</div>
						<div class="form-group">
							<label for="message-text" class="control-label">Description:</label>
							<textarea class="form-control" name="description"></textarea>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="submit" class="btn btn-primary">Create Issue</button>
				</div>
			</div>
		</form:form>
	</div>
</div>