package org.job.exam;

/*
 * 
 * 
 */

import java.math.BigInteger;

public class No_15 {
	public static void main(String[] args) {
		int n = 2;
		BigInteger conf = Count(n);
		System.out.printf(getNumber(conf));
	}

	private static BigInteger Count(int n) {
		// n非法判断代码省略
		BigInteger t = new BigInteger(String.valueOf(1));
		for (int i = 1; i <= n; i++) {
			t = t.multiply(new BigInteger(String.valueOf(i)));
		}
		return t;
	}

	private static String getNumber(BigInteger arg) {
		// arg非法判断代码省略
		String t = String.valueOf(arg);
		char[] c = t.toCharArray();
		for (int i = c.length - 1; i >= 0; i--) {
			if (!(c[i] + "").equals("0")) {
				return c[i] + "";
			}
		}
		return "this is no need data";
	}
}