package com.huawei.niuke1;

/*
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 * 输入例子:5
 * 输出例子:2
 */
import java.util.*;

public class IntToBi_NumOf1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
	//	System.out.println("integer "+Integer.toString(n, 2));
		StringBuilder sb=new StringBuilder();
		while(n>=1){
			int temp1=n%2;
			int temp2=(n-temp1)/2;
			sb.append(temp1);
			n=temp2;
		}
//		System.out.println(sb.reverse().toString());


	
		int count=0;
		for(int i=0;i<sb.length();i++){
			if(sb.toString().charAt(i)=='1'){
				count++;
			}
		}
		System.out.println(count);
	}
}
