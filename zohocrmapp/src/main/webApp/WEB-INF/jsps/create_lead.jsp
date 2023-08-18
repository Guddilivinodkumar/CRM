<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file="Menu.jsp" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Lead</title>
</head>
<body>
<h2>Lead | Create</h2>
<form action="save"method="post">
<pre>
  FirstName:<input type="text" name="firstName"/>
  LastName:<input type="text" name="lastName"/>
  Source:		 
         <select name="source">
		   <option value="news paper">news paper</option>
		   <option value="radio">radio</option>
		   <option value="TV commercial">Tv commercial</option>
		   <option value="online">online</option>
		  </select>
			  
   Email:<input type="email" name="email"/>
   Mobile:<input type="text" name="mobile"/>
   <input type="submit" value="save"/>	
   </pre>		  
</form>

</body>
</html>