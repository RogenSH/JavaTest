package org.shu.train;


/*
 * ��������Ϸ
 */

import java.util.Scanner;

public class No_04 {
    public static void main(String[] args) {
    	int x=(int)( Math.random()*100);
    	Scanner sc=new Scanner(System.in);
    	System.out.println(x);
    	System.out.println("��������µ�����(0-100֮��):");
    	long time=System.currentTimeMillis();
    	while(true){
    		int n=sc.nextInt();
      		if(n>x){
    			System.out.println("��µ������ˣ�������һ����С����:");
    		}else{
    			System.out.println("��µ���С�ˣ�������һ���ϴ����:");
    		}
    		if(x==n){
    			System.out.println("��ϲ��¶���!");
    			System.out.println("��һ������"+(System.currentTimeMillis()-time)/1000+"��");
    			//break;
    			  System.out.println("���ʻ�Ҫ������(yes)");
                  sc = new Scanner(System.in);
                  String str = sc.nextLine();
                  if ("yes".equals(str)) {
                          // ��д��ֵ�����
                          x = (int) (Math.random() * 100) + 1;
                  } else {
                          break;
                  }
    		}
  
    		
    	}
    }
 
}