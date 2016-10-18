package org.shu.Java_sort_new;

/* ð������(�Ż�����β�����򣺲�ͬ����������ʱ����˫���������н�������
 * 
 * ԭ�����ظ����߷ù�Ҫ��������У�һ�αȽ�����Ԫ�أ�������ǵ�˳�����Ͱ����ǽ���������
 * �߷����еĹ������ظ��ؽ���ֱ��û������Ҫ������Ҳ����˵�������Ѿ�������ɡ�
 * ����㷨��������������ΪԽС��Ԫ�ػᾭ�ɽ������������������еĶ��ˡ�
 * 
 * ʱ�临�Ӷȣ�O(n^2)
 * 
 * �ռ临�Ӷȣ�O(1)
 * 
 * �ȶ��ԣ��ȶ�
 * 
 * ��ע1��ð�����������������ӵ����ȵ�����ʱ�䣬���������㷨����Ҫ�Ľ�������ȴ�ܴ�ز�ͬ��
 * ����õ������ð��������Ҫ O(n^2)�ν���������������ֻҪ���O(n)������
 * 
 * ��ע2��������(2,3,4,5,1)Ϊ������β������ֻ��Ҫ����һ�����оͿ���������򣬵����ʹ��ð����������Ҫ�ĴΡ�
 * �������������е�״̬�£���β��������ð�������Ч�ʶ��ܲ��
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