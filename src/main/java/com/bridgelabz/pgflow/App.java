package com.bridgelabz.pgflow;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

import com.csvreader.CsvReader;
import com.csvreader.CsvReader;

public class App 
{
	public static void main(String[] args)
	{
		String sessionID;
		try 
		{
			CsvReader csvReaderObject = new CsvReader("/home/bridgeit/Downloads/pageflow.csv", '	');
			while (csvReaderObject.readRecord())
			{
				sessionID = csvReaderObject.get(47);
				String pageId = csvReaderObject.get(1);
				String browser = csvReaderObject.get(2);
			
				//HashMap<String,String> hm = new HashMap<String, String>;
				//get
				//hm.put(sessionID, pageId);
				//System.out.println(hm);
				// perform program logic here
				System.out.println("Session Id:"+sessionID+" :"+pageId+" :"+ browser );
			}
			csvReaderObject.close();
		}
		
		catch (FileNotFoundException e)  
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	
	}

}
