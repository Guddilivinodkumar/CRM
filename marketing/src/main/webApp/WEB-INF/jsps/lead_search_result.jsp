<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
        <%@ include file="menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Lead</title>
</head>
<body>
  <h2>List All Leads</h2>
  
	<c:forEach var="j" begin="1" end="10" >
		  <p> ${j}</p>
	</c:forEach>
</body>
</html>