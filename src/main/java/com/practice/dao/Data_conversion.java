package com.practice.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Data_conversion {

	public ResultSet getResultSet()
	{
		ResultSet resultSet = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://192.168.20.171/shopclue_cart","production","Pr0D#c@qa");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from fetch_data");
			resultSet = rs;
		}
		catch(Exception e)
		{
			resultSet = null;
			System.out.println(e);
		}
		return resultSet;
	}
	
	
}
