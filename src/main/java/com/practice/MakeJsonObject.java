package com.practice;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

public class MakeJsonObject {

	public List<JSONObject> getFormatedResult(ResultSet res)
	{
		
		List<JSONObject> resList = new ArrayList<JSONObject>();
		try
		{
			ResultSetMetaData rsMeta = res.getMetaData();
			int clmCount = rsMeta.getColumnCount();
			List<String> columnNames = new ArrayList<String>();
			for(int i=0;i<clmCount;i++)
			{
				columnNames.add(rsMeta.getColumnName(i+1).toUpperCase());
			}
			
			while(res.next())
			{
				
				JSONObject jobj = new JSONObject();
				for(int i=0;i<clmCount;i++)
				{
					String key = columnNames.get(i);
					String value = res.getString(i+1);
					jobj.put(key,value);
					
				}
				resList.add(jobj);
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				res.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		
		
		
		return resList;
	}

	
}
