package com.huawei.niuke1;

/*
 * д��һ�����򣬽���һ���ַ�����Ȼ��������ַ�����ת����ַ�����
 * 
 * ��������:����N���ַ�
 * �������:������ַ�����ת����ַ���
 * 
 * ��������:abcd
 * �������:dcba
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