package org.job.train;
/*
 * �����������������������a��b��û���ظ�Ԫ�أ������ǵĳ��ȷֱ�ΪlenA��lenB��������ǵĹ�ͬԪ�ء� 
 ���磺a = 0,1,3,5,7,9,11��b = 2,3,4,7,11�� 
 ���ǵĽ���Ϊ{3��7��11}��
 */
public class No_02 {

/*
 * 	 ��·�鲢��
 *  ��������a��b�ֱ���i,j��ͷ�������顣
	�����ǰλ�õ�a[i]����b[j]�����������������������һ����������¼����������������
	���a[i]����b[j]���������������b�������������a��
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
	
	/*��ϣ����ҷ����˷��������򣬵�Ҫ��Ԫ��Ϊ����
	 * ѭ���������е�һ�����飬����Ԫ�ش�ŵ���ϣ���У�Ȼ�������һ�����飬������hash��ѯ��������ڣ��������������һ����������¼������������ѯֱ�������� 
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
	 * �����鳤�����ϴ�.����������£����Կ���ʹ�ö��ֲ��ҷ���
	 * �ȱ������Ƚ�С�����飬Ȼ�����Ԫ��ֵ���ڳ��Ƚϴ�������н��ж��ֲ��ҡ� 
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
