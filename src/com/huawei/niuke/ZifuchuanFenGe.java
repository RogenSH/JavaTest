package com.huawei.niuke;

import java.util.Scanner;

/*
 * 连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。      
 (输入2次,每个字符串长度小于100)   
 */

public class ZifuchuanFenGe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			if (str == null || str.equals(" ")) {
				System.out.println(str);
			} else {
				StringBuffer sb = new StringBuffer(str);
				int yu = sb.length() % 8;
				for (int i = 0; i < 8 - yu; i++) {
					sb.append(0);
				}
				while (sb.length() >= 8) {
					System.out.println(sb.substring(0, 8));
					sb.delete(0, 8);
				}

			}

		}

	}
}


