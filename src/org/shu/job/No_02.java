package org.shu.job;

import java.util.Scanner;

/*华为
 * 输入一组大于等于0的整数，根据从小到大的顺序排序后输出，排序后有连续数时
 */
public class No_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String[] s_num = in.split(",");
		int[] num = new int[s_num.length];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(s_num[i]);
		}

		int temp;
		for (int i = 1; i < num.length; i++) {
			for (int j = 0; j < num.length - i; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}

		}
		int[] result = new int[num.length];
		result[0] = num[0];
		int i = 1;
		int j = 1;
		while (i < num.length) {
			if ((num[i] - num[i - 1]) == 1) {
				while ((num[i] - num[i - 1]) == 1) {
					i++;
					if (i >= num.length - 1)
						break;
				}
				if (i != num.length - 1)
					i--;
			}
			result[j++] = num[i++];

		}

		for (int m = 0; m < j - 1; m++) {
			System.out.print(result[m] + " ");
		}
		System.out.print(result[j - 1]);
		sc.close();

	}

}