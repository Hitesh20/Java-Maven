package com.practice.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class Data_pao {
	
	public void put(int p_id, String p_f_name, String p_l_name, int p_age)
	{
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://192.168.20.171/shopclue_cart","production","Pr0D#c@qa");
			//Statement st = con.createStatement();
//PreparedStatement stmt = con.prepareStatement("insert into 'shopclue_cart'.'fetch_data'(id,f_name,l_name,age)VALUES('p_id','p_f_name','p_l_name','p_age')";
			
PreparedStatement stmt = con.prepareStatement("INSERT INTO shopclue_cart.fetch_data(id,f_name,l_name,age) VALUES (?,?,?,?)");
stmt.setInt(1, p_id);
stmt.setString(2, p_f_name);
stmt.setString(3, p_l_name);
stmt.setInt(4, p_age);
	stmt.executeUpdate();	
	
con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
