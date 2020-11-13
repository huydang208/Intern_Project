<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>User Management Application</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>

</head>
<body>
	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: tomato">
			<div>
				<a href="" class="navbar-brand"> Manager</a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Customers</a></li>
			</ul>

			<ul class="navbar-nav navbar-collapse justify-content-end">
				<li><a href="<%=request.getContextPath()%>/logout"
					class="nav-link">Logout</a></li>
			</ul>
		</nav>
	</header>

	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">List of Customers</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/new"
					class="btn btn-success">Add Customers</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Customers Number</th>
						<th>Customers Name</th>
						<th>Contact Last Name</th>
						<th>Contact First Name</th>
						<th>Phone</th>
						<th>Address Line 1</th>
						<th>Address Line 2</th>
						<th>City</th>
						<th>State</th>
						<th>Postal Code</th>
						<th>Country</th>
						<th>SalesRep Employee Number</th>
						<th>Credit Limit</th>
					</tr>
				</thead>
				<tbody>
					<!--   for (Customers Customers: customers) {  -->
					<c:forEach var="customers" items="${listCustomers}">

						<tr>
							<td>${customers.customerNumber}</td>
							<td>${customers.customerName}</td>
							<td>${customers.contactLastName}</td>
							<td>${customers.contactFirstName}</td>
							<td>${customers.phone}</td>
							<td>${customers.addressLine1}</td>
							<td>${customers.addressLine2}</td>
							<td>${customers.city}</td>
							<td>${customers.state}</td>
							<td>${customers.postalCode}</td>
							<td>${customers.country}</td>
							<td>${customers.salesRepEmployeeNumber}</td>
							<td>${customers.creditLimit}</td>

							<td><a href="edit?id=<c:out value='${customers.customerNumber}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete?id=<c:out value='${customers.customerNumber}' />">Delete</a></td>

						 <td><button (click)="updateCustomers(Customers.id)" class="btn btn-success">Update</button>
          					<button (click)="deleteCustomers(Customers.id)" class="btn btn-warning">Delete</button></td>
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>

	<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>
