package com.huawei.niuke1;

import java.util.Scanner;

//�����ַ������һ�����ʵĳ��ȣ������Կո������

public class No_01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		String[] ary=string.split(" ");
		System.out.print(ary[ary.length-1].length());

	}

}
