<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="style/css.css">
<script type="text/javascript" src="script/jquery-2.1.3.js"></script>
<script src="bootstrap/js/bootstrap.js" type="text/javascript"></script>




<title>Insert title here</title>
</head>
<body>
	<div class="panel panel-default">
		<div class="panel-heading">
			<h3 class="panel-title">Epam</h3>
			<button type="button" class="btn btn-primary btn-xs">Exit</button>
		</div>

		<div class="panel-body">
			<div class="row">
				<div class="col-md-3">
					<button type="button" class="btn btn-primary">DashBoards</button>
				</div>
				<div class="col-md-3">
					<c:url var="search" value="search.html" />
					<form:form  method="post" action="${search}">
						<button type="submit" class="btn btn-primary">Projects</button>
					</form:form>
				</div>
				<div class="col-md-3">
					<button type="button" class="btn btn-primary">Issues</button>
				</div>
				<div class="col-md-3">
					<button type="button" class="btn btn-primary" data-toggle="modal"
						data-target="#exampleModal" data-whatever="@mdo">Create
						Issue</button>
				</div>
			</div>
		</div>
	</div>

	

	<div class="row" style="margin-top: 40px">
		<div class="col-md-7">
			<div class="panel panel-default">
				<div class="panel-footer">Activity Stream</div>
			</div>
			<table class="table table-hover">
				<th>Title1</th>
				<th>Title2</th>
				<th>Title3</th>
				<th>Title4</th>
				<th>Title5</th>
				<c:forEach items="${activity}" var="activity">
					<tr>
						<td><c:out value="${activity.data}" /></td>
						<td><c:out value="${activity.duration}" /></td>
						<td><c:out value="${activity.comment}" /></td>
						<td><c:out
								value="${activity.getMemberid().getEmployeeid().getFirstName()}" /></td>
						<td><c:out value="${activity.getAssigmentid().getPsd()}" /></td>
					</tr>
				</c:forEach>
			</table>
			<center>
				<button type="button" class="btn btn-primary btn-lg btn-block">Show
					more</button>
			</center>
		</div>
		<div class="col-md-5">
			<table class="table table-hover">
				<th>Title1</th>
				<th>Title2</th>
				<th>Title3</th>
				<div class="panel panel-default">
					<div class="panel-footer">Panel footer</div>
				</div>
				<c:forEach items="${assigment}" var="assigment">
					<tr>
						<td><c:out
								value="${assigment.getTaskid().getProjectid().getName()}" /></td>
						<td><c:out value="${assigment.description}" /></td>
						<td><c:out value="${assigment.getStatusid().getName()}" /></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>


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
						<button type="submit" class="btn btn-primary">Create
							Issue</button>
					</div>
				</div>
			</form:form>
		</div>
	</div>


	<!--  <table border="0" bgcolor="gray" width="100%">
		<tr style="background-color: gray; color: white; text-align: center;"
			height="30px">
			<td>Epam</td>
			<td><input type="submit" value="DashBoards" /></td>
			<td><input type="submit" value="Projects" /></td>
			<td><input type="submit" value="Issues" /></td>
			<c:url var="createIssue" value="createIssue.html" />
			<td><form:form action="${createIssue}" method="post">
					<input type="submit" value="Create Issue" />
				</form:form></td>
		</tr>
	</table>
	<h1>${Enot}</h1>
	<h1>System DashBoard</h1>
	<table width="100%">
		<tr>
			<td width="55%">
				<table border="2" bgcolor="White" width="98%" cellspacing="0">
					<tr
						style="background-color: gray; color: white; text-align: center;"
						height="20px">
						<td align="left">Activity Stream</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr
						style="background-color: gray; color: white; text-align: center;"
						height="20px">
						<td align="center">Date</td>
						<td align="center">Duration</td>
						<td align="center">Comment</td>
						<td align="center">MemberId</td>
						<td align="center">assigmentid</td>
					</tr>

					<c:forEach items="${activity}" var="activity">
						<tr
							style="background-color: white; color: black; text-align: left;"
							height="30px">
							<td><c:out value="${activity.data}" /></td>
							<td><c:out value="${activity.duration}" /></td>
							<td><c:out value="${activity.comment}" /></td>
							<td><c:out
									value="${activity.getMemberid().getEmployeeid().getFirstName()}" /></td>
							<td><c:out value="${activity.getAssigmentid().getPsd()}" /></td>
						</tr>
					</c:forEach>

					<tr
						style="background-color: gray; color: white; text-align: center;"
						height="20px">
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td><input type="submit" value="Show more" /></td>
					</tr>
				</table>
			</td>
			<td width="45">
			
				<table border="2" bgcolor="White" width="100%" cellspacing="0">
					<tr
						style="background-color: gray; color: white; text-align: center;"
						height="20px">
						<td align="left">Assigned to me</td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<c:forEach items="${assigment}" var="assigment">
						<tr
							style="background-color: white; color: black; text-align: left;"
							height="30px">
							<td><c:out
									value="${assigment.getTaskid().getProjectid().getName()}" /></td>
							<td><c:out value="${assigment.description}" /></td>
							<td><c:out value="${assigment.getStatusid().getName()}" /></td>
						</tr>
					</c:forEach>
				</table>
			</td>
		</tr>
	</table>-->
</body>
</html>