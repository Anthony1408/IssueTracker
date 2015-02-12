<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script type="text/javascript" src="script/javascript.js"></script>

<div class="row" style="margin-top: 3%">
	<div class="col-md-6">
		<div class="panel panel-default">
			<div class="panel-footer">Activity Stream</div>
		</div>
		<%-- 		<form action="current_project.html" method="post"> --%>
		<%-- 			<c:forEach items="${activity}" var="activity"> --%>
		<!-- 				<div class="list-group"> -->
		<!-- 					<a href="#" class="list-group-item "> <img -->
		<!-- 						src="resource/136276.jpg" alt="..." class="img-rounded"> -->
		<!-- 						<h4 class="list-group-item-heading"> -->
		<%-- 							<c:out value="${activity[0]} ${activity[1]}" /> --%>
		<!-- 						</h4> -->
		<!-- 						<p class="list-group-item-text"> -->
		<%-- 							<c:out value="${activity[2]}" /> --%>
		<!-- 						</p> -->
		<!-- 						<p class="list-group-item-text"> -->
		<%-- 							<c:out value="${activity[3]}" /> --%>
		<!-- 						</p> -->
		<!-- 						<p class="list-group-item-text"> -->
		<!-- 							<button type="submit" class="btn btn-default btn-xs" name="name" -->
		<%-- 								value="${activity[3]}">show more</button> --%>
		<!-- 						</p> -->
		<!-- 					</a> -->
		<!-- 				</div> -->
		<%-- 			</c:forEach> --%>
		<%-- 		</form> --%>
		<table class="table table-hover">
			<c:forEach items="${activity}" var="activity">
				<tr>
					<td>
						<ul class="media-list">
							<li class="media">
								<div class="media-left">
									<a href="#"> <img class="media-object"
										src="resource/136276.jpg" alt="...">
									</a>
								</div>
								<div class="media-body">
									<h4 class="media-heading">
										<c:out value="${activity[0]} ${activity[1]}" />
									</h4>
									<p>
										<c:out value="${activity[2]}" />
									</p>
									<p>
										<c:out value="${activity[3]}" />
									</p>
									<p>
									<form action="current_project.html" method="post">
										<c:choose>
											<c:when
												test="${(activity[0] == userInfoFirstName) && (activity[1]) == userInfoLastName}">
												<button type="submit" class="btn btn-default btn-xs">show
													more</button>
											</c:when>
										</c:choose>
									</form>
									</p>
								</div>
							</li>
						</ul>
					</td>
				</tr>
			</c:forEach>
		</table>
		<form action="" method="post">
			<button type="submit" class="btn btn-primary btn-lg btn-block">Show
				more</button>
		</form>
	</div>
	<div class="col-md-6">
	
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