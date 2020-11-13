<%@ page language="java" contentType="text/html; charset = utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${title}</title>
</head>
<body>
	<h2>Danh sách khác hàng</h2>
	<table border = 1 cellpadding = 0 cellspacing = 0>
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
		<c:forEach items = "${list}" var = "customers">
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
			</tr>
		</c:forEach>
	</table>
</body>
</html>