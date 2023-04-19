<%@ include file="common/header.jsp"%>


<form method="post">
Min limit:
<br>
<input type="text" name="minLimit" value="0">
<br>
Max limit:
<br>
<input type="text" name="maxLimit" value="0">
<br>
<br>
Sort the results
<input type="checkbox" name="sort" >
<br>


<label for="stat-select">Choose the stat you want to filter by:</label>

<select name="stats" id="stat-select">
    <option value="TD">TD</option>
    <option value="INT">INT</option>
    <option value="yards">Passing yards</option>
    <option value="RTG">Passer rating</option>
    <option value="cmpPerc">Completion %</option>
    <option value="CMP">Completions</option>
</select>
<br>
<br>
<input type="submit" class="btn btn-success">

</form>




	
	<script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.3/jquery.min.js"></script>
</body>

</html>