package com.huawei.niuke1;

/*
 * 数据表记录包含表索引和数值，请对表索引相同的记录进行合并，
 * 即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 * 
 * 先输入键值对的个数,然后输入成对的index和value值，以空格隔开;输出合并后的键值对（多行）
 * 
    输入例子:
 4
 0 1
 0 2
 1 2
 3 4
    输出例子:
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
