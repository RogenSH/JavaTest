package org.shu.Java_sort_new;

/* 
 * 
 * 原理：
 * 
 * 时间复杂度：
 * 
 * 空间复杂度：
 * 
 * 稳定性：
 */


public class Sort {
    public static void main(String[] args) {
    //	int[] nums={ 9, 4, 51, 8, 5, 6, 84, 14 };
    	int[] nums=generateArrays(10);
    	printArrays(nums);
    	
    	printArrays(nums);
    }

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