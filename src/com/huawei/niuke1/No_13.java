package com.huawei.niuke1;

/*
 * ��һ��Ӣ������Ե���Ϊ��λ�����ŷš����硰I am a boy���������ŷź�Ϊ��boy a am I��
 * ���е���֮����һ���ո����������г���Ӣ����ĸ�⣬���ٰ��������ַ�
 * 
 * ��������:��һ��Ӣ������Ե���Ϊ��λ�����ŷš�
 * �������:�õ�����ľ���
 * 
 * ��������:I am a boy
 * �������:boy a am I
 * 
 */

import java.util.Scanner;

public class No_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str=sc.nextLine().split(" ");
		for(int i=str.length-1;i>0;i--){
			System.out.print(str[i]+" ");
		}
		System.out.print(str[0]);
	}
}