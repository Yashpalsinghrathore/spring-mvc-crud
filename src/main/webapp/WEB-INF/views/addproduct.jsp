<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="./base.jsp" %>
</head>
<body>
<div class="container">

<h1 class="text-center">Add-Product</h1>

<form action="handleproduct" method="post">

<div class="form-group">
    <label for="name">ProductName</label>
    <input name="name" type="text" class="form-control" id="name" aria-describedby="emailHelp" placeholder="Enter Product Name">
  </div>
  <div class="form-group">
    <label for="description">Description</label>
    <input type="text" name="description" class="form-control" id="description" placeholder="Enter Description">
  </div>
  
  <div class="form-group">
    <label for="price">Price</label>
    <input type="text" name="price" class="form-control" id="price" placeholder="Enter Price">
  </div>
  <div class="text-center">
  <button type="submit" class="btn btn-success">Add-Product</button>
  </div>
</form>


</div>

</body>
</html>