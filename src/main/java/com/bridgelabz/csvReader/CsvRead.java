package com.bridgelabz.csvReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;

import com.bridgelabz.model.PageAction;
import com.bridgelabz.pageRouteDepth.PageRouteDepth;
import com.csvreader.CsvReader;


public class CsvRead 
{
	HashMap<String, List<String>> sessionHashMap = new HashMap<String, List<String>>();
	
	// Creating object of PageAction class
	PageAction pageAction= new PageAction();
	
	InputStream inputStream;;
	//.............Initializing Variables.............
	String pageRoute,  pageId, pageName, actionId, pageRoute1, sessionId, sessionId1, pageId1, line;
	
	int csvSessionId, csvPageId, i, count=0;
	

	public HashMap<String, List<String>> csvReadMethod() 
	{
		
		
		String sessionId;
		try 
		{
			// Initializing Predefined Properties class and making object of the same
			Properties prop = new Properties();
			String propFileName = "/home/bridgeit/Desktop/pgflow/src/resources/config.properties";
			// passing propFileName to the FileInputStream class object 
			FileInputStream fis = new FileInputStream(propFileName);
			if (fis != null)
			{
				// calling load method of Properties class
				prop.load(fis);
			}
			else
			{
				System.out.println("property file  not found in the classpath");
			}
	
			// ...............get the property value and store it into variablr............
			csvPageId = Integer.parseInt(prop.getProperty("csv.pageid"));
			csvSessionId = Integer.parseInt(prop.getProperty("sessionId"));
			String csvFile =prop.getProperty("csvFile");
			
			// Making Object of CsvReader class and reading 
			CsvReader csvReaderObject = new CsvReader(csvFile, ',');
			
			
			while (csvReaderObject.readRecord())
			{ 
				List<String> pageList= new ArrayList<String>();
				
				sessionId = csvReaderObject.get(csvSessionId);
/*				if(sessionId.equals("session_id"))
					continue;*/
				
				CsvReader csvReaderObject1 = new CsvReader(csvFile, ',');
				while (csvReaderObject1.readRecord())
				{ 
					
					sessionId1 = csvReaderObject1.get(csvSessionId);
					//System.out.println("******"+sessionId1);
/*					if(sessionId1.equals("session_id"))
						continue;*/
					
					pageId = csvReaderObject1.get(csvPageId);

					if(sessionId.equals(sessionId1))
					{
						pageList.add(pageId);
						sessionHashMap.put(sessionId, pageList);
					}
					
				}
				}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return sessionHashMap;
	}
}
	

