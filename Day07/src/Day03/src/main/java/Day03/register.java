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

@WebServlet("/Register")
public class register extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			 PrintWriter out = resp.getWriter();
			if (req.getParameter("submit") != null) {
				String Name = req.getParameter("name");
				String Email = req.getParameter("email");
				String Pass = req.getParameter("pass");
				
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register" , "root" , "root");
				Statement st = con.createStatement();
				st.executeUpdate("insert into empreg (r_name , r_email , r_pass ) values ('"+Name+"' , '"+Email+"' , '"+Pass+"' )");
				out.print("<script>alert('Data inserted Successfully Done !! ')</script>");
			}
		}catch(Exception e) {
			e.getMessage();
		}
	}
}