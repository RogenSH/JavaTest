package org.shu.Java_sort_new;

import java.util.ArrayList;
import java.util.List;

/* ��������
 * 
 * ԭ��
 * ��Ҫ�����һ�����У�����ǰ��(n-1)�����Ѿ����ź���ģ�
 * ����Ҫ�ѵ�n�����嵽ǰ����������У�ʹ����n����Ҳ���ź���ġ�
 * ��˷���ѭ����ֱ��ȫ���ź�˳��
 * (�ӵڶ�������ʼ����ȡ����Ĭ�������ǰ��������ģ����ó�������ͨ���Ƚϲ��뵽�����������ȷλ���ϡ�)
 * 
 * ʱ�临�Ӷȣ�o(n2)
 * 
 * �ռ临�Ӷȣ�o(1)
 * 
 * �ȶ��ԣ��ȶ�
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
////			//37-44��������
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
