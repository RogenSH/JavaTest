package com.huawei.niuke1;
import java.util.Scanner;


/*
 * 输入一个整数，将这个整数以字符串的形式逆序输出;
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 * 
 * 输入描述:输入一个int整数
 * 输出描述:将这个整数以字符串的形式逆序输出
 * 输入例子:1516000
 * 输出例子:0006151
 */

public class No_11 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String str=sc.nextLine();
    	char[] c=str.toCharArray();
    	for(int i=c.length-1;i>=0;i--){
    		System.out.print(c[i]);
    	}
//    	StringBuilder sb=new StringBuilder(str);
//    	sb.reverse();
//    	System.out.print(sb.toString());
    }
}