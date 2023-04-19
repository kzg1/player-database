<%@ include file="common/header.jsp"%>

	<table class="table">
		<thead>
			<th>id</th>
			<th>Name</th>
			<th>Team</th>
			<th>Position</th>
			<th>Game Started</th>
			<th>Completions</th>
			<th>Attempts</th>
			<th>CompPerc</th>
			<th>Yards</th>
			<th>Yard/pass</th>
			<th>Yard/game</th>
			<th>Longest</th>
			<th>TD</th>
			<th>INT</th>
			<th>Sacks</th>
			<th>SYL</th>
			<th>QBR</th>
			<th>RTG</th>
		</thead>
		<tbody>
			<c:forEach items="${playerList}" var="player">
				<tr>
				
					<td>${player.id}</td>
					<td>${player.name}</td>
					<td>${player.team}</td>
					<td>${player.pos}</td>
					<td>${player.GS}</td>
					<td>${player.CMP}</td>
					<td>${player.ATT}</td>
					<td>${player.cmpPerc}</td>
					<td>${player.yards}</td>
					<td>${player.YPP}</td>
					<td>${player.YPG}</td>
					<td>${player.LNG}</td>
					<td>${player.TD}</td>
					<td>${player.INT}</td>
					<td>${player.sacks}</td>
					<td>${player.SYL}</td>
					<td>${player.QBR}</td>
					<td>${player.RTG}</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.3/jquery.min.js"></script>
</body>

</html>