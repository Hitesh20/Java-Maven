package com.practice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.springframework.stereotype.Component;

import com.practice.dao.*;
import com.practice.model.*;
/**
 * Servlet implementation class GetItSaved
 */


public class getData extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		int s_id = Integer.parseInt(request.getParameter("id"));
		
		Data_dao dao = new Data_dao();
		
		Data a = dao.getD(s_id);
		
		
		
		request.setAttribute("person", a);
		
		RequestDispatcher rd = request.getRequestDispatcher("show_data.jsp");
		
		rd.forward(request, response);
	}


}