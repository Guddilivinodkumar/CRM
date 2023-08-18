<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
   <%@ include file="Menu.jsp" %>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List All Contacts</title>
</head>
<body>
  <h2>List All Contacts</h2>
   <table>
   <tr>
   <th>FirstName</th>
   <th>LastName</th>
   <th>Email</th>
   <th>Mobile</th>
   <th>Billing</th>
   </tr>
    <c:forEach var = "i" items="${contacts }">
      <tr>
          <td><a href="contactInfo?id=${i.id}">${i.firstName}</a></td>
          <td>${i.lastName}</td>
          <td>${i.email}</td>
          <td>${i.mobile}</td>
          <td><a href="showGenerateBill?id=${i.id}">create bill</a></td>
          
      </tr>
    </c:forEach>
    
   </table>
	
</body>
</html>