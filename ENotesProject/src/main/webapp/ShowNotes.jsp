<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Notes</title>
<%@include file="all_content/allcss.jsp" %>
</head>
<body>

<%@include file="all_content/allcss.jsp" %>
<%

String updateMsg=(String)request.getAttribute("updateMsg");
if(updateMsg!=null)
	
{%>

<%



<div class="alert alert-success" role="alert"><%=invalidMsg%></div>

<%
session.removeAttribute("updateMsg");
}
%>


<div class="container">

<h2 class="container">
<h2 class="text-center">All Notes</h2>

<div class="row">
<div class="col-md-12">

<%
if (user3 !=null) {
	
	PostDao ob=new PostDao(DbConnect.getConn());
	List<post> post=ob.getData(user3.getId());
	for (Post po:post)
	{

%>




</div>



</div>



</h2>








</div>
	
	
}

%>


</head>
<body>

<




</body>
</html>