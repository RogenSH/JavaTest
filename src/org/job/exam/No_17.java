package org.job.exam;

import java.util.Scanner;

/*
 * aaabbbcdc 
 * abcdc
 * 
 */

public class No_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println(condense(str));

	}

	// public static String condense(String str) {
	// char[] c = str.toCharArray();
	// StringBuilder sb = new StringBuilder();
	// // char c1=c[0];
	// for (int i = 0; i < c.length; i++) {
	// while( i < c.length-1&&c[i+1]==c[i]){
	// i+=1;
	// }
	// sb.append(c[i]);
	// }
	// return sb.toString();
	// }

	 public static String condense(String str) {
	        char[] c = str.toCharArray();
	        StringBuilder res = new StringBuilder();
	        int count = 1;// 记录重复的次数
	        char c1;
	        int length = c.length;
	        for (int i = 0; i < length; i++) {
	            c1 = c[i];
	            if (i < length - 1) {
	                if (c[i + 1] == c[i]) {
	                    count++;
	                    if (i != length - 2) {
	                        continue;
	                    }
	                }
	                if (count > 1) {
	                    res.append(c1);
	                    count = 1;//上一次重复字母统计结束，计数器归为初始值
	                } else {
	                    res.append(c[i]);
	                }
	            } else {
	                if (c[i] != c[i - 1]) {
	                    res.append(c[i]);
	                }
	            }
	        }
	        return res.toString();
	    }
}
