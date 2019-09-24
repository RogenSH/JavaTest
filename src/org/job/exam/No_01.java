package org.job.exam;
//��Ϊ 123
import java.util.Scanner;

public class No_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] a = new int[str.length()];
		for (int i = 0; i < a.length; i++) {
			if (Integer.valueOf(str.charAt(i) + "") == 5) {
				a[i] = 0;
			} else if (Integer.valueOf(str.charAt(i) + "") == 0) {
				a[i] = 5;
			} else {
				a[i] = 10 - Integer.valueOf(str.charAt(i) + "");
			}
		}
		for (int i : a) {
			System.out.print(i);
		}

	}

}

// public class EncodeInt {
// static {
// x = 1;
// }
// static int x, y;
//
// public static void main(String[] args) {
// // TODO Auto-generated method stub
// x--;
// method();
// System.out.println(x+y+ ++x);
//
// }
// static void method(){
// y=x++ + ++x;
// }
//
// }
