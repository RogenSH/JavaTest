package org.shu.Java_sort;

public class InsertSort {

	private int[] array;

	public InsertSort(int[] array) {
		this.array = array;
	}

	public int[] sort() {
		int temp = 0;
		
		for (int i = 1; i < array.length; i++) {
			int j=i-1;
			temp = array[i];
			for (; j >= 0; j--) {
				if (array[j] > temp) {
					array[j+1]=array[j];
				}
				else{
					array[j+1]=temp;
				}
			}
		
		}
		return array;
	}
	
	
	public int[] sort_an() {
		int temp = 0;
		
		for (int i = 1; i < array.length; i++) {
			int j=i-1;
			temp = array[i];
			for (;j>=0&&array[j] > temp;j--) {	
					array[j+1]=array[j];
			}
			array[j+1]=temp;
		}
		
		return array;
	}

	
	
	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
