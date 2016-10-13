package com.huawei.niuke1;

/*
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 * 
 * 输入描述:将一个英文语句以单词为单位逆序排放。
 * 输出描述:得到逆序的句子
 * 
 * 输入例子:I am a boy
 * 输出例子:boy a am I
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