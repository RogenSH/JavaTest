package com.huawei.niuke;

import java.util.Scanner;

/*
 * ���������ַ������밴����Ϊ8���ÿ���ַ�����������µ��ַ������飻
 ���Ȳ���8���������ַ������ں��油����0�����ַ���������      
 (����2��,ÿ���ַ�������С��100)   
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


