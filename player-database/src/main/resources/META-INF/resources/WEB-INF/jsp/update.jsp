<%@ include file="common/header.jsp"%>


<div>
<form:form method="post" modelAttribute="player">


	<br>
	<form:hidden path="id" />
	<fieldset>
		Name<br>
		<form:input path="name" type="text" required="required" /><br>
		Team<br>
		<form:input path="team" type="text" required="required" /><br>
		Position<br>
		<form:input path="pos" type="text" required="required" /><br>
		Game Started<br>
		<form:input path="GS" type="text" required="required" /><br>
		Completions<br>
		<form:input path="CMP" type="text" required="required" /><br>
		Attempts<br>
		<form:input path="ATT" type="text" required="required" /><br>
		Completion %<br>
		<form:input path="cmpPerc" type="text" required="required" /><br>
		Passing Yards<br>
		<form:input path="yards" type="text" required="required" /><br>
		Yards Per Game<br>
		<form:input path="YPG" type="text" required="required" /><br>
		Yards Per Pass<br>
		<form:input path="YPP" type="text" required="required" /><br>
		Longest Pass<br>
		<form:input path="LNG" type="text" required="required" /><br>
		TD<br>
		<form:input path="TD" type="text" required="required" /><br>
		INT<br>
		<form:input path="INT" type="text" required="required" /><br>
		Sacks<br>
		<form:input path="sacks" type="text" required="required" /><br>
		SYL<br>
		<form:input path="SYL" type="text" required="required" /><br>
		QB Rating<br>
		<form:input path="QBR" type="text" required="required" /><br>
		Passer Rating<br>
		<form:input path="RTG" type="text" required="required" /><br>


	</fieldset>
	<br>

	<button type="submit" class="btn btn-success">Add/Update</button>

</form:form>
</div>


<script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.3/jquery.min.js"></script>
</body>

</html>