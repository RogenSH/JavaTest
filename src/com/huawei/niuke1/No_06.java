package com.huawei.niuke1;

/*
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）
 * 最后一个数后面也要有空格
 详细描述：
 函数接口说明： public String getResult(long ulDataInput)
 输入参数： long ulDataInput：输入的正整数
 返回值：  String
 */
import java.util.Scanner;

public class No_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long num = sc.nextLong();
		if (num <= 1) {
			System.out.println("请输入一个大于2的正整数");
		}
		int i = 2;
		while (num > 1) {
			if (num % i == 0) {
				System.out.print(i+" ");
				num=num/i;
			}else{
				i++;
			}
		}
	}

}