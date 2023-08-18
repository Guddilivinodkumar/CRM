<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ include file="Menu.jsp" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lead Info</title>
</head>
<body>
    <h2>Lead | Info</h2>
    Lead Id:${lead.id}<br>
    First Name:${lead.firstName}<br>
    Last Name:${lead.lastName}<br>
    Source:${lead.source}<br>
    Email:${lead.email}<br>
    Mobile:${lead.mobile}<br>
    <form action="convertLead" method="post">
       <input type="hidden" name="id" value="${lead.id }"/>
   <input type="submit" value="convert"/>
   </form>
</body>
</html>