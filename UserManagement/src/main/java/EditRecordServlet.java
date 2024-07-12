import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

public class EditRecordServlet extends HttpServlet {
	
	private final static String query="insert into user(name,email,mobile,dob,city,gender) values(?????)"
			
			@Override
			protected void doGet(HttpServletRequest req,HttpServletResponse res)
			

			  //get PrintWriter
			PrintWriter pw=res.getWriter();
			// set content type
			res.setContentType("text/html");
			//link the bootstrap
			pw.println("<link href='css/bootstrap.css'></link>");
			//get the values
			
			String name=req.getParameter("username");
			String email=req.getParameter("email");
			String mobile=req.getParameter("mobile");
			String dob=req.getParameter("dob");
			String city=req.getParameter("city");
			String gender=req.getParameter("gender");
			
			// load the JDBC driver
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (Exception e) {
				e.printStackTrace();
			
		}
			try(Connection con=DriverManager.getConnection("jdbc:mysql:///usermanagement","root","root");
				PreparedStatement ps=con.prepareStatement(query);) {
				ps.setString(1, name);
				ps.setString(2, email);
				ps.setString(3, mobile);
				ps.setString(4, dob);
				ps.setString(5, city);
				ps.setString(6, gender);
				
				// Execute the connection
				
				int count=ps.executeUpdate();
				pw.println("<div");
				if(count==1) {
					
					pw.println("<h2> Record Registered Successfully</h2>");
				} else {
					
					pw.println("<h2> Record not Registered Successfully</h2>");
					
					
					
		} catch (SQLException se) {
			pw.println("<h2 class='bg-danger text-light text-center'>"+se.getMessage()+"</h2>")
			se.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}

		pw.println("<a href='home.html'><button class="btn btn-outline-success'>Home</button></a>");

		  pw.println("</div class="card" style='margin:auto;width:300px;margin-top:100px>");
		  //close the stream
		  
		}
		@Override
		protected void doGet(HttpServletRequest req,HttpServletResponse res)
		doGet(req,res);
		}


}
