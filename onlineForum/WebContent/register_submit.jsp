<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="onlineForum.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/semantic.min.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<script src="js/jquery3.1.1.min.js"></script>
<script src="js/semantic.min.js"></script>
<div class="ui container">
<%
String fname=request.getParameter("firstname");
String lname=request.getParameter("lastname");
String country=request.getParameter("country");
String email=request.getParameter("email");
String pass1=request.getParameter("pass");
String pass2=request.getParameter("pass2");

String sex=request.getParameter("gender");
String username=Toolz.generateUsername(fname);
String sql="insert into USERS values('"+username+"','"+fname+"','"+lname+"','"+country+"','"+email+"','"+sex+"','"+pass1+"')";
//out.print(sql);
StmtUpdate s=new StmtUpdate(sql);
if(s.update()!=0){

%>
<h2 class="ui header green">Registration Successfull</h2>
<%} %>
</div>
</body>
</html>