package com.huawei.niuke;

import java.util.Scanner;

//计算字符串最后一个单词的长度，单词以空格隔开。

public class LengthOfLastWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		String[] ary=string.split(" ");
		System.out.print(ary[ary.length-1].length());

	}

}
