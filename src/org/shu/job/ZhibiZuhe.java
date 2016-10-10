package org.shu.job;


import java.util.Scanner;




//有数量不限的面值为100，50，20，10，5，1元的纸币，问要组成N（N<=10^6）共有多少种组合方式？（Google笔试题）
public class ZhibiZuhe {
	public static void main(String[] args) {
		System.out.println("Input the N: ");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Run1(n);  //当数据增大的时，Run1的时间花销比Run2 小（n>200后），小得多（n>500）,  n=1000 0.025s； n=2000  0.683s  ;n=3000  约5s
	//	Run2(n);  //n=1000约2.4s ；n=2000 约135s；   1的时间更少是因为递归调用的次数少很多次，公式里少，还少个循环  
	//	Run3(n);  //爆搜法：  时间跟多， 因为考虑了所有情况  n=100为5ms；  n=200时134ms  ；n=500时 约19.8s
                //爆搜法，适当减少循环内容，时间是和没优化的冬天规划方法时间差不多的 
	}
	
//	n=1500时
//	17132256 : 168ms
//	17132256 : 22945ms
//	17132256 : 23124ms

	private static void Run1(int n) {   //动态规划1
		long start=System.currentTimeMillis();
		int [] k={100,50,20,10,5,1};   // 这种创建并同时赋予初值的简化形式 的语句，是不需要调用new的！；	
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
			return Calculate1(n-k[i],k,i)+Calculate1(n, k, i+1);   // 时间复杂度为O(n)
	}
	
	
}
