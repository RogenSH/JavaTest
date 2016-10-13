package com.huawei.niuke1;

/*
 * http://www.nowcoder.com/questionTerminal/f9c6f980eeec43ef85be20755ddbeaf4
 * 
 * ��ǿ����ܿ��ģ���˾����NԪ�����ս���
 * ��ǿ���������ս����ڹ�������������Ʒ��Ϊ���ࣺ�����븽���������Ǵ�����ĳ�������ģ�
 * �±����һЩ�����븽�������ӣ�
 ����		����
 ����		��ӡ����ɨ����
 ���		ͼ��
 ����		̨�ƣ��ľ�
 ������	��
 * ���Ҫ�����Ϊ��������Ʒ����������ø���������������ÿ������������ 0 ���� 1 ���� 2 �����������������д������Լ��ĸ�����
 * ��ǿ����Ķ����ܶ࣬Ϊ�˲�����Ԥ�㣬����ÿ����Ʒ�涨��һ����Ҫ�ȣ���Ϊ 5 �ȣ������� 1 ~ 5 ��ʾ���� 5 ������Ҫ��
 * �������������ϲ鵽��ÿ����Ʒ�ļ۸񣨶��� 10 Ԫ������������
 * ��ϣ���ڲ����� N Ԫ�����Ե��� N Ԫ����ǰ���£�ʹÿ����Ʒ�ļ۸�����Ҫ�ȵĳ˻����ܺ����
 * 
 *  ��� j ����Ʒ�ļ۸�Ϊ v[j] ����Ҫ��Ϊ w[j] ����ѡ���� k ����Ʒ���������Ϊ j 1 �� j 2 �������� j k ��
 *  ��������ܺ�Ϊ��
 *  v[j_1]*w[j_1]+v[j_2]*w[j_2]+ �� +v[j_k ]*w[j_k ] �������� * Ϊ�˺ţ�
 *  ���������ǿ���һ������Ҫ��Ĺ��ﵥ��
 *  
 *  ��������:����ĵ� 1 �У�Ϊ��������������һ���ո������N m
 *  ������ N �� <32000 ����ʾ��Ǯ���� m �� <60 ��Ϊϣ��������Ʒ�ĸ�������
 *  �ӵ� 2 �е��� m+1 �У��� j �и����˱��Ϊ j-1 ����Ʒ�Ļ������ݣ�ÿ���� 3 ���Ǹ����� v p q
 *  ������ v ��ʾ����Ʒ�ļ۸� v<10000 ���� p ��ʾ����Ʒ����Ҫ�ȣ� 1 ~ 5 ���� q ��ʾ����Ʒ���������Ǹ�����
 *  ��� q=0 ����ʾ����ƷΪ��������� q>0 ����ʾ����ƷΪ������ q �����������ı�ţ�
 *  
 *  
 *  �������:
 *  ����ļ�ֻ��һ����������Ϊ��������Ǯ������Ʒ�ļ۸�����Ҫ�ȳ˻����ܺ͵����ֵ�� <200000 ����
 *  
 *  ��������:
 1000 5
 800 2 0
 400 5 1
 300 5 1
 400 3 0
 500 2 0

 *  �������:
 2200 
 */

import java.util.Scanner;

//�������������ı�������
public class _No_16 {
  public static int getMaxValue(int[] val, int[] weight, int[] q, int n, int w) {
      int[][] dp = new int[n + 1][w + 1];
      for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= w; j++) {
              if (q[i-1] == 0) {  // ����
                  if (weight[i - 1] <= j) // ��j��ô��Ǯȥ�� i ����Ʒ ���Ի������ֵ
                      dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j- weight[i - 1]]+ val[i - 1]);
              }
              else { //����
                  if (weight[i - 1] + weight[q[i - 1]] <= j) //�����Ļ� ��������һ����
                      dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j- weight[i - 1]]+ val[i - 1]);
              }
          }
      }
      return dp[n][w];
  }

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      while (input.hasNextInt()) {
          int n = input.nextInt(); // ��Ǯ��
          int m = input.nextInt(); // ��Ʒ����
          int[] p = new int[m];
          int[] v = new int[m];
          int[] q = new int[m];
          for (int i = 0; i < m; i++) {
              p[i] = input.nextInt();        // �۸�
              v[i] = input.nextInt() * p[i]; // ��ֵ
              q[i] = input.nextInt();        // ��or����
          }
          System.out.println(getMaxValue(v, p, q, m, n));
      }
  }
}

//------


//��������
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
//        final int N = 6;//�����м�����Ʒ  
//        LinkedList p = new LinkedList();  
//        p.add(new WuPin(0,0));//��ӵ�һ��Ϊ���ֵ  
//        for(int i =4;i>=0;i--)  
//        {  
//            jisuan(p,wuPinList.get(i));  
//            System.out.println("p"+(i+1));  
//            for(int ii = 0;ii<p.size();ii++)  
//                System.out.println((WuPin)p.get(ii));  
//        }  
//    }  
//    //�������������Ʒ  
//    private static void jisuan(LinkedList p, WuPin pin) {  
//        LinkedList q = new LinkedList();  
//        //����õ�q ��p��ÿһ�����w  
//        for(int i = 0;i<p.size();i++)  
//        {  
//            q.add(new WuPin(((WuPin)p.get(i)).getWeight()+pin.getWeight(),((WuPin)p.get(i)).getValue()+pin.getValue()));  
//        }  
////      System.out.println("�õ���q");  
////      for(int i = 0;i<q.size();i++)  
////          System.out.println((WuPin)q.get(i));  
//        //��p n-1 ����p n ��q n�ϲ�  
//        for(int m = 0;m<q.size();m++)  
//        {  
//            p.add((WuPin)q.get(m));  
//        }  
//        Collections.sort(p);//�������е���Ʒ������������  
////      System.out.println("p��q�ϲ�֮���p");  
////      for(int i = 0;i<p.size();i++)  
////          System.out.println((WuPin)p.get(i));  
//        //ȥ����Ծ��  
//        for(int m = 0;m<p.size();m++)  
//        {  
//            //��������valueС��ǰ�� ɾ��  
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