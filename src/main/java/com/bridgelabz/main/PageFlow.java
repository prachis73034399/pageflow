package com.bridgelabz.main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
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
		HashMap<String, Integer> pageRouteDepthCount = new HashMap<String, Integer>();
		// creating object of the CsvRead class 
		CsvRead csv = new CsvRead();
		
		// caling method csvReadMethod of CsvRead Method
		sessionHashMap = csv.csvReadMethod();
		System.out.println(sessionHashMap);
		pageRouteDepthCount =pageRouteDepthObject.pageDepthCount(sessionHashMap);
		System.out.println("pageroute HashMap "+pageRouteDepthCount);
		
	}
}
