package org.shu.Java_sort;

public class SelectSort extends Base_sort {

	/* ������:
	 * ��Ҫ�����һ�����У�ѡ����С��һ�������һ��λ�õ���������
	 * Ȼ����ʣ�µ�������������С����ڶ���λ�õ������������ѭ���������ڶ����������һ�����Ƚ�Ϊֹ��
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
