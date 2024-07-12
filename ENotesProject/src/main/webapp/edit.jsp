<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Notes</title>
<%@include file="all_content/allcss.jsp" %>



</head>
<body>

<%
Integer noteid=Integer.parseInt(request.getParameter("note_id"));

PostDao post=new PostDao(DbConnect.getConn());
Post p=post.getDataById(noteid);



%>

<div class="container-fluid">
<%@include file="all_content/navbar.jsp" %>

<h1 class="text-center">Edit your Notes</h1>

<div class="row">
<div class="col-md-12">
<form action="NoteEditServlet" method="post">


<input type="hidden" value="<%=noteid %>" name="noteid">
  <div class="form-group">
  
  
  
  <input type="hidden" value="<%=us.getId() %>" name=uid">
    <label for="exampleInputEmail1">Enter Title</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">

  </div>
 <div class="form-group">
 <label for="exampleInputEmail">Enter Content</label>
 
<textarea rows="9" cols="" class="form-control" name="content" required="required"><%=p.getContent() %></textarea>

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