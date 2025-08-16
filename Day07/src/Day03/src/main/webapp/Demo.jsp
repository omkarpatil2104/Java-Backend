<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>demo register</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="
sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
</head>	
<body class="bg-dark">


<br>
 <div class="row mt-5 ms-5" >
 
	  <div class="col-lg-3 " >
	    <form class="form-control bg-primary" action="#" method="get">
	    <br>
	    <h1 class="text-white">Employee Register</h1>
	    <br>
		<input class="form-control" type="text" name="name" placeholder="Enter your name" /> 
		<br>
		<input class="form-control"
			type="email" name="email" placeholder="Enter your email" />
			<br>
			 <input class="form-control"
			type="password" name="password" placeholder="Enter yur password" />
			<br>
		<button class="btn btn-danger mt-2 " name="submit" type="submit">Submit</button>
	</form>
	</div>

	<%
	try {
		if (request.getParameter("submit") != null) {
			String Name = request.getParameter("name");
			String Email = request.getParameter("email");
			String Pass = request.getParameter("password");

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp", "root", "root");
			Statement st = con.createStatement();
			st.executeUpdate("insert into st_table (e_name ,e_email ,e_pass) values ('" + Name + "' , '" + Email + "','"
			+ Pass+ "')");
	%>
	<script>
		alert("Successfully Done !! ");
	</script>
	<%
	}
	} catch (Exception e) {
	e.getMessage();

	}
	%>
	<br>
	<div class="col-lg-8 ">
	   <table class="table table-bordered " >
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
		</tr>
	<%
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from st_table");
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
		%>

		<tr>
			<td><%=rs.getString("e_name")%></td>
			<td><%=rs.getString("e_email")%></td>
			<td><%=rs.getString("e_pass")%></td>
		</tr>

		<%
		}
		%>
		
		<%
		
		%>
	</table>
	</div>
	</div>
	
	
	<div class="row mt-5">
	   <div class="col-lg-3 ms-5">
	 <form class="form-control bg-primary" action="#" method="get">
	 <br>
	 <h1 class="text-white">Employee login</h1>
	 <br>
		<input class="form-control" type="email" name="email1" placeholder="Enter your Email Here" />
		<br>
	    <input class="form-control" type="password" name="password1" placeholder="Enter your password Here" />
	    <br>
		<button class="btn btn-danger mt-2" name="login" type="submit">Submit</button>
	</form>
	<%
	String Email1 = request.getParameter("email1");
	String Pass1 = request.getParameter("password1");
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp", "root", "root");
	PreparedStatement ps1 = con1.prepareStatement("select * from st_table where e_email=? and e_pass=?");
	ps1.setString(1, Email1);
	ps1.setString(2,Pass1 );
	ResultSet rs1 = ps1.executeQuery();
    if(rs1.next()){
    	   
    	  HttpSession ses = request.getSession();
    	  ses.setAttribute("name",rs1.getString("e_name"));
    	  ses.setAttribute("email",rs1.getString("e_email"));
    	  ses.setAttribute("pass",rs1.getString("e_pass"));
    
	%>
	<script>
	   alert("login Successfully Done")
	</script>
	<%
    }
	%>

	   </div>
	   <div class="col-lg-8 text-white">
	     <%
	        String Name3 = (String) session.getAttribute("name");
	        String Email3 = (String) session.getAttribute("email");
	        String Pass3 = (String) session.getAttribute("pass");
	        
	     %>
	     <h1>Name : <%=Name3 %></h1>
	      <h1>Email : <%=Email3 %></h1>
	       <h1>Password : <%=Pass3 %></h1>
	     
	     
	   </div>
	
	</div>
	<br>
	<br>
	<br>
	
	<div class="row ">
	<div class="col-lg-3 ms-5 ">

	  <form class="form-control bg-primary" action="#" method="get">
	  <br>
	  
	  <h1 class="text-white">Admin Portal</h1>
	  <br>
		<input class="form-control" type="email" name="email2" placeholder="Enter your Email here" />
		<br>
	    <input class="form-control" type="password" name="password2" placeholder="Enter your Password Here" />
	    <br>
		<button class="btn btn-outline-danger mt-2" name="adminlogin" type="submit">Submit</button>
		<br>
	  </form>
	</div>
	</div>
	
	
	<div>
	    <%
	     if(request.getParameter("adminlogin")!=null){
	    	   String Email4 = request.getParameter("email2");
	    	   String Pass4 = request.getParameter("password2");
	    	   
	    	   if( (Email4.equals("omkarpatil0523@gmail.com") ) && (Pass4.equals("0304"))){
	    		   out.print("<script>alert('Succcesfully Done Login')</script>");
	    	   }else{
	    		   out.print("<script>alert('Id And Password Didnt Match !! ')</script>");
	    	   }
	    	   
	     }
	    %>
	</div>
	
 
</body>
</html>