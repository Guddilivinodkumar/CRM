<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
 <%@ include file="Menu.jsp" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List All Leads</title>
</head>
<body>
<a href="/">create new Lead</a>
  <h2>List All Leads</h2>
   <table>
   <tr>
   <th>FirstName</th>
   <th>LastName</th>
   <th>source</th>
   <th>Email</th>
   <th>Mobile</th>
   </tr>
    <c:forEach var = "i" items="${leads }">
      <tr>
          <td><a href="leadInfo?id=${i.id}">${i.firstName}</a></td>
          <td>${i.lastName}</td>
          <td>${i.source}</td>
          <td>${i.email}</td>
          <td>${i.mobile}</td>
      </tr>
    </c:forEach>
    
   </table>
	
</body>
</html>