package org.shu.Java_sort_new;

/* 冒泡排序(优化→鸡尾酒排序：不同处在于排序时是以双向在序列中进行排序。
 * 
 * 原理：它重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。
 * 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
 * 这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
 * 
 * 时间复杂度：O(n^2)
 * 
 * 空间复杂度：O(1)
 * 
 * 稳定性：稳定
 * 
 * 备注1：冒泡排序是与插入排序拥有相等的运行时间，但是两种算法在需要的交换次数却很大地不同。
 * 在最好的情况，冒泡排序需要 O(n^2)次交换，而插入排序只要最多O(n)交换。
 * 
 * 备注2：以序列(2,3,4,5,1)为例，鸡尾酒排序只需要访问一次序列就可以完成排序，但如果使用冒泡排序则需要四次。
 * 但是在乱数序列的状态下，鸡尾酒排序与冒泡排序的效率都很差劲。
 */


public class BubbleSort {
    public static void main(String[] args) {
    //	int[] nums={ 9, 4, 51, 8, 5, 6, 84, 14 };
    	int[] nums=generateArrays(10);
    	printArrays(nums);
    	System.out.println();
    	System.out.println();
    	bubbleSort(nums);
    	System.out.println();
    	System.out.println();
    	printArrays(nums);
    }

	private static void bubbleSort(int[] nums) {
		int i,j,temp,len=nums.length;
		for(i=0;i<len;i++){
			for(j=0;j<len-i-1;j++){
				if(nums[j]>nums[j+1]){
					temp=nums[j+1];
					nums[j+1]=nums[j];
					nums[j]=temp;
				}
			}
			printArrays(nums);
		}
	}
	
	
	public static void cocktail_sort(int[] arr) {	
		int i, left = 0, right = arr.length - 1;
		int temp;
		while (left < right) {
			for (i = left; i < right; i++)
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			right--;
			for (i = right; i > left; i--)
				if (arr[i - 1] > arr[i]) {
					temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
				}
			left++;
		}
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