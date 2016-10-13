package com.huawei.niuke1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * 他先用计算机生成了N个1到1000之间的随机整数（N≤1000），
 * 对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。
 * 然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。
 * 请你协助明明完成“去重”与“排序”的工作。
 * 
 Input Param 
 n               输入随机数的个数     
 inputArray      n个随机整数组成的数组 

 Return Value
 OutputArray    输出处理后的随机整数

 注：测试用例保证输入参数的正确性，答题者无需验证。测试用例不止一组。
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