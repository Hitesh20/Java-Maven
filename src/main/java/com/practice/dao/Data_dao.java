package com.practice.dao;

import com.practice.model.*;
import java.sql.*;

public class Data_dao extends Data
{
	
	public Data getD(int id)
	{
		Data d1 = new Data();
		
		//System.out.println("Connnnnnnnnn...............");
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://192.168.20.171/shopclue_cart","production","Pr0D#c@qa");
			//System.out.println("connectoin ........"+con);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from fetch_data where id=" + id);
			while(rs.next())
			{
				d1.setId(rs.getInt("id"));
				d1.setF_name(rs.getString("f_name"));
				d1.setS_name(rs.getString("l_name"));
				d1.setAge(rs.getInt(4));
				con.close();
			}
			
		}
		catch(Exception e){
			
			System.out.println(e);
		}
		
		
		
		
		
		
		return d1;
	}

}
