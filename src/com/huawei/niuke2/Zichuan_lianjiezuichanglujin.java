package com.huawei.niuke2;

/*
 * �����һ��Ϊһ��������n(1��n��1000),����n��Ϊn���ַ���(�ַ������ȡ�100),�ַ�����ֻ���д�Сд��ĸ��
 * �������:�������n�У�������Ϊ�����ֵ������е��ַ�����
��������:
9
cap
to
cat
card
two
too
up
boat
boot

�������:
boat
boot
cap
card
cat
to
too
two
up
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
 
public class Zichuan_lianjiezuichanglujin {
    //����һ
//  public static void main(String[] args) {
//      Scanner in=new Scanner(System.in);
//      int n=in.nextInt();
//      String[] arr = new String[n];
//      for (int i = 0; i < n; i++) {
//          arr[i]=in.next();
//      }
//      sortString(arr);
//      for (int i = 0; i < arr.length; i++) {
//          System.out.println(arr[i]);
//      }
//  }
//
//  private static void sortString(String[] arr) {
//      String temp=null;
//      for (int i = 0; i < arr.length-1; i++) {
//          for (int j = i+1; j < arr.length; j++) {
//              if(arr[i].compareTo(arr[j])>0){
//                  temp=arr[i];
//                  arr[i]=arr[j];
//                  arr[j]=temp;
//              }
//          }
//      }
//  }
    //������
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Vector<String> ve=new Vector<String>();
        for (int i = 0; i < n; i++) {
            ve.add(in.next());
        }
        Collections.sort(ve);
        Iterator it=ve.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    //������
//    public class Main {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int num = sc.nextInt();
//            String [] ss = new String[num];
//            for (int i = 0; i < num; i++) {
//                ss[i]=sc.next();
//            }
//            Arrays.sort(ss);
//            for (int i = 0; i < ss.length; i++) {
//                System.out.println(ss[i]);
//            }
//        }
//    }
}
