package org.shu.Java_sort;

import java.awt.print.Printable;
import java.util.Scanner;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		// �����㷨
		int array[] = {1,54,6,3,78,34,12,45,56,6 };
		
		Base_sort.print(array);
		
		// ��������:ֱ�Ӳ���
		InsertSort insertSort = new InsertSort(array);
		insertSort.print(array);
		insertSort.print(insertSort.sort_an());
			
		//��������:ϣ��������С��������
		ShellSort shellSort=new ShellSort(array);
//		shellSort.print(shellSort.sort_an());
		
		//ѡ�����򣺼�����
		SelectSort selectSort=new SelectSort(array);
//		selectSort.print(selectSort.sort());
		
		//ѡ�����򣺶�����
//		HeapSort heapSort=new HeapSort(array);
//		heapSort.print(heapSort.sort());
		
		//��������
		QuickSort quickSort=new QuickSort(array);
	//	quickSort.print(quickSort.sort());
		
		//�鲢����
	//	MergeSort mergeSort=new MergeSort();
		
		//��������
	//	RadixSort radixSort=new RadixSort();
		
		//Ͱ����
//		BucketSort bucketSort=new BucketSort();
		

	}

}
