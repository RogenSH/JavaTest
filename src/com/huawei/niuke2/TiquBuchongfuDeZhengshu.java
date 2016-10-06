package com.huawei.niuke2;

/*
 * 
 */

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class TiquBuchongfuDeZhengshu {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        char[] chars=sc.nextLine().toCharArray();
        Set<Character> set=new LinkedHashSet<>();
        
        for(int i=chars.length-1;i>=0;i--){
        	set.add(chars[i]);
        }
        
//        for(Character c:set){
//        	System.out.print(c);
//        }

        Iterator<Character> iterator=set.iterator();
        while(iterator.hasNext()){
        	Character c=iterator.next();
        	System.out.print(c);
        }
        
    }
 
}