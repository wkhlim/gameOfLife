package com.bglcorp.gol.util;

import java.util.Iterator;
import java.util.LinkedList;

import com.bglcorp.gol.data.Coordinate;

public class StringUtil {

	
	public static LinkedList<Coordinate> readInputParam(String input) {
		
		LinkedList<Coordinate> xyList = null;

		//String str= "[[1,1], [1,3], [3,1], [3,3]]";
		if(input.startsWith("[") && input.endsWith("]"))
		{
			StringBuffer sb = new StringBuffer(input);
			 
	        // Removing the last character
	        // of a string
	        sb.delete(input.length() - 1, input.length());
	 
	        // Removing the first character
	        // of a string
	        sb.delete(0, 1);
	        
	        String result=sb.toString();
	        
	        String [] dStrArry = result.split("(\\[)|(\\])");
	        
	        LinkedList<String> queue = new LinkedList<>();
	        
	        for(String str1 :dStrArry)
	        {
	        	if(str1.length() !=0 && !str1.trim().equalsIgnoreCase(",")) {
	        		queue.add(str1);
	        	}
	        }
	        
	        xyList = new LinkedList<>();
	        Iterator<String> itr=queue.iterator();  
			while(itr.hasNext()){  
				
				String str2 = itr.next();
				String[] resArr = str2.split(",",2);
				if(resArr.length==2)
				{
					Double dx = Double.parseDouble(resArr[0]);
					Double dy = Double.parseDouble(resArr[1]);
					
					Coordinate xy = new Coordinate(dx,dy);
					xyList.add(xy);
				}
		        
			}
		}

		return xyList;
	}

}
