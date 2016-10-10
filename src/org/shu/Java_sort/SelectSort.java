package org.shu.Java_sort;

public class SelectSort extends Base_sort {

	/* 简单排序:
	 * 在要排序的一组数中，选出最小的一个数与第一个位置的数交换；
	 * 然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
	 */

	public SelectSort(int[] array) {
		super(array);
	}

	@Override
	public int[] sort() {
	       int position=0;  
	       for(int i=0;i<array.length;i++){       
	           int j=i+1;  
	           position=i;  
	           int temp=array[i];  
	           for(;j<array.length;j++){  
	              if(array[j]<temp){  
	                 temp=array[j];  
	                 position=j;  
	              }  
	           }  
	           array[position]=array[i];  
	           array[i]=temp;  
	       }  
		return array;
	}

}
