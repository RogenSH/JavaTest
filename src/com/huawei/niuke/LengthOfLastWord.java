package com.huawei.niuke;

import java.util.Scanner;

//�����ַ������һ�����ʵĳ��ȣ������Կո������

public class LengthOfLastWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		String[] ary=string.split(" ");
		System.out.print(ary[ary.length-1].length());

	}

}
