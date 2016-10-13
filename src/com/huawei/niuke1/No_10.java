package com.huawei.niuke1;


/*
 * 字符个数统计
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。
输入描述:输入N个字符，字符在ACSII码范围内。
输出描述:输出范围在(0~127)字符的个数。
输入例子:abc
输出例子:3
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class No_10 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	char[] c=sc.nextLine().toCharArray();
    	Set<Character> set=new HashSet<>();
    	for(int i=0;i<c.length;i++){
    		if(c[i]>=0&&c[i]<=127)
    		set.add(c[i]);
    	}
    	System.out.println(set.size());
    }
}