package com.huawei.niuke1;


/*
 * �ַ�����ͳ��
 * ��дһ�������������ַ����к��еĲ�ͬ�ַ��ĸ������ַ���ACSII�뷶Χ��(0~127)�����ڷ�Χ�ڵĲ���ͳ�ơ�
��������:����N���ַ����ַ���ACSII�뷶Χ�ڡ�
�������:�����Χ��(0~127)�ַ��ĸ�����
��������:abc
�������:3
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