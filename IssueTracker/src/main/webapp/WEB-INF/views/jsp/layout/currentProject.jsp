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
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li></li>
			</ul>
			<c:url var="dashboard" value="" />
			<form:form method="post" action="${dashboard}"
				class="navbar-form navbar-left">
				<div class="form-group">
					<button type="submit" class="btn btn-default">Start
						Progress</button>
				</div>
			</form:form>

			<ul class="nav navbar-nav navbar-right">
				<c:url var="project" value="" />
				<form:form method="post" action="${project}"
					class="navbar-form navbar-left">
					<div class="form-group">
						<button type="submit" class="btn btn-default">Export</button>
					</div>
				</form:form>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid -->
</nav>


<div class="row" style="margin-top: 3%">
	<div class="col-md-7">
		<table class="table">
			<caption>Details</caption>
			<tr>
				<td>Status:</td>
				<td>...</td>
			</tr>
		</table>
		<table class="table">
			<caption>Tempo</caption>
			<tr>
				<td><c:url var="project" value="" /> <form:form method="post"
						action="${project}" class="navbar-form navbar-left">
						<div class="form-group">
							<button type="submit" class="btn btn-default">Export</button>
						</div>
					</form:form></td>
			</tr>
		</table>
		<table class="table">
			<caption>Activity</caption>
			<tr>
				<td>
					vvnnvnvnvnvnvvvn
				</td>
			</tr>
		</table>
	</div>
	<div class="col-md-5">
		<table class="table">
			<caption>People</caption>
			<tr>
				<td>Assignee:</td>
				<td>why</td>
			</tr>
		</table>
	</div>
</div>