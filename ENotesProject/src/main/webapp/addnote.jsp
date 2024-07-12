<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <% 
    UserDetails user1=(UserDetails)session.getAttribute("userD");
    if(user1=null)
    	
    	
    	
    {
    	response.sendRedirect("login.jsp");
    	session.setAttribute("Login-error","Please Login..");
    }
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Notes</title>
<%include file="all_content/allcss.jsp" %>

</head>
<body>

<div class="container-fluid">
<%@include file="all_content/navbar.jsp" %>

<h1 class="text-center">Add your Notes</h1>

<div class="row">
<div class="col-md-12">
<form action="AddNotesServlet" method="post">
  <div class="form-group">
  
  
  <%
 UserDetails us=(UserDetails) session.getAttribute("userD")
 if(us!=null)
 { %>
 
 <input type="hidden" value="<%=us.getId() %>" name="uid">
	 
 <%
  %>}
  
  <label for="exampleInputEmail1">Enter Title</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">

  </div>
 <div class="form-group">
 <label for="exampleInputEmail">Enter Content</label>
 
 <textarea rows="9" cols="" class="form-control" name="content" required="required"></textarea>
 
 </div>
 
 <div class="container text-center"></div>
  <button type="submit" class="btn btn-primary">Add Notes</button>
</form>


</div>


</div>


</div>

<%@include file="all_content/footer.jsp" %>

</body>
</html>