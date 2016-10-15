package org.shu.job;

/*    2/1,3/2,5/3,8/5...求前N项和，结果四舍五入。
 * 
 * 
 */

import java.util.Scanner;


public class No_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		double fenzi = 2;
		double fenmu = 1;
		double temp = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + fenzi / fenmu;
			temp = fenmu;
			fenmu = fenzi;
			fenzi = temp + fenmu;
		}
		
		System.out.println(Math.round(sum));
	}

}
