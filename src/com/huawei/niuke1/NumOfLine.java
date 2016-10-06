package com.huawei.niuke1;

import java.util.Scanner;

/*计算字符个数
 * 写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，
 * 然后输出输入字符串中含有该字符的个数。不区分大小写。
 */

public class NumOfLine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<string.length()-1;i++){
			
			String s=String.valueOf(string.charAt(i));
			if(str.equalsIgnoreCase(s)){
				count++;
			}
		}
		System.out.println(count);
		
	}

}
