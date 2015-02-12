<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="style/css.css">
<script type="text/javascript" src="script/javascript.js"></script>
<script type="text/javascript" src="script/jquery-2.1.3.js"></script>
<script src="bootstrap/js/bootstrap.js" type="text/javascript"></script>
</head>
<body>
	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="tableName" />
	<tiles:insertAttribute name="body" />
</body>
</html>