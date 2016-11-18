package com.bridgelabz.pageRouteDepth;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PageRouteDepth
{
	// creating hashMap object for calculating count of pageRoute
	HashMap<String, Integer> pageRouteDepthCountHashMap = new HashMap<String, Integer>();
	int sizeOfListOfPageId, depthId;
	// Intializing String Variable
	String pageRoute;

	// creating method which will return hashMap having count for each pageDepth
	public HashMap<String, Integer> pageDepthCount(HashMap<String, List<String>> sessionHashMap)
	{
		// keySet method of HashMap for getting set of sessionIds and storing it in a Set collection type
		Set<String> setOfSessionId = sessionHashMap.keySet();

		// for loop for retrieving each HashMap sessionId
		for (String sessionId : setOfSessionId)
		{
			// creating List object for getting the pageId list as a value of each HashMap sessionId
			List<String> pageIdList = new ArrayList<String>();
			// get(sessionId) will give a value of SessionId and size method  will calculate the size of list of pageId
			sizeOfListOfPageId = sessionHashMap.get(sessionId).size();
			// depth of pageId will always be one less than the size of list of PageId
			depthId = sizeOfListOfPageId - 1;
			// calling get(key)method of HashMap and storing List of pageId in pageIdList
			pageIdList = sessionHashMap.get(sessionId);

			// if condition satisfies when list is having more than one element
			if (pageIdList.size() >= 2) 
			{
				// creating List object for storing pageRoute in list
				List<String> pageRouteList = new ArrayList<String>();
				
				// for loop for creating pageRoute
				for (int i = 0; i < pageIdList.size() - 1; i++)
				{
					String firstPage = pageIdList.get(i);
					String secondPage = pageIdList.get(i + 1);
					// string concatenating
					pageRoute = firstPage + ":" + secondPage;

					// adding pageRoute in list
					pageRouteList.add(pageRoute);
				}

				// for loop for parsing through pageRouteList
				for (int k = 0; k < pageRouteList.size(); k++) 
				{
					// initializing int for count
					int count = 0;
					count++;
					// if condition will check if key is present or not
					if (pageRouteDepthCountHashMap.containsKey(pageRouteList.get(k))) 
					{
						// get method will give count for each pageRoute
						int listCount = pageRouteDepthCountHashMap.get(pageRouteList.get(k));
						// increasing listCount
						listCount++;
						pageRouteDepthCountHashMap.put(pageRouteList.get(k), listCount);
					} 
					else 
					{
						pageRouteDepthCountHashMap.put(pageRouteList.get(k), count);
					}

				}

			}

		}

		return pageRouteDepthCountHashMap;
	}
}
