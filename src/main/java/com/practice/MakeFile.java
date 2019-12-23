package com.practice;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;
import org.json.JSONObject;
import com.practice.dao.*;


public class MakeFile {
	
	public List<JSONObject> getJsonObj()
	{
		//System.out.println("Successful");
			Data_conversion convert = new Data_conversion();
			ResultSet result = convert.getResultSet();
			MakeJsonObject mjo = new MakeJsonObject();
			List<JSONObject> resList = mjo.getFormatedResult(result);
			return resList;
		
	}
	public static String main()
	{
		MakeFile m = new MakeFile();
		List<JSONObject> jObj = m.getJsonObj();
		for(int i=0;i<jObj.size();i++)
		{
			System.out.println(jObj.get(i));
			try(FileWriter file = new FileWriter("myJSON.json"))
			{
				file.write(jObj.toString());
				file.flush();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}		
		return "";
	}

}
