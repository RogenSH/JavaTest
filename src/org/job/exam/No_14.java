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
	 * 判断一个字符数组从某一个或两个点开始向两端拓展，是否是回文串，是则返回该子串
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
		return String.valueOf(ch).substring(i + 1, j);// 不可以用ch.toString()，这个方法返回的不是字符数组对应的字符串，而是一个内存地址，
		// 且此处无论是前面边界退出还是两端值不等退出都应该将ij的值回退，所以sub这两端。
	}

	/**
	 * 遍历原数组，提取出最长的回文子串
	 * 
	 * @param s
	 * @return
	 */
	public static String getPalindrome(String s) {
		char[] ch = s.toCharArray();
		String str = " ";
		String re = "";
		for (int i = 0; i < ch.length; i++) {
			re = getEvery(ch, i, i); // 当以一个字符为中轴也就是回文串为奇数时
			if (re.length() > str.length()) {
				str = re;
			}
			re = getEvery(ch, i, i + 1); // 当以当前和他后一个字符为轴心，也就是回文串为偶数时
			if (re.length() > str.length()) {
				str = re;
			}
		}
		return str;
	}
}
