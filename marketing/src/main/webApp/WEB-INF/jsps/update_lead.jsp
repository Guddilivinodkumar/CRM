<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update Lead</title>
</head>
<body>
<h2>update Lead</h2>
<form action="updateLead" method="post">
Lead Id<input type="hidden" name="id" value="${lead.id}"/>
First Name<input type="text" name="firstName" value="${lead.firstName}"/><br>
Last Name<input type="text" name="lastName" value="${lead.lastName }"/><br>
 Email<input type="email" name="email" value="${lead.email }"/><br>
 Mobile<input type="text" name="mobile" value="${lead.mobile}"/><br>
 <input type="submit" value="update"/>`
 
</form>
${msg}
</body>
</html>