package com.huawei.niuke1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * �����ü����������N��1��1000֮������������N��1000����
 * ���������ظ������֣�ֻ����һ������������ͬ����ȥ������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�
 * Ȼ���ٰ���Щ����С�������򣬰����źõ�˳��ȥ��ͬѧ�����顣
 * ����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ�����
 * 
 Input Param 
 n               ����������ĸ���     
 inputArray      n�����������ɵ����� 

 Return Value
 OutputArray    ����������������

 ע������������֤�����������ȷ�ԣ�������������֤������������ֹһ�顣
 */
public class No_03 {

	private static int[] inputs;
	private static int len;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			len = sc.nextInt();
			inputs = new int[len];
			for(int i=0;i<len;i++){
				inputs[i]=sc.nextInt();
			}		
		Arrays.sort(inputs);
		System.out.println(inputs[0]);
		for(int i=1;i<len;i++){
			if(inputs[i]!=inputs[i-1]){
				System.out.println(inputs[i]);
			}
		}
		}
	}
}


/*
 *public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
 
        while(sr.hasNext()) {
            int n = sr.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = sr.nextInt();
            }
            int[] c = qucong(a);
 
            for(int i = 0; i < 1000; i++) {
                if(c[i] == 1) {
                    System.out.println(i);
                }
            }
        }
    }
 
    public static int[] qucong(int[] a) {
        int[] b = new int[1000];
        for(int i = 0; i < 1000; i++) {
            b[i] = 0;
        }
        for(int i = 0; i < a.length; i++) {
            b[a[i]] = 1;
        }
        return b;
    }
} 
*/