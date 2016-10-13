package org.shu.train;


/*
 * 
 * 
 */


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class No_01 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String str=sc.nextLine();

    	Map<Character,Integer> map=new HashMap<>();
  
    	for(int i=0;i<str.length();i++){
    		char c=str.charAt(i);
    		if(map.containsKey(c)){
    			map.put(c,map.get(c)+1);
    		}else{
    			map.put(c,new Integer(1));    			
    		}
    	}
    	
    	for(Map.Entry<Character, Integer> entry:map.entrySet()){
    		char key=entry.getKey();
    		int value=entry.getValue();
    		System.out.print(""+key+value);
    	}
    	
    	
    }
 
}