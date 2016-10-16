package org.job.exam;

/*
 * 滴滴 
 * 
 * 输入一个正整数n，求n！末尾有多少个0？
 * 比如：n=10；n！=3628800；所以答案为2
 * 输入为一行，n（1=<n=<1000）
 * 输入：10
 * 输出：2
 */
import java.util.Scanner;
public class No_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int n = Integer.parseInt(scanner.nextLine());
			int num = 0;
			for (int i = 1; i <= n; i++) {
				int j = i;
				while (j % 5 == 0) {
					num++;
					j /= 5;
				}
			}
			System.out.println(num);
		}
	}
}
