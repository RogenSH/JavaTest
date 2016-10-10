package org.shu.Java_sort;

import java.awt.print.Printable;
import java.util.Scanner;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		// 排序算法
		int array[] = {1,54,6,3,78,34,12,45,56,6 };
		
		Base_sort.print(array);
		
		// 插入排序:直接插入
		InsertSort insertSort = new InsertSort(array);
		insertSort.print(array);
		insertSort.print(insertSort.sort_an());
			
		//插入排序:希尔排序（最小增量排序）
		ShellSort shellSort=new ShellSort(array);
//		shellSort.print(shellSort.sort_an());
		
		//选择排序：简单排序
		SelectSort selectSort=new SelectSort(array);
//		selectSort.print(selectSort.sort());
		
		//选择排序：堆排序
//		HeapSort heapSort=new HeapSort(array);
//		heapSort.print(heapSort.sort());
		
		//快速排序
		QuickSort quickSort=new QuickSort(array);
	//	quickSort.print(quickSort.sort());
		
		//归并排序
	//	MergeSort mergeSort=new MergeSort();
		
		//基数排序
	//	RadixSort radixSort=new RadixSort();
		
		//桶排序
//		BucketSort bucketSort=new BucketSort();
		

	}

}
