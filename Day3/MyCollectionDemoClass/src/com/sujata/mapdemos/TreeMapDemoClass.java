package com.sujata.mapdemos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemoClass {

	public static void main(String[] args) {
		
		/*
		 * TreeMap is autogrowable and autoshrinkable,
		 * sorted key value pair of elements,
		 * sorted wrt key
		 * keys are unique and values can be duplicated
		 */
		Map<String, Integer> months=new TreeMap<String, Integer>();
		
		System.out.println("Size of months : "+months.size());
		System.out.println(months);
		
		months.put("Jan", 31);
		months.put("Feb", 28);
		months.put("Mar", 31);
		months.put("Apr", 30);
		months.put("May", 31);
		
		System.out.println("Size of months : "+months.size());
		System.out.println(months);
		
		months.put("Jun", 30);
		months.put("Feb", 29);
		
		System.out.println("Size of months : "+months.size());
		System.out.println(months);
		
		Set<String> monthsName=months.keySet();
		
		for(String monthName:monthsName) {
			System.out.println(monthName+" contains "+months.get(monthName)+" days");
		}
		

	}

}
