<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ include file="menu.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Lead</title>
</head>
<body>
<h2>Create new Lead</h2>
<form action="saveLead" method="post">
<pre>
First Name<input type="text" name="firstName"/><br>
Last Name<input type="text" name="lastName"/><br>
 Email<input type="email" name="email"/><br>
 Mobile<input type="text" name="mobile"/><br>
 <input type="submit" value="save"/>
 </pre>
</form>
${msg}
</body>
</html>