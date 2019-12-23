package com.second_practice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.dao.Data_pao;

public class EnterData extends HttpServlet
{
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		int r_id = Integer.parseInt(request.getParameter("id"));
		String r_f_name = request.getParameter("f_name");
		String r_l_name = request.getParameter("l_name");
		int r_age = Integer.parseInt(request.getParameter("age"));
		
		
		Data_pao pao = new Data_pao();
		
		pao.put(r_id,r_f_name,r_l_name,r_age);
		
		RequestDispatcher rd = request.getRequestDispatcher("first_page.jsp");
		
		rd.forward(request, response);
		
		
		
		
		
		
		
	}
	
	
	
	
	

}