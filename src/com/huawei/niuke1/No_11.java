package com.huawei.niuke1;
import java.util.Scanner;


/*
 * ����һ��������������������ַ�������ʽ�������;
 * ���򲻿��Ǹ���������������ֺ���0����������ʽҲ����0��������Ϊ100�������Ϊ001
 * 
 * ��������:����һ��int����
 * �������:������������ַ�������ʽ�������
 * ��������:1516000
 * �������:0006151
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