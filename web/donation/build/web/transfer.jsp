<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
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
					</button> <a class="navbar-brand" href="transfer.html">Home</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li >
							<a href="users.jsp">View Users</a>
						</li>
						<li class="active">
							<a href="transfer.jsp">Transfer credit</a>
						</li>
		
					</ul>
				</div>
				
			</nav>
                    <div class="jumbotron">
                        <form action="transferred" method="post">
                            Enter username who is transferring credit: <input type="text" name="t1"><br><br>
                            Enter username who is getting credit     : <input type="text" name="t2"><br><br>
                            Enter credit amount                      : <input type="text" name="t3"><br><br>
                            <input type="submit" value="Transfer" class="btn btn-lg btn-primary"/>
                        </form>
                    </div>
                </body>
</html>