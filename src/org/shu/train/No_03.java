package org.shu.train;
/*
 * ����һ�� query ��һ�� text,����Сд��ĸ��ɡ�
 * Ҫ���� text ���ҳ���ͬ����˳���� �������� query �е��������ĸ���еĳ��ȡ�
 * ����, query Ϊ��acbac��,text Ϊ ��acaccbabb��,
 * ��ô text �еġ�cba��Ϊ������������� query �е���ĸ����,
 * ���, ���ؽ��Ӧ��Ϊ�䳤�� 3��
 */
 
import java.util.Scanner;
 
public class No_03 {
 
    static int[] fail;
 
    /**
     * ��ʼ�����ǵ�ʧ�����飬�����������acbac����ʱ��fail��-1��0��0��0��1���ڱȽϵڶ���a��ʱ��ʧ������ô�ͻᵽ0 ��ʧ�ܾ�-1
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