package org.shu.Java_sort_new;

/* 选择排序
 * 
 * 原理：每次选择数组中最小的数与数组中第一个数进行交换
 * (一次循环对比，记下最小数的下标，循环结束后再将该数与第一位进行交换)
 * 
 * 时间复杂度：O(n^2)
 * 
 * 空间复杂度：
 * 
 * 稳定性：稳定
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