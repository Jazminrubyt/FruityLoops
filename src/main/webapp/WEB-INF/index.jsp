<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />

<meta charset="ISO-8859-1">
<title>Fruity Loops</title>
</head>
<body>
	<div class="container">
		<div class="d-flex justify-content-center">
			<div class="card bg-success  text-center" style="width: 45rem">
				<h2>Fruits</h2>
				<div class="card-body">
					<table class="table table-dark table-striped">
						<thead>
							<tr>
							 	<th scope="col">Name</th>
      							<th scope="col">Price</th>
      						</tr>
						<c:forEach var="Fruits" items="${Fruits}">
      					<tbody>
      						<tr>
      							<td><c:out value="${Fruits.name}"/></td>
      							<td><c:out value="${Fruits.price}"/></td>
      					</tbody>

						</c:forEach>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
</html>