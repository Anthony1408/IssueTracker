<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<nav class="navbar navbar-default" style="margin-top: 3%">

	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#"></a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
			</ul>
			<form class="navbar-form navbar-left" role="search">
				<c:url var="Search" value="search.html" />
				<form:form action="${Search}" method="post">

					<div class="form-group">
						<label for="recipient-name" class="control-label">Assignee:</label>
						<select class="form-control" name="assignee">
							<option>All</option>
							<c:forEach items="${person}" var="person">
								<option>
									<c:out value="${person[0]} ${person[1]}" />
								</option>
							</c:forEach>
						</select>
					</div>

					<div class="form-group">
						<label for="recipient-name" class="control-label">Status:</label>
						<select class="form-control" name="status">
							<option>All</option>
							<option>Bigining</option>
							<option>End</option>
							<option>Inprogress</option>
						</select>
					</div>

					<div class="form-group">
						<label for="recipient-name" class="control-label">Project:</label>
						<select class="form-control" name="project">
							<option>All</option>
							<c:forEach items="${projectName}" var="projectName">
								<option name="projectName">
									<c:out value="${projectName}" />
								</option>
							</c:forEach>
						</select>
					</div>

					<div class="form-group">
						<input type="text" class="form-control" placeholder="Search">
					</div>
					<button type="submit" class="btn btn-default">Search</button>
				</form:form>
			</form>
			<ul class="nav navbar-nav navbar-right">
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid -->
</nav>

<!-- table -->

<table class="table table-hover">
	<th>Assignee</th>
	<c:forEach items="${search}" var="search">
		<tr>
			<td><c:out value="${search[0]} ${search[1]}" /></td>
			<td><c:out value="${search[2]}" /></td>
			<td><c:out value="${search[3]}" /></td>
			<td><c:out value="${search[4]}" /></td>
			<td><c:out value="${search[5]}" /></td>
		</tr>
	</c:forEach>
</table>


