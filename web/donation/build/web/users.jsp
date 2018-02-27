<%-- 
    Document   : users
    Created on : Feb 27, 2018, 4:26:45 AM
    Author     : PRAKHAR
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Credit Transfer</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">

  </head>
  <body>

    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						 <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span>
					</button> <a class="navbar-brand" href="index.html">Home</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							<a href="users.jsp">View Users</a>
						</li>
						<li>
							<a href="transfer.jsp">Transfer credit</a>
						</li>
		
					</ul>
				</div>
				
			</nav>
                    <h1> USERS </h1>
                    <div class="jumbotron">
               
                        <%
                        Connection con;
                        PreparedStatement st;
                        ResultSet rs;
                        try {
                            
                            Class.forName("oracle.jdbc.driver.OracleDriver");
                            
                            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "prakhar");
               
                            st = con.prepareStatement("select * from users");
                            rs = st.executeQuery();%>                        
                    <table class="table">
                        <thead>
                            <tr>
                                <th> Name </th>
                                <th> Email </th>
                                <th> Credit </th>
                                <th> &nbsp; </th>                                
                            </tr>
                        </thead>
                        <tbody>
                            <%
                            while(rs.next())
                            {
                                out.println("<tr>");
                                out.println("<td>"+rs.getString(1)+"</td>");
                                out.println("<td>"+rs.getString(2)+"</td>");
                                out.println("<td>"+rs.getInt(3)+"</td>");
                                
                                out.println("</tr>");
                            }
                            con.close();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            %>
                        </tbody>
                        
                    </table>
                    </div>
                        
                        <h1> RECENT TRANSFERS </h1>
                    <div class="jumbotron">
               
                        <%
                            try {
                            
                            Class.forName("oracle.jdbc.driver.OracleDriver");
                            
                            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "prakhar");
               
                            st = con.prepareStatement("select * from transfers");
                            rs = st.executeQuery();%>                        
                    <table class="table">
                        <thead>
                            <tr>
                                <th> Donator </th>
                                <th> Amount </th>
                                <th> Receiver </th>
                                <th> &nbsp; </th>                                
                            </tr>
                        </thead>
                        <tbody>
                            <%
                            while(rs.next())
                            {
                                out.println("<tr>");
                                out.println("<td>"+rs.getString(1)+"</td>");
                                out.println("<td>"+rs.getInt(2)+"</td>");
                                out.println("<td>"+rs.getString(3)+"</td>");
                                
                                out.println("</tr>");
                            }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            %>
                        </tbody>
                        
                    </table>
                    </div>
                </body>
                </html>
                
                    