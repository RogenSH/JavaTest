package org.job.exam;

/*
 * ����������Ϊ:128.32Ԫ,���Ա��һ�Ϊ:1��100Ԫ,1��20Ԫ,1��5Ԫ,1��2Ԫ,1��1Ԫ,1��2��,1��1��,1��2��,
 * 
 */

import java.util.Scanner;

public class No_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		splitMoney(num);
	}

	public static void splitMoney(Double unSplitMoney) {
		if (unSplitMoney <= 0) {
			System.out.println("��������ȷ�Ľ��.");
		}
		int unSplitMoneyCents = (int) (unSplitMoney * 100);
		int[] splitArray = { 100 * 100, 50 * 100, 20 * 100, 10 * 100, 5 * 100,
				2 * 100, 1 * 100, 5 * 10, 2 * 10, 1 * 10, 5, 2, 1 };
		String[] splitArrayName = { "100Ԫ", "50Ԫ", "20Ԫ", "10Ԫ", "5Ԫ", "2Ԫ",
				"1Ԫ", "5��", "2��", "1��", "5��", "2��", "1��" };
		System.out.println("����������Ϊ:" + unSplitMoney + "Ԫ,���Ա��һ�Ϊ:");
		for (int i = 0; i < splitArray.length && unSplitMoneyCents > 0; i++) {
			if (unSplitMoneyCents >= splitArray[i]) {
				System.out.print(unSplitMoneyCents / splitArray[i] + "��"
						+ splitArrayName[i] + ",");
				unSplitMoneyCents = unSplitMoneyCents % splitArray[i];
			}
		}
	}

}