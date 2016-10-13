package com.huawei.niuke1;

/*
 * 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。
 * 
 * 输入描述:输入N个字符
 * 输出描述:输出该字符串反转后的字符串
 * 
 * 输入例子:abcd
 * 输出例子:dcba
 */

import java.util.Scanner;


public class No_12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        StringBuilder sb=new StringBuilder(sc.nextLine());
//        sb.reverse();
//        System.out.println(sb.toString());
        String str=sc.nextLine();
        for(int i=str.length()-1;i>=0;i--){
        	System.out.print(str.charAt(i));
        }
  
    }
}