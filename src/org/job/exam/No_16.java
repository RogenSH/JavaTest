package org.job.exam;

/*
 * 您的输入金额为:128.32元,可以被兑换为:1个100元,1个20元,1个5元,1个2元,1个1元,1个2角,1个1角,1个2分,
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
			System.out.println("请输入正确的金额.");
		}
		int unSplitMoneyCents = (int) (unSplitMoney * 100);
		int[] splitArray = { 100 * 100, 50 * 100, 20 * 100, 10 * 100, 5 * 100,
				2 * 100, 1 * 100, 5 * 10, 2 * 10, 1 * 10, 5, 2, 1 };
		String[] splitArrayName = { "100元", "50元", "20元", "10元", "5元", "2元",
				"1元", "5角", "2角", "1角", "5分", "2分", "1分" };
		System.out.println("您的输入金额为:" + unSplitMoney + "元,可以被兑换为:");
		for (int i = 0; i < splitArray.length && unSplitMoneyCents > 0; i++) {
			if (unSplitMoneyCents >= splitArray[i]) {
				System.out.print(unSplitMoneyCents / splitArray[i] + "个"
						+ splitArrayName[i] + ",");
				unSplitMoneyCents = unSplitMoneyCents % splitArray[i];
			}
		}
	}

}