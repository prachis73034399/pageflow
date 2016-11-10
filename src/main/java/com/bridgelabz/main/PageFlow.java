package com.bridgelabz.main;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import com.bridgelabz.csvReader.CsvRead;
import com.bridgelabz.model.PageAction;
import com.bridgelabz.pageRouteDepth.PageRouteDepth;
import com.csvreader.CsvReader;
import com.csvreader.CsvReader;

public class PageFlow 
{
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a value to find:");
		String value= br.readLine();
		PageRouteDepth pageroute= new PageRouteDepth(value);
		
		CsvRead csv = new CsvRead();
		csv.csvReadMethod();
	
		
	
	}

	public void rfiu()
	{

		ArrayList<HashMap<String,String>> arrayList = new ArrayList<HashMap<String, String>>();
		HashMap<String,String> hashMap = new HashMap<String, String>();
	}
}
