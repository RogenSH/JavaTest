package org.job.exam;

/*
 * �ε� 
 * 
 * ����һ��������n����n��ĩβ�ж��ٸ�0��
 * ���磺n=10��n��=3628800�����Դ�Ϊ2
 * ����Ϊһ�У�n��1=<n=<1000��
 * ���룺10
 * �����2
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
