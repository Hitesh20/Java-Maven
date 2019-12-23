<%@page import = "com.practice.model.Data" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

in show data<br />
<%

		

		Data d1 = (Data)request.getAttribute("person");
		
		int x = d1.getId();
		if(x==0)
		{
			out.println("No data found");
		}
		else{
			out.println(d1);
		}
%>
</body>
</html>