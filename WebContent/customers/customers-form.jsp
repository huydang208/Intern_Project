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
				<a href="http://localhost:8080/Intern_Project/customerss/customerss-list.jsp" class="navbar-brand">Manager</a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">customerss</a></li>
			</ul>

			<ul class="navbar-nav navbar-collapse justify-content-end">
				<li><a href="<%=request.getContextPath()%>/logout"
					class="nav-link">Logout</a></li>
			</ul>
		</nav>
	</header>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${customers != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${customers == null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${customers != null}">
            			Edit customers
            		</c:if>
						<c:if test="${customers == null}">
            			Add New customers
            		</c:if>
					</h2>
				</caption>

				<c:if test="${customers != null}">
					<input type="hidden" name="id" value="<c:out value='${customers.customerNumber}' />" />
				</c:if>

				<fieldset class="form-group">
					<label>Customers Name</label> <input type="text"
						value="<c:out value='${customers.customerName}' />" class="form-control"
						name="customerName" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Contact First Name</label> <input type="text"
						value="<c:out value='${customers.contactLastName}' />" class="form-control"
						name="contactLastName">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Contact First Name</label> <input type="text"
						value="<c:out value='${customers.contactFirstName}' />" class="form-control"
						name="contactFirstName" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Phone</label> <input type="text"
						value="<c:out value='${customers.phone}' />" class="form-control"
						name="phone" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Address Line 1</label> <input type="text"
						value="<c:out value='${customers.addressLine1}' />" class="form-control"
						name="addressLine1" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Address Line 2</label> <input type="text"
						value="<c:out value='${customers.addressLine2}' />" class="form-control"
						name="addressLine2" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label>City</label> <input type="text"
						value="<c:out value='${customers.city}' />" class="form-control"
						name="city" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label>State</label> <input type="text"
						value="<c:out value='${customers.state}' />" class="form-control"
						name="state" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Postal Code</label> <input type="text"
						value="<c:out value='${customers.postalCode}' />" class="form-control"
						name="postalCode" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Country</label> <input type="text"
						value="<c:out value='${customers.country}' />" class="form-control"
						name="country" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label>SalesRep Employee Number</label> <input type="text"
						value="<c:out value='${customers.salesRepEmployeeNumber}' />" class="form-control"
						name="salesRepEmployeeNumber" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Credit Limit</label> <input type="text"
						value="<c:out value='${customers.creditLimit}' />" class="form-control"
						name="creditLimit" required="required">
				</fieldset>

				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>

	<jsp:include page="../common/footer.jsp"></jsp:include>
</body>
</html>
