package org.job.exam;

/*
 * 
 * 
 */

import java.util.Scanner;

public class No_14 {
	public static void main(String[] args) {
		String str = "abcddcc";
		String result = getPalindrome(str);
		System.out.println(result);

	}

	/**
	 * �ж�һ���ַ������ĳһ���������㿪ʼ��������չ���Ƿ��ǻ��Ĵ������򷵻ظ��Ӵ�
	 * 
	 * @param ch
	 * @param i
	 * @param j
	 * @return
	 */
	public static String getEvery(char[] ch, int i, int j) {
		int length = ch.length;
		while (i >= 0 && j <= length - 1 && ch[i] == ch[j]) {
			i--;
			j++;
		}
		return String.valueOf(ch).substring(i + 1, j);// ��������ch.toString()������������صĲ����ַ������Ӧ���ַ���������һ���ڴ��ַ��
		// �Ҵ˴�������ǰ��߽��˳���������ֵ�����˳���Ӧ�ý�ij��ֵ���ˣ�����sub�����ˡ�
	}

	/**
	 * ����ԭ���飬��ȡ����Ļ����Ӵ�
	 * 
	 * @param s
	 * @return
	 */
	public static String getPalindrome(String s) {
		char[] ch = s.toCharArray();
		String str = " ";
		String re = "";
		for (int i = 0; i < ch.length; i++) {
			re = getEvery(ch, i, i); // ����һ���ַ�Ϊ����Ҳ���ǻ��Ĵ�Ϊ����ʱ
			if (re.length() > str.length()) {
				str = re;
			}
			re = getEvery(ch, i, i + 1); // ���Ե�ǰ������һ���ַ�Ϊ���ģ�Ҳ���ǻ��Ĵ�Ϊż��ʱ
			if (re.length() > str.length()) {
				str = re;
			}
		}
		return str;
	}
}
