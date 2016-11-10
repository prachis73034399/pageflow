package com.bridgelabz.pageRouteDepth;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.bridgelabz.csvReader.CsvRead;
import com.bridgelabz.model.PageAction;
import com.csvreader.CsvReader;

public class PageRouteDepth 
{
	public PageRouteDepth() 
	{
		// TODO Auto-generated constructor stub
	}
	static String value;
	public PageRouteDepth(String value)
	{
		this.value= value;
	}
	int depthLevel= 0;
	//ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<HashMap<String, Integer>>();
	HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
	public void pageDepth(String pageRoute) throws IOException 
	{
		
		System.out.println(pageRoute);
		
		if(value==pageRoute)
		{
			depthLevel++;
		}
		hashMap.put(pageRoute, depthLevel);
		
		System.out.println("Hash Map ="+ hashMap.get(value));

	}
}
	
