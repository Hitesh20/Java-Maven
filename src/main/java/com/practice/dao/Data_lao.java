package com.practice.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.practice.model.Data;

public class Data_lao {
	
	
	
	public static List<Data> getRecords(int start,int total)
	{
		ArrayList<Data> list = new ArrayList<Data>();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection 	con = (Connection) DriverManager.getConnection("jdbc:mysql://192.168.20.171/shopclue_cart","production","Pr0D#c@qa");

			PreparedStatement ps = ((java.sql.Connection) con).prepareStatement("select * from fetch_data limit "
					+(start -1) +","+total);
			//System.out.println("Statement made");
			ResultSet rs = ps.executeQuery();
			//System.out.println("Statement executed");
			while(rs.next())
			{
				Data d = new Data();
				d.setId(rs.getInt(1));
				d.setF_name(rs.getString(2));
				d.setS_name(rs.getString(3));
				d.setAge(rs.getInt(4));
				list.add(d);
			}
			con.close();
		}
		catch(Exception f)
		{
			System.out.println(f+"My msg");
		}
		
		
		
		
		return list;
	}
	
	public static int getPage()
	{
		int size=0;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://192.168.20.171/shopclue_cart","production","Pr0D#c@qa");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from fetch_data");

			rs = st.executeQuery("select count(*) from fetch_data");
			rs.next();
			size = rs.getInt(1);
			return size;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return 0;
	}

}
