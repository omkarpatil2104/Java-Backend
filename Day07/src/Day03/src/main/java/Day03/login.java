package Day03;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Employee")
public class login extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			if(req.getParameter("emp")!=null ) {
				PrintWriter out = resp.getWriter();
				String Name = req.getParameter("name");
				String Email = req.getParameter("email");
				String Pass = req.getParameter("pass");
				String Date = req.getParameter("date");
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/log" , "root" , "root");
				Statement st = con.createStatement();
				st.executeUpdate("insert into reg (emp_name , emp_email, emp_password,emp_date) values ('"+Name+"' ,'"+Email+"' , '"+Pass+"','"+Date+"')");
 				out.print("<script>alert('Succcessfully Done !!')</script>");
				
			}
		}catch(Exception e) {
			e.getMessage();
		}
		
	}
}