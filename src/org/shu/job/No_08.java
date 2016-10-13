package org.shu.job;


/* 去哪儿
 * 给定一个英文字符串，找出字符串中首先出现的三个英文字符
 * 输入：H1a1v1e you ever gone shopping and
 * 输出：e
 */

import java.util.Scanner;

public class No_08 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String s=sc.nextLine().replaceAll(" ", "");
    	char[] array=s.toCharArray();
    	int[] in=new int[127];
//    	for(int j:in){
//    		in[j]=0;
//    	}
    	for(int i=0;i<array.length;i++){
    		in[array[i]]+=1;
    		if((int)array[i]>64&&in[array[i]]==3){
    			System.out.println(array[i]);
    			break;
    		}
    	}
    }
 
}