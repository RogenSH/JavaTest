package org.shu.Java_sort;

public class ShellSort extends Base_sort {

	/*
	 * �㷨�Ƚ�Ҫ�����һ������ĳ������d��n/2,nΪҪ�������ĸ������ֳ������飬ÿ���м�¼���±����d.��ÿ����ȫ��Ԫ�ؽ���ֱ�Ӳ�������
	 * Ȼ������һ����С��������d/2���������з��飬��ÿ�����ٽ���ֱ�Ӳ������򡣵���������1ʱ������ֱ�Ӳ��������������ɡ�
	 */

	public ShellSort(int[] array) {
		super(array);
	}

	public int[] sort_an() {

		double d1 = array.length;
		int temp = 0;

		while (true) {
			d1 = Math.ceil(d1 / 2);
			int d = (int) d1;
			for (int x = 0; x < d; x++) {

				for (int i = x + d; i < array.length; i += d) {
					int j = i - d;
					temp = array[i];
					for (; j >= 0 && temp < array[j]; j -= d) {
						array[j + d] = array[j];
					}
					array[j + d] = temp;
				}
			}

			if (d == 1) {
				break;
			}

		}
		return array;
	}

	public int[] sort() {

		double d1 = array.length;
		int temp = 0;

		while (true) {
			d1 = Math.ceil(d1 / 2);
			int d = (int) d1;
			for (int x = 0; x < d; x++) {

				for (int i = x + d; i < array.length; i += d) {
					int j = i - d;
					temp = array[i];
					for (; j >= 0 && temp < array[j]; j -= d) {
						array[j + d] = array[j];
					}
					array[j + d] = temp;
				}
			}

			if (d == 1) {
				break;
			}

		}
		return array;
	}
}
