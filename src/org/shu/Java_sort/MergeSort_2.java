package org.shu.Java_sort;

/*
 * 归并排序的迭代算法
 * 
 */

import java.util.Scanner;


public class MergeSort_2 {
//归并两个有序数组:list[left]...list[mid]与list[mid+1]...list[right].归并后的数组放置到sorted[]中
	public static void merge(int[] list,int[] sorted,int left,int mid,int right){
		int i=left;
		int j=mid+1;
		int k=i;
		while(i<=mid && j<=right){
			if(list[i]<list[j])
				sorted[k++]=list[i++];
			else
				sorted[k++]=list[j++];
		}
		while(i<=mid){
			sorted[k++]=list[i++];
		}
		while(j<=right){
			sorted[k++]=list[j++];
		}
	}
	
	//执行单编归并的函数，num为list的元素个数，sorted为归并后的数组，len=mid-left+1,为子序列的长度;
	public static void mergePass(int[] list,int[] sorted,int len){
		int i=0;
		int num=list.length;
		for(i=0;i<=num-2*len;i+=2*len){
			merge(list,sorted,i,i+len-1,i+2*len-1);
		}
		if(i+len<num){
			merge(list,sorted,i,i+len-1,num-1);
		}
		else{
			//如果此次剩余的元素不能参与归并，则复制到sorted中 (在大循环中再进行归并)
			for(int j=i;j<num;j++){
				sorted[j]=list[j];
			}
		}
	}
	//从1开始，归并两个已排序的子序列
	public static void mergeSort(int[] list){
		
		int[] sorted=new int[list.length];
		int len=1;
		while(len<list.length){
			//list是待排序序列，sorted是临时存储空间，len是子序列的长度（从1开始到list.length）
			mergePass(list,sorted,len);
			len*=2;
			//sorted是待排序序列，list是临时存储空间
			mergePass(sorted,list,len);
			len*=2;
		}
	}
	
	public static void main(String[] args) {
		int a[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62,
				99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };
//		int[] b={1,4,7,2,3,5,6};
//		int[] c=new int[b.length];
//		merge(b,c,0,2,b.length-1);
//		for(int i:c){
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		for(int i:b){
//			System.out.print(i+" ");
//		}
		mergeSort(a);
		for(int i:a){
			System.out.print(i+" ");
		}
	}

}