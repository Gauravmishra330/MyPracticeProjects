<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String id=(String)request.getAttribute("eid");
    String password=(String)request.getAttribute("ename");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome <%=id %></h1>
<h1>welcome <%=password %></h1>

</body>
</html>