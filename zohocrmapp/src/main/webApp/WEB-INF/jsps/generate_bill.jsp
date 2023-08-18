<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Bill</title>
</head>
<body>
<h2>Create Bill</h2>
<form action="generateBill"method="post">
<pre>
  FirstName:<input type="text" name="firstName" value="${bill.firstName}"/>
  LastName:<input type="text" name="lastName" value="${bill.lastName}"/>
   Email:<input type="email" name="email" value="${bill.email}"/>
   Mobile:<input type="text" name="mobile" value="${bill.mobile}"/>
   product:<input type="text" name="product"/>
   amount:<input type="number" name="amount"/>
   <input type="submit" value="generate bill"/>	
   </pre>		  
</form>

</body>
</html>