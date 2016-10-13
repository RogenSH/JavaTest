package org.shu.Java_sort;

import java.util.Arrays;

public class MergeSort {
	int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};  
	  
	public  MergeSort(){  
	    sort(a,0,a.length-1);  
	    for(int i=0;i<a.length;i++)  
	       System.out.print(a[i]+" ");  
	}  
	  
	public void sort(int[] data, int left, int right) {  
	    if(left<right){  
	        //�ҳ��м�����  
	        int center=(left+right)/2;  
	        //�����������еݹ�  
	        sort(data,left,center);  
	        //���ұ�������еݹ�  
	        sort(data,center+1,right);  
	        //�ϲ�  
	        merge(data,left,center,right);         
	    }  
	  
	}  
	  
	public void merge(int[] data, int left, int center, int right) {  

		int [] tmpArr=new int[data.length];  
	    int mid=center+1;  
	    //third��¼�м����������  
	    int third=left;  
	    int tmp=left;  
	    while(left<=center&&mid<=right){  
	        //������������ȡ����С�ķ����м�����  
	        if(data[left]<=data[mid]){  
	            tmpArr[third++]=data[left++];  
	        }else{  
	            tmpArr[third++]=data[mid++];  
	        }  
	  
	    }  
	  
	    //ʣ�ಿ�����η����м�����  
	    while(mid<=right){  
	        tmpArr[third++]=data[mid++];  
	    }  
	  
	    while(left<=center){  
	        tmpArr[third++]=data[left++];  
	    }  
	  
	    //���м������е����ݸ��ƻ�ԭ����  
	    while(tmp<=right){  
	        data[tmp]=tmpArr[tmp++];  
	    }  
	 //   System.out.println(Arrays.toString(data));  
	}  
}
