import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response)
	throws ServletException, IOException {
		
		String email=request.getParameter("uemail");
		String password=request.getParameter("upassword");
		
	UserDetails us=new UserDetails();
	us.setEmail(email);
	us.setPassword(password);
	
	UserDAO dao=new UserDao(DBConnect.getConn());
	UserDetails user=dao.loginUser(us);
	
	if(user!=null)
	{
		HttpSession session=request.getSession();
		session.setAttribute("user0",user);
		response.sendRedirect("home.jsp");
	}
	
	else {
		HttpSession session=request.getSession();
		session.setAttribute("login-failed","Invalid UserName and Password");
		response.sendRedirect("login-jsp");
	}
	
	

}
	
}
