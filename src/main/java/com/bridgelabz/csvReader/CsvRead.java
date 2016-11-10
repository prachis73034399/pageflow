package com.bridgelabz.csvReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.bridgelabz.model.PageAction;
import com.bridgelabz.pageRouteDepth.PageRouteDepth;
import com.csvreader.CsvReader;
import java.util.Properties;

public class CsvRead 
{
	InputStream inputStream;
	PageRouteDepth pageroute= new PageRouteDepth();
	
	public void csvReadMethod()
	{
	String pageId = null;
	String pageName = null;
	String actionId = null;
	long count= 0; 
	PageAction pageAction= new PageAction(pageId, actionId, pageName);
	String sessionID= null;
	try 
	{
		/*Properties prop = new Properties();
		String propFileName = "/home/bridgeit/Desktop/pgflow/src/resources/config.properties";
		//inputStream = new FileInputStream("/resources/config.properties");

		inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

		if (inputStream != null)
		{
			prop.load(inputStream);
		} else {
			throw new FileNotFoundException("property file  not found in the classpath");
		}

		//Date time = new Date(System.currentTimeMillis());

		// get the property value and print it out
		String csvpageid = prop.getProperty("csv.pageid");*/
		
		
		
		
		
		CsvReader csvReaderObject = new CsvReader("/home/bridgeit/Downloads/pageflow.csv", '	');
		while (csvReaderObject.readRecord())
		{ 
			
			String pageRoute= null;
			sessionID = csvReaderObject.get(47);
			//String date = csvReaderObject.get(46);
			pageId = csvReaderObject.get(26);
			pageAction.setPageId(pageId);
			String PgId= pageAction.getPageId();
			
			if(PgId.length()>=3)
			{
				pageRoute =PgId.substring(0,3);
			}
			else
			{
				pageRoute =PgId;
			}
			pageroute.pageDepth(pageRoute);
			System.out.println( "Page id length= "+PgId.length());
			actionId = csvReaderObject.get(0);
			pageAction.setActionId(actionId);
			String ActionId= pageAction.getActionId();
			
			System.out.println("Session Id:"+sessionID+" PageId :"+PgId+ " pageRoute :"+ pageRoute);
			count++;
		}
		
		//System.out.println(count);
		
		//csvReaderObject.close();		
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
	

