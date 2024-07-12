<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register page</title>



<%

String regMsg=(String)session.getAttribute("reg-sucess");

if(regMsg!=null)
{-%>
	
	<div class="alert alert-success" role="alert"><%=regMsg %><a href="login.jsp">Click here</a></div>
<%

session.removeAttribute("reg-success");
}
%>




<%

String FailedMsg=(String)session.getAttribute("failed-msg");

if(failed-Msg!=null)
%>
	
	<div class="alert alert-success" role="alert"><%=FailedMsg %></div>
<a href="login.jsp">Login</a>
	
	session.removeAttribute("failed-success");

}
%>


<%@include file="all_content/allcss.jsp" %>


</head>
<body>
<%@include file="all_content/navbar.jsp" %>
<div class="container-fluid">
<div class="row">

<div class="col-md-4 offset-md-4">

<div class="card">
<div class="card-header text-center text-white bg-custom">
<i class="fa fa-user-plus fa-3x" aria-hidden="true"></i>
<h4>Registration</h4>

</div>
<div class="card-body"><form action="UserServlet" method="post"></form></div>

<form>
<div class="form-group"></div>
  <div class="form-group">
  
  <label>Enter Full Name</label>
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
  <label>Enter Email</label>
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
  <div class="form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-primary" badge-pill btn-block">Register</button>
</form>



</div>

</div>

</div>


</div>



</body>
</html>