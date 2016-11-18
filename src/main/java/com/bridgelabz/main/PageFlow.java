package com.bridgelabz.main;
import java.util.HashMap;
import java.util.List;

import com.bridgelabz.csvReader.CsvRead;
import com.bridgelabz.pageRouteDepth.PageRouteDepth;

public class PageFlow 
{
	
	public static void main(String[] args) throws Exception
	{
		PageRouteDepth pageRouteDepthObject = new PageRouteDepth();
		// creating hashMap object of sessionHashMap
		HashMap<String, List<String>> sessionHashMap = new HashMap<String, List<String>>();
		// creating hashMap object of pageRouteDepthCount
		HashMap<String, Integer> pageRouteDepthCount = new HashMap<String, Integer>();
		
		// creating object of the CsvRead class 
		CsvRead csv = new CsvRead();
		// caling method csvReadMethod of CsvRead Method
		sessionHashMap = csv.csvReadMethod();
		// printing object of sessionHashMap
		System.out.println(sessionHashMap);
		
		// caling method csvReadMethod of CsvRead Method
		pageRouteDepthCount =pageRouteDepthObject.pageDepthCount(sessionHashMap);
		System.out.println("pageroute HashMap "+pageRouteDepthCount);
		
	}
}
