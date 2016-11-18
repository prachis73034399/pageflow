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
	// creating hashMap object for sessionId and pageId
	HashMap<String, List<String>> sessionHashMap = new HashMap<String, List<String>>();
	// Creating object of PageAction class
	PageAction pageAction= new PageAction();
	//.............Initializing Variables.............
	String  pageId ,sessionId, sessionId1;
	// intializing int variable
	int csvSessionId, csvPageId, i, count=0;
	

	// creating method which will return hashMap having count for each sessionId list of PageId
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
			
			// Making Object of CsvReader class and reading csvFile
			CsvReader csvReaderObject = new CsvReader(csvFile, ',');
			
			// while loop goes till csvReaderObject has records
			while (csvReaderObject.readRecord())
			{ 
				List<String> pageList= new ArrayList<String>();
				
				// reading session id using  csvReaderObject
				sessionId = csvReaderObject.get(csvSessionId);

				// Making Object of CsvReader class and reading  csvFile
				CsvReader csvReaderObject1 = new CsvReader(csvFile, ',');
				// second time creating while loop for reading all session id
				while (csvReaderObject1.readRecord())
				{ 
					// reading session id using  csvReaderObject
					sessionId1 = csvReaderObject1.get(csvSessionId);
					// reading session id using  csvReaderObject
					pageId = csvReaderObject1.get(csvPageId);
					
					// every sessionId will check for equality with each session id
					if(sessionId.equals(sessionId1))
					{
						// pageid will be added into list of pageId for particular sessionId
						pageList.add(pageId);
						// putting sessionId and pageList in hashMap
						sessionHashMap.put(sessionId, pageList);
					}
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		// returning sessionHashMap Object having pageId for each hashMap
		return sessionHashMap;
	}
}
	

