package org.shu.train;


/*
 * 猜数字游戏
 */

import java.util.Scanner;

public class No_04 {
    public static void main(String[] args) {
    	int x=(int)( Math.random()*100);
    	Scanner sc=new Scanner(System.in);
    	System.out.println(x);
    	System.out.println("请输入你猜的数字(0-100之间):");
    	long time=System.currentTimeMillis();
    	while(true){
    		int n=sc.nextInt();
      		if(n>x){
    			System.out.println("你猜的数大了，请输入一个较小的数:");
    		}else{
    			System.out.println("你猜的数小了，请输入一个较大的数:");
    		}
    		if(x==n){
    			System.out.println("恭喜你猜对了!");
    			System.out.println("你一共花了"+(System.currentTimeMillis()-time)/1000+"秒");
    			//break;
    			  System.out.println("请问还要继续吗？(yes)");
                  sc = new Scanner(System.in);
                  String str = sc.nextLine();
                  if ("yes".equals(str)) {
                          // 重写赋值随机数
                          x = (int) (Math.random() * 100) + 1;
                  } else {
                          break;
                  }
    		}
  
    		
    	}
    }
 
}