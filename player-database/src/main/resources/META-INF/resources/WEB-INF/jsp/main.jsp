<%@ include file="common/header.jsp"%>

	<table class="table">
		<thead>
			<th>id</th>
			<th>Name</th>
			<th>TD</th>
			<th>INT</th>
			<th>Passing yards</th>
			<th>Completion %</th>
			<th></th>
			<th></th>

		</thead>
		<tbody>
			<c:forEach items="${playerList}" var="player">
				<tr>
					<td>${player.id}</td>
					<td>${player.name}</td>
					<td>${player.TD}</td>
					<td>${player.INT}</td>
					<td>${player.yards}</td>
					<td>${player.cmpPerc}</td>
					<td><a class="btn btn-primary" href="updatePlayer?id=${player.id}">Update player</a></td>
					<td><a class="btn btn-danger" href="removePlayer?id=${player.id}">Remove player</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.3/jquery.min.js"></script>
</body>

</html>