package com.huawei.niuke1;

import java.util.Scanner;

/*�����ַ�����
 * д��һ�����򣬽���һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���
 * Ȼ����������ַ����к��и��ַ��ĸ����������ִ�Сд��
 */

public class NumOfLine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<string.length()-1;i++){
			
			String s=String.valueOf(string.charAt(i));
			if(str.equalsIgnoreCase(s)){
				count++;
			}
		}
		System.out.println(count);
		
	}

}
