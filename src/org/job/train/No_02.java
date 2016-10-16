package org.job.train;
/*
 * 　　有两个有序的整型数组a和b（没有重复元素），他们的长度分别为lenA和lenB，求出他们的共同元素。 
 例如：a = 0,1,3,5,7,9,11；b = 2,3,4,7,11； 
 它们的交集为{3，7，11}。
 */
public class No_02 {

/*
 * 	 二路归并法
 *  对于数组a，b分别以i,j从头遍历数组。
	如果当前位置的a[i]等于b[j]，则这两个数是两个数组的一个交集，记录下来并继续遍历；
	如果a[i]大于b[j]，则继续遍历数组b，否则遍历数组a。
 */	
	int ComNun_Merge(int a[], int lenA, int b[], int lenB, int comlst[]) {
		int i = 0, j = 0, k = 0;

		while (i < lenA && j < lenB) {
			if (a[i] == b[j]) {
				comlst[k++] = a[i];
				i++;
				j++;
			} else if (a[i] > b[j]) {
				j++;
			} else
				i++;
		}
		return k;
	}
	
	/*哈希表查找法，此方法可无序，但要求元素为正数
	 * 循环遍历其中的一个数组，并将元素存放到哈希表中，然后遍历另一个数组，并进行hash查询。如果存在，则是两个数组的一个交集，记录下来，继续查询直到结束。 
	 */
	int ComNum_Hash(int a[],int lenA,int b[],int lenB,int comlst[])
	{
	    int hashTb[] = {0},i,j,k=0;

	    for(i = 0; i < lenA; i++)
	        hashTb[a[i]] = 1;

	    for(j = 0; j < lenB; j++)
	    {
	        if(hashTb[b[j]] == 1)
	            comlst[k++] = b[j];
	    }

	    return k;
	}
	
	
	/*
	 * 两数组长度相差较大.在这种情况下，可以考虑使用二分查找法。
	 * 先遍历长度较小的数组，然后将这个元素值在在长度较大的数组中进行二分查找。 
	 */

	int ComNum_Binary(int a[],int lenA,int b[],int lenB,int comlst[])
	{
	    int i,j,k=0;

	    for(i = 0; i < lenA; i++)
	    {
	        int l=0,r=lenB-1,mid;

	        while(l <= r)
	        {
	            mid = (l+r)/2;

	            if( a[i] < b[mid] )
	                r = mid -1;
	            else if( a[i] > b[mid] )
	                l = mid +1;
	            else
	            {
	                comlst[k++] = a[i];
	                break;
	            }
	        }
	    }
	    return k;
	}
}
