package org.shu.train;
/*
 * 给定一个 query 和一个 text,均由小写字母组成。
 * 要求在 text 中找出以同样的顺序连 续出现在 query 中的最长连续字母序列的长度。
 * 例如, query 为“acbac”,text 为 “acaccbabb”,
 * 那么 text 中的“cba”为最长的连续出现在 query 中的字母序列,
 * 因此, 返回结果应该为其长度 3。
 */
 
import java.util.Scanner;
 
public class No_03 {
 
    static int[] fail;
 
    /**
     * 初始化我们的失败数组，用来记忆比如acbac，此时的fail是-1、0、0、0、1你在比较第二个a的时后失败了那么就会到0 在失败就-1
     *
     * @param word
     */
    static void init(String word) {
        fail = new int[word.length()];
        fail[0] = -1;
        for (int i = 0, j = -1, len = word.length(); i < len - 1; ++i, ++j) {
            while (j != -1 && word.charAt(j) != word.charAt(i)) {
                j = fail[j];
            }
            fail[i + 1] = j + 1;
        }
    }
 
    static int solve(String pattern, String text) {
        init(pattern);
        int res = 0;
        for (int i = 0, j = 0, len = text.length(); i < len; ++i, ++j) {
            while (j != -1 && pattern.charAt(j) != text.charAt(i)) {
                j = fail[j];
            }
            if (j == pattern.length() - 1) {
                res++;
                j = fail[j];
                while (j != -1 && pattern.charAt(j) != text.charAt(i)) {
                    j = fail[j];
                }
            }
        }
        return res;
    }
 
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        String pattern = in.nextLine();
        String text = in.nextLine();
        k:
        for (int i = pattern.length(); i > 0; i--) {
            for (int j = 0; j < pattern.length() - i + 1; j++) {
                String temp = pattern.substring(j, i + j);
                if (solve(temp, text) >= 1) {
                    System.out.print(i);
                    break k;
                }
            }
        }
 
        in.close();
    }
}

//public class QueryText {
//	public int maxLengthInQuery(char[] query, char[] text) {
//		int[] length = new int[text.length];
//		for (int i = 0; i < text.length; i++) {
//			int size = 0;
//			int temp = i;
//			for (int j = query.length - 1; j >= 0;) {
//				if (text[i] == query[j]) {
//					size++;
//					i--;
//					j--;
//					if (i < 0) {
//						break;
//					}
//				} else {
//					if (j == query.length - 1) {
//						while (query[j] != text[i])
//							j--;
//					} else {
//						break;
//					}
//				}
//			}
//			length[temp] = size;
//			i = temp;
//		}
//		return Max(length);
//	}
//
//	public int Max(int[] arr) {
//		int max = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] > max)
//				max = arr[i];
//		}
//		return max;
//	}
//
//	public static void main(String[] args) {
//	//	char[] query = { 'a', 'c', 'b', 'a', 'c' };
//	//	char[] text = { 'a', 'c', 'a', 'c', 'c', 'b', 'a', 'b', 'b' };
//		
//		char[] query = {'a','c','b','a','w','a','c'};
//		char[] text = {'a','c','a','c','c','b','a','b','b'};
//		QueryText q = new QueryText();
//		System.out.println(q.maxLengthInQuery(query, text));
//	}
//}