package org.shu.job;


import java.util.Scanner;




//���������޵���ֵΪ100��50��20��10��5��1Ԫ��ֽ�ң���Ҫ���N��N<=10^6�����ж�������Ϸ�ʽ����Google�����⣩
public class ZhibiZuhe {
	public static void main(String[] args) {
		System.out.println("Input the N: ");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Run1(n);  //�����������ʱ��Run1��ʱ�仨����Run2 С��n>200�󣩣�С�öࣨn>500��,  n=1000 0.025s�� n=2000  0.683s  ;n=3000  Լ5s
	//	Run2(n);  //n=1000Լ2.4s ��n=2000 Լ135s��   1��ʱ���������Ϊ�ݹ���õĴ����ٺܶ�Σ���ʽ���٣����ٸ�ѭ��  
	//	Run3(n);  //���ѷ���  ʱ����࣬ ��Ϊ�������������  n=100Ϊ5ms��  n=200ʱ134ms  ��n=500ʱ Լ19.8s
                //���ѷ����ʵ�����ѭ�����ݣ�ʱ���Ǻ�û�Ż��Ķ���滮����ʱ����� 
	}
	
//	n=1500ʱ
//	17132256 : 168ms
//	17132256 : 22945ms
//	17132256 : 23124ms

	private static void Run1(int n) {   //��̬�滮1
		long start=System.currentTimeMillis();
		int [] k={100,50,20,10,5,1};   // ���ִ�����ͬʱ�����ֵ�ļ���ʽ ����䣬�ǲ���Ҫ����new�ģ���	
		int m=Calculate1(n, k,0);		
		long end=System.currentTimeMillis();
		System.out.println(m+" : "+(end-start)+"ms");
	}

	private static int Calculate1(int n, int[] k,int i) {	
		if(n==0)
			return 1; 
		if(n<0)
			return 0;
		if(i==5)
			return 1;
		else
			return Calculate1(n-k[i],k,i)+Calculate1(n, k, i+1);   // ʱ�临�Ӷ�ΪO(n)
	}
	
	
}
