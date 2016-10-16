package org.shu.Java_sort_new;

import java.util.ArrayList;
import java.util.List;

/* 插入排序：
 * 
 * 原理：
 * 在要排序的一组数中，假设前面(n-1)个数已经是排好序的，
 * 现在要把第n个数插到前面的有序数中，使得这n个数也是排好序的。
 * 如此反复循环，直到全部排好顺序。
 * (从第二个数开始轮流取数，默认这个数前面是有序的，将拿出来的数通过比较插入到有序数组的正确位置上。)
 * 
 * 时间复杂度：o(n2)
 * 
 * 空间复杂度：o(1)
 * 
 * 稳定性：稳定
 */

public class InsertSort {

	public static void main(String[] args) {
//		int[] arrays = { 9, 4, 51, 8, 5, 6, 84, 14 };
	 	int[] arrays=generateArrays(10);
    	printArrays(arrays);
    	sort(arrays);
    	printArrays(arrays);
	}

	public static void sort(int[] arr)
	{
		for (int i = 1; i < arr.length; i++ ) {
			int temp = arr[i];
			for (int j = i - 1; j >= 0 && arr[j] > temp; j-- ) {
				arr[j + 1] = arr[j];
				arr[j] = temp;
			}
		}
	}
	
//	private static void sort(int[] arrays) {
//		int temp = 0;
//		for (int i = 1; i < arrays.length; i++) {
//			int j = i - 1;
//			temp = arrays[i];
//
//			for (; j >= 0; j--) {
//				if (arrays[j] > temp) {
//					arrays[j + 1] = arrays[j];
//				}else{
//					break;					
//				}
//			}
//			arrays[j+1] = temp;
//			
////			//37-44代码修正
////			for(;j>=0&&arrays[j]>temp;j--){
////				arrays[j + 1] = arrays[j];
////			}	
////			arrays[j + 1] = temp;
//		}
//	}

	
	
	private static int[] generateArrays(int length) {
		int[] nums = new int[length];
		for(int i=0;i<length;i++){
	    	nums[i]=(int)(Math.random()*100);
	    	}	
		return nums;
	}

	private static void printArrays(int[] nums) {
		for(int i:nums){
	    	System.out.print(i+" ");
	    	}  	
		System.out.println();
	}
    
}
