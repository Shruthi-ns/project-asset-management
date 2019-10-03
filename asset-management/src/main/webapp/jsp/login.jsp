<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<h2>Welcome to Asset-Management Login Page</h2>

<div class="container">
	<form action="login" method="post">
	<div class="form-group">
	<label>Email ID</label>
	<input type="email" name="email" class="form-control" placeholder="Enter email"/>
	</div>
	
	<div class="form-group">
	<label>Password</label>
	<input type="password" name="password" class="form-control" placeholder="Enter password"/>
	</div>
	
	<div class="button">
			<input type="submit" value="Login" class="btn btn-primary"/></div>
	
	</form>
	
	</div>
	

</body>
</html>