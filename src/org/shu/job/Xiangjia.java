package org.shu.job;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.math.BigDecimal;
import java.util.Scanner;
/*
 * ���һ���㷨�ܹ���������ַ����洢������������Ӳ������ԷǷ������򷵻ء�error��
 * ����Ϊһ�У����������ַ��������ŷָ����ַ����ĳ�����[1,100]�����Ϊһ��
 * ������ 123 123 ��� 246
 * �������� abd 123  ��� error
 */
public class Xiangjia {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();
		String[] s = input.split(",");

		boolean isNumOne = s[0].matches("[0-9]+");
		boolean isNumTwo = s[1].matches("[0-9]+");

		if (isNumOne && isNumTwo) {
			BigDecimal one = new BigDecimal(s[0]);

			BigDecimal two = new BigDecimal(s[1]);

			System.out.println(one.add(two));
		} else {
			System.out.println("error");
		}

	}
}
