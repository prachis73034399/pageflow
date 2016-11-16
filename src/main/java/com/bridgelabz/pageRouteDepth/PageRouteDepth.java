package com.bridgelabz.pageRouteDepth;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PageRouteDepth 
{
	HashMap<String, Integer> pageRouteDepthCount= new HashMap<String, Integer>();
	int sizeOfListOfPageId, depthId;
	
	List<String> pageList= new ArrayList<String>(); 
	List<String> pageRouteList= new ArrayList<String>(); 
	String pageRoute;
	public HashMap<String, Integer> pageDepthCount(HashMap<String, List<String>> sessionHashMap)
	{
		int count = 0;
		Set<String> keys = sessionHashMap.keySet();
		for(String key: keys)
		{
			
			sizeOfListOfPageId=sessionHashMap.get(key).size();
			//System.out.println("size="+sizeOfListOfPageId);
			depthId= sizeOfListOfPageId-1;
			//System.out.println("depthId="+depthId);
			pageList=sessionHashMap.get(key);
			//System.out.println(pageList);
			if(pageList.size()>=2)
			{
				System.out.println("Session Id:   "+key);
				 for (int i=0; i<pageList.size()-1; i++)
				 {
			        String firstPage= pageList.get(i);
			        String secondPage= pageList.get(i+1);
			        pageRoute= firstPage+":"+secondPage;
			       
			        pageRouteList.add(pageRoute);
			        System.out.println("list"+pageRouteList);
			        System.out.println("Page Route"+pageRoute);
			      }
				 System.out.println("\n");
				 
				 for(int i=0; i<depthId; i++)
				 {
					 	if(pageRoute.equals(pageRouteList.get(i)))
					 	{
					 		count++;
					 	}
						pageRouteDepthCount.put(pageRoute, count);
				}
			 }
		}
		return pageRouteDepthCount;
	}
}
	
