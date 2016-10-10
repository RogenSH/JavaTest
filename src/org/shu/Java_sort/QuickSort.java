package org.shu.Java_sort;

public class QuickSort extends Base_sort {

	// int array[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62,
	// 99,
	// 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };

	public QuickSort(int[] array) {
		super(array);
	}
	
	//import java.util.Scanner;
	//public class Main {
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			String str = sc.nextLine();
//			String[] num = str.split(" ");
//			int[] n = new int[num.length];
//			for (int i = 0; i < num.length; i++) {
//				n[i] = Integer.valueOf(num[i]);
//			}
//			sort(n, 0, n.length - 1);
//			for(int i:n){
//				System.out.print(i+" ");
//			}
	//
//		}
	//
//	private static void sort(int[] n, int first, int last) {
//		if (first >= last)
//			return;
//		int left = first;
//		int right = last;
//		int temp = n[first];// 数组的第一个作为中轴
//		while (left < right) {
//			while (temp < n[right] && left < right) {
//				right--;
//			}
//			n[left] = n[right];// 比中轴小的记录移到低端
//			while (temp > n[left] && left < right) {
//				left++;
//			}
//			n[right] = n[left];// 比中轴大的记录移到高端
//		}
//		int middle = left;// 跳出first<last循环时表示first=last，即为中轴位置
//		n[middle] = temp;
//		sort(n, middle + 1, last);// 对低字表进行递归排序
//		sort(n, first, middle - 1);// 对高字表进行递归排序
//	}
	
	@Override
	public int[] sort() {
		quick(array);
		return array;
	}
	
	public void quick(int[] array) {

		if (array.length > 0) { // 查看数组是否为空

			_quickSort(array, 0, array.length - 1);
		}

	}

	public void _quickSort(int[] list, int low, int high) {

		if (low < high) {

			int middle = getMiddle(list, low, high); // 将list数组进行一分为二

			_quickSort(list, low, middle - 1); // 对低字表进行递归排序

			_quickSort(list, middle + 1, high); // 对高字表进行递归排序

		}

	}

	public int getMiddle(int[] list, int low, int high) {

		int tmp = list[low]; // 数组的第一个作为中轴

		while (low < high) {

			while (low < high && list[high] >= tmp) {
				high--;
			}
			list[low] = list[high]; // 比中轴小的记录移到低端
			while (low < high && list[low] <= tmp) {
				low++;
			}
			list[high] = list[low]; // 比中轴大的记录移到高端
		}

		list[low] = tmp; // 中轴记录到尾

		return low; // 返回中轴的位置

	}

}



	