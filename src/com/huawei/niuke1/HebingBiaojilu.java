package com.huawei.niuke1;

/*
 * ���ݱ��¼��������������ֵ����Ա�������ͬ�ļ�¼���кϲ���
 * ������ͬ��������ֵ����������㣬�������keyֵ������������
 * 
 * �������ֵ�Եĸ���,Ȼ������ɶԵ�index��valueֵ���Կո����;����ϲ���ļ�ֵ�ԣ����У�
 * 
    ��������:
 4
 0 1
 0 2
 1 2
 3 4
    �������:
 0 3
 1 2
 3 4
 
 */
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HebingBiaojilu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				int s = sc.nextInt();
				int value = sc.nextInt();
				if (map.containsKey(s)) {
					map.put(s, map.get(s) + value);
				} else
					map.put(s, value);
			}

			for (Integer key : map.keySet()) {
				System.out.println(key + " " + map.get(key));
			}
		}
	}
}
