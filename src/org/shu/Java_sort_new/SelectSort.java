package org.shu.Java_sort_new;

/* ѡ������
 * 
 * ԭ��ÿ��ѡ����������С�����������е�һ�������н���
 * (һ��ѭ���Աȣ�������С�����±꣬ѭ���������ٽ��������һλ���н���)
 * 
 * ʱ�临�Ӷȣ�O(n^2)
 * 
 * �ռ临�Ӷȣ�
 * 
 * �ȶ��ԣ��ȶ�
 */

public class SelectSort {
	public static void main(String[] args) {
		// int[] nums={ 9, 4, 51, 8, 5, 6, 84, 14 };
		int[] nums = generateArrays(10);
		printArrays(nums);
		selectSort(nums);
		printArrays(nums);
	}

	private static void selectSort(int[] nums) {
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			temp = nums[i];
			for (int j = i+1; j < nums.length; j++) {
				if (nums[j] < temp) {
					nums[i]=nums[j];
					nums[j]=temp;
					temp=nums[i];	
				}
			}
		}
	}

	public static void selection_sort(int[] arr) {
		int i, j, min, temp, len = arr.length;
		for (i = 0; i < len - 1; i++) {
			min = i;
			for (j = i + 1; j < len; j++) {
				if (arr[min] > arr[j])
					min = j;
			}
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

	// ---------------

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