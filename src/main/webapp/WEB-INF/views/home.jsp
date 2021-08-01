<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="./base.jsp" %>
</head>
<body>
<div class="container text-center">
<table class="table ">
  <thead class="thead-dark">
    <tr>
      <th scope="col">Id</th>
      <th scope="col">ProductName</th>
      <th scope="col">Description</th>
      <th scope="col">Price</th>
       <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${product}" var="p">
    <tr>
    <td>${p.id}</td>
      <td>${p.name}</td>
      <td>${p.description}</td>
      <td>&#8377; ${p.price}</td>
      <td><a href="delete/${p.id}"><i class="fas fa-trash text-danger px-3"></i></a>
      	<a href="update/${p.id}"><i class="fas fa-pen-alt "></i></a>
      </td>
      
    </tr>
    </c:forEach>
  </tbody>
</table>
</div>
<div class="container text-center">
<a href="addproduct" class="btn btn-outline-success ">Add-More-Proudct</a>
</div>
</body>
</html>