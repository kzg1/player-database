<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>

<head>
<link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css"
	rel="stylesheet">
<title>Player database</title>
</head>

<body>

<nav class="navbar navbar-expand-md navbar-light bg-light mb-3 p-1">
	<a class="navbar-brand m-1" href="https://www.espn.com/nfl/stats/player">NFL player database</a>
	<div class="collapse navbar-collapse">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="/home">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="/players">Basic player stats</a></li>
			<li class="nav-item"><a class="nav-link" href="/detailed">Detailed player stats</a></li>
			<li class="nav-item"><a class="nav-link" href="/filter">Filter tool</a></li>
			<li class="nav-item"><a class="nav-link" href="/addPlayer">Add new player</a></li>
			<li class="nav-item"><a class="nav-link" href="/exportCSV">Export list as CSV</a></li>
		</ul>
	</div>

</nav>