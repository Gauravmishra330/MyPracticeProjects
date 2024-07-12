<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String nam=(String) request.getAttribute("name");
    String pas=(String) request.getAttribute("pass");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome <%=nam %></h1>
<h1>Welcome <%=pas %></h1>
</body>
</html>