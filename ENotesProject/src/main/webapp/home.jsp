<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <% UserDetails user2=(UserDetails) session.getAttribute("userD")
    
    if(user2==null) {
    	response.sendRedirect("login.jsp");
    	session.setAttribute("Login-error","Please Login..");
    }
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="all_content/allcss.jsp" %>
</head>
<body>

<%@include file="all_content/navbar.jsp" %>
<div class="container-fluid">
<div class="card py-5">
<div class="card-body text-center">
<img alt="" src="img/n3.jpeg" class="img-fluid mx-auto" style="max-width:350px;">
<h1>START TAKING YOUR NOTES</h1>
<a href="addNotes.jsp" class="btn-btn-outline-primary">Start Here</a>





</div>

</div>
<%@include file="all_content/footer.jsp" %>



</div>

</body>
</html>