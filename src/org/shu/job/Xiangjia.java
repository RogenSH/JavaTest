package org.shu.job;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;

/*
 * 设计一个算法能够完成两个字符串存储的整数进行想加操作，对非法输入则返回“error”
 * 输入为一行，包含两个字符串，逗号分隔，字符串的长度在[1,100]。输出为一行
 * 如输入 123 123 输出 246
 * 又如输入 abd 123  输出 error
 */
public class Xiangjia {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();
		String[] s = input.split(",");

		boolean isNumOne = s[0].matches("[0-9]+");
		boolean isNumTwo = s[1].matches("[0-9]+");

		if (isNumOne && isNumTwo) {
//			BigDecimal one = new BigDecimal(s[0]);
			BigInteger one =new BigInteger(s[0]);
//			BigDecimal two = new BigDecimal(s[1]);
			BigInteger two=new BigInteger(s[1]);

			System.out.println(one.add(two));
		} else {
			System.out.println("error");
		}

	}
}
