package org.shu.Java_sort;

public class BucketSort {

	public static void basket(int data[])// dataΪ����������
	{
		int n = data.length;
		int bask[][] = new int[10][n];
		int index[] = new int[10];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			max = max > (Integer.toString(data[i]).length()) ? max : (Integer
					.toString(data[i]).length());
		}
		String str;
		for (int i = max - 1; i >= 0; i--) {
			for (int j = 0; j < n; j++) {
				str = "";
				if (Integer.toString(data[j]).length() < max) {
					for (int k = 0; k < max
							- Integer.toString(data[j]).length(); k++)
						str += "0";
				}
				str += Integer.toString(data[j]);
				bask[str.charAt(i) - '0'][index[str.charAt(i) - '0']++] = data[j];
			}
			int pos = 0;
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < index[j]; k++) {
					data[pos++] = bask[j][k];
				}
			}
			for (int x = 0; x < 10; x++)
				index[x] = 0;
		}
	}
}
