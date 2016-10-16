package org.shu.Java_sort_new;

/* ϣ������
 * 
 * ԭ���Ƚ�Ҫ�����һ������ĳ������d(n/2)�ֳ������飬ÿ���м�¼�±�
 * ���Ƚ�Ҫ�����һ������ĳ������d(n/2)�ֳ������飬��ÿһ��ʹ��ֱ�Ӳ�������
 * Ȼ���ٽ���������Ϊd/2�����ظ�����ֱ����������1ʱ���������һ��ֱ�Ӳ�������
 * 
 * ʱ�临�Ӷȣ�
 * 	ƽ��ʱ�䣺O(nlogn) 
 *	����龰:O(n^s)  1<s<2   s����ѡ����
 * 
 * �ռ临�Ӷȣ�O(1)
 * 
 * �ȶ��ԣ����ȶ�
 * 
 */

public class ___ShellSort {
	public static void main(String[] args) {
		// int[] arrays = { 9, 4, 51, 8, 5, 6, 84, 14 };
		int[] arrays = generateArrays(10);
		printArrays(arrays);
		shellsort(arrays);
		printArrays(arrays);
	}

	private static void shellsort(int[] num) {
	
		double d1 = num.length;
		int temp = 0;

		while (true) {
			d1 = Math.ceil(d1 / 2);
			int d = (int) d1;
			// Ϊʲô����Ῠסѭ����	
			//int d=(int) Math.ceil(d1/2);
			for (int x = 0; x < d; x++) {

				for (int i = x + d; i < num.length; i += d) {
					int j = i - d;
					temp = num[i];
					for (; j >= 0 && temp < num[j]; j -= d) {
						num[j + d] = num[j];
					}
					num[j + d] = temp;
				}
//������룺				
//				for(int i=x+d;i<num.length;i+=d){
//					temp=num[i];
//					for(int j=i-d;j>=0&&temp<num[j];j-=d){
//						num[j+d]=num[j];
//						num[j+d-1]=temp;
//					}
//				}
			}

			if (d == 1) {
				break;
			}

		}
	

	}
	//wiki
	// public static void shell_sort(int[] arr) {
	// int gap = 1, i, j, len = arr.length;
	// int temp;
	// while (gap < len / 3)
	// gap = gap * 3 + 1; // <O(n^(3/2)) by Knuth,1973>: 1, 4, 13, 40, 121,
	// // ...
	// for (; gap > 0; gap /= 3)
	// for (i = gap; i < len; i++) {
	// temp = arr[i];
	// for (j = i - gap; j >= 0 && arr[j] > temp; j = j - gap)
	// arr[j + gap] = arr[j];
	// arr[j + gap] = temp;
	// }
	//
	// }

	// ----------------
	private static int[] generateArrays(int length) {
		int[] nums = new int[length];
		for (int i = 0; i < length; i++) {
			nums[i] = (int) (Math.random() * 100);
		}
		return nums;
	}

	private static void printArrays(int[] nums) {
		for (int i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}