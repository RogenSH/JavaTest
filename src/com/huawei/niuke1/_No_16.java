package com.huawei.niuke1;

/*
 * http://www.nowcoder.com/questionTerminal/f9c6f980eeec43ef85be20755ddbeaf4
 * 
 * 王强今天很开心，公司发给N元的年终奖。
 * 王强决定把年终奖用于购物，他把想买的物品分为两类：主件与附件，附件是从属于某个主件的，
 * 下表就是一些主件与附件的例子：
 主件		附件
 电脑		打印机，扫描仪
 书柜		图书
 书桌		台灯，文具
 工作椅	无
 * 如果要买归类为附件的物品，必须先买该附件所属的主件。每个主件可以有 0 个、 1 个或 2 个附件。附件不再有从属于自己的附件。
 * 王强想买的东西很多，为了不超出预算，他把每件物品规定了一个重要度，分为 5 等：用整数 1 ~ 5 表示，第 5 等最重要。
 * 他还从因特网上查到了每件物品的价格（都是 10 元的整数倍）。
 * 他希望在不超过 N 元（可以等于 N 元）的前提下，使每件物品的价格与重要度的乘积的总和最大。
 * 
 *  设第 j 件物品的价格为 v[j] ，重要度为 w[j] ，共选中了 k 件物品，编号依次为 j 1 ， j 2 ，……， j k ，
 *  则所求的总和为：
 *  v[j_1]*w[j_1]+v[j_2]*w[j_2]+ … +v[j_k ]*w[j_k ] 。（其中 * 为乘号）
 *  请你帮助王强设计一个满足要求的购物单。
 *  
 *  输入描述:输入的第 1 行，为两个正整数，用一个空格隔开：N m
 *  （其中 N （ <32000 ）表示总钱数， m （ <60 ）为希望购买物品的个数。）
 *  从第 2 行到第 m+1 行，第 j 行给出了编号为 j-1 的物品的基本数据，每行有 3 个非负整数 v p q
 *  （其中 v 表示该物品的价格（ v<10000 ）， p 表示该物品的重要度（ 1 ~ 5 ）， q 表示该物品是主件还是附件。
 *  如果 q=0 ，表示该物品为主件，如果 q>0 ，表示该物品为附件， q 是所属主件的编号）
 *  
 *  
 *  输出描述:
 *  输出文件只有一个正整数，为不超过总钱数的物品的价格与重要度乘积的总和的最大值（ <200000 ）。
 *  
 *  输入例子:
 1000 5
 800 2 0
 400 5 1
 300 5 1
 400 3 0
 500 2 0

 *  输出例子:
 2200 
 */

import java.util.Scanner;

//加了限制条件的背包问题
public class _No_16 {
  public static int getMaxValue(int[] val, int[] weight, int[] q, int n, int w) {
      int[][] dp = new int[n + 1][w + 1];
      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= w; j++) {
              if (q[i-1] == 0) {  // 主件
                  if (weight[i - 1] <= j) // 用j这么多钱去买 i 件商品 可以获得最大价值
                      dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j- weight[i - 1]]+ val[i - 1]);
              }
              else { //附件
                  if (weight[i - 1] + weight[q[i - 1]] <= j) //附件的话 加上主件一起算
                      dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j- weight[i - 1]]+ val[i - 1]);
              }
          }
      }
      return dp[n][w];
  }

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      while (input.hasNextInt()) {
          int n = input.nextInt(); // 总钱数
          int m = input.nextInt(); // 商品个数
          int[] p = new int[m];
          int[] v = new int[m];
          int[] q = new int[m];
          for (int i = 0; i < m; i++) {
              p[i] = input.nextInt();        // 价格
              v[i] = input.nextInt() * p[i]; // 价值
              q[i] = input.nextInt();        // 主or附件
          }
          System.out.println(getMaxValue(v, p, q, m, n));
      }
  }
}

//------


//背包问题
//import java.util.Collections;  
//import java.util.LinkedList;  
//  
//class WuPin implements Comparable  
//{  
//    @Override  
//    public String toString()  
//    {  
//        return "WuPin [weight=" + weight + ", value=" + value + "]";  
//    }  
//    private int weight;  
//    private int value;  
//    public WuPin(int weight, int value) {  
//        super();  
//        this.weight = weight;  
//        this.value = value;  
//    }  
//    public int getValue() {  
//        return value;  
//    }  
//    public int getWeight() {  
//        return weight;  
//    }  
//    @Override  
//    public int compareTo(Object o)  
//    {  
//        WuPin obj =(WuPin)o;  
//        return this.weight>obj.getWeight()?1:(this.weight==obj.getWeight()?0:-1);  
//    }  
//      
//}  
//  
//public class BeiBao {  
//    public static void main(String[] args)  
//    {  
//        LinkedList<WuPin> wuPinList = new LinkedList<WuPin>();  
//        wuPinList.add(new WuPin(2,6));  
//        wuPinList.add(new WuPin(2,3));  
//        wuPinList.add(new WuPin(6,5));  
//        wuPinList.add(new WuPin(5,4));  
//        wuPinList.add(new WuPin(4,6));  
//        final int N = 6;//代表共有几个物品  
//        LinkedList p = new LinkedList();  
//        p.add(new WuPin(0,0));//添加第一个为零的值  
//        for(int i =4;i>=0;i--)  
//        {  
//            jisuan(p,wuPinList.get(i));  
//            System.out.println("p"+(i+1));  
//            for(int ii = 0;ii<p.size();ii++)  
//                System.out.println((WuPin)p.get(ii));  
//        }  
//    }  
//    //用来计算添加物品  
//    private static void jisuan(LinkedList p, WuPin pin) {  
//        LinkedList q = new LinkedList();  
//        //计算得到q 即p的每一项加上w  
//        for(int i = 0;i<p.size();i++)  
//        {  
//            q.add(new WuPin(((WuPin)p.get(i)).getWeight()+pin.getWeight(),((WuPin)p.get(i)).getValue()+pin.getValue()));  
//        }  
////      System.out.println("得到的q");  
////      for(int i = 0;i<q.size();i++)  
////          System.out.println((WuPin)q.get(i));  
//        //求p n-1 即将p n 和q n合并  
//        for(int m = 0;m<q.size();m++)  
//        {  
//            p.add((WuPin)q.get(m));  
//        }  
//        Collections.sort(p);//将背包中的物品按照重量排序  
////      System.out.println("p和q合并之后的p");  
////      for(int i = 0;i<p.size();i++)  
////          System.out.println((WuPin)p.get(i));  
//        //去掉跳跃点  
//        for(int m = 0;m<p.size();m++)  
//        {  
//            //如果后面的value小于前面 删除  
////          System.out.println("dijici"+m);  
////          for(int i = 0;i<p.size();i++)  
////              System.out.println((WuPin)p.get(m));  
//            if(m+1<=p.size()-1)  
//                if(((WuPin)p.get(m)).getValue()>=((WuPin)p.get(m+1)).getValue())  
//                {  
//                    p.remove(m+1);  
//                    m=0;  
//                }  
//            if(((WuPin)p.get(m)).getWeight()>10)  
//            {  
//                p.remove(m);  
//                m=0;  
//            }  
//        }     
//    }  
//}  