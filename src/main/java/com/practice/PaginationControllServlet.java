package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.dao.Data_lao;
import com.practice.model.Data;


public class PaginationControllServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{	
		PrintWriter out = response.getWriter();
		String spageid = request.getParameter("page");
		int pageid = Integer.parseInt(spageid);
		int total = 5;
		if(pageid == 1)
		{
			
		}
		else
		{
			pageid = pageid - 1;
			pageid = pageid*total +1;
		}
		Data_lao lao = new Data_lao();		
		int count = lao.getPage();
		//System.out.println("count ="+count);
		List<Data> lists = lao.getRecords(pageid, total);
		out.print("<h1>page no : "+spageid+"</h1>");
		out.print("<table border='1' cellpadding='4' width=60%>");
		out.print("<tr><th>ID</th><th>First Name</th><th>Last Name</th><th>Age</th></tr>");
		for(Data d:lists)
		{
			out.print("<tr><td>"+d.getId()+"</td><td>"+d.getF_name()+"</td><td>"+d.getS_name()+"</td><td>"+d.getAge()+"</td></tr>");
		}
		out.print("</table>");
		int k=1;
		int cc_page = Integer.parseInt(request.getParameter("page"));
		if(cc_page!=1)
		{
			int b= Integer.parseInt(request.getParameter("page"))-1;
			out.print("<button onclick=window.location.href='PaginationControllServlet?page=" + b +"'>" + "Previous" +"</a></button>");
		}
		for(int i=0;i<count;i+=total)
		{			
			out.print("<button onclick=window.location.href='PaginationControllServlet?page=" + k +"'>" + k +"</a></button>");
			k++;
		}
		int c_page = Integer.parseInt(request.getParameter("page"));
		if(c_page != k-1)
		{
			int b= Integer.parseInt(request.getParameter("page"))+1;
			out.print("<button onclick=window.location.href='PaginationControllServlet?page=" + b +"'>" + "Next" +"</a></button>");
		}
		out.close();
	}
}
