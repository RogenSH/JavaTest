package org.shu.job;

/*去哪儿
 *输出 文件名后缀
 *输入:Abc/file.txt
 *输出:txt
 */

import java.util.Scanner;

//public class Houzhui {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String fileName = in.nextLine();
//        String prefix = fileName.substring(fileName.lastIndexOf(".")+1);
//        System.out.println(prefix);
//    }
//}
//


public class Houzhui {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			String[] str = s.split("\\.");
			int i = str.length - 1;
			System.out.println(str[i]);
		}
	}
}