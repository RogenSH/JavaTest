package org.shu.Java_sort;

/*
 * �鲢����ĵ����㷨
 * 
 */

import java.util.Scanner;


public class MergeSort_2 {
//�鲢������������:list[left]...list[mid]��list[mid+1]...list[right].�鲢���������õ�sorted[]��
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
	
	//ִ�е���鲢�ĺ�����numΪlist��Ԫ�ظ�����sortedΪ�鲢������飬len=mid-left+1,Ϊ�����еĳ���;
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
			//����˴�ʣ���Ԫ�ز��ܲ���鲢�����Ƶ�sorted�� (�ڴ�ѭ�����ٽ��й鲢)
			for(int j=i;j<num;j++){
				sorted[j]=list[j];
			}
		}
	}
	//��1��ʼ���鲢�����������������
	public static void mergeSort(int[] list){
		
		int[] sorted=new int[list.length];
		int len=1;
		while(len<list.length){
			//list�Ǵ��������У�sorted����ʱ�洢�ռ䣬len�������еĳ��ȣ���1��ʼ��list.length��
			mergePass(list,sorted,len);
			len*=2;
			//sorted�Ǵ��������У�list����ʱ�洢�ռ�
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