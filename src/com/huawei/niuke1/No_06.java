package com.huawei.niuke1;

/*
 * ����:����һ�������������մ�С�����˳����������������������ӣ���180����������Ϊ2 2 3 3 5 ��
 * ���һ��������ҲҪ�пո�
 ��ϸ������
 �����ӿ�˵���� public String getResult(long ulDataInput)
 ��������� long ulDataInput�������������
 ����ֵ��  String
 */
import java.util.Scanner;

public class No_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long num = sc.nextLong();
		if (num <= 1) {
			System.out.println("������һ������2��������");
		}
		int i = 2;
		while (num > 1) {
			if (num % i == 0) {
				System.out.print(i+" ");
				num=num/i;
			}else{
				i++;
			}
		}
	}

}