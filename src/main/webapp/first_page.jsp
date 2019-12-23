<%@page import="com.practice.MakeFile" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  
MakeFile mf = new MakeFile();
String x = mf.main();

%>
<input type="submit" value="Search" onclick="window.location.href = 'index.jsp'">
<input type="submit" value="Add" onclick="window.location.href = 'index2.jsp'">
<input type="submit" value="All" onclick="window.location.href = 'PaginationControllServlet?page=1'">



</body>
</html>