package org.shu.Java_sort;

public class QuickSort extends Base_sort {

	// int array[] = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62,
	// 99,
	// 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51 };

	public QuickSort(int[] array) {

		super(array);
		

	}

	@Override
	public int[] sort() {
		quick(array);
		return array;
	}
	
	public void quick(int[] array) {

		if (array.length > 0) { // �鿴�����Ƿ�Ϊ��

			_quickSort(array, 0, array.length - 1);
		}

	}

	public void _quickSort(int[] list, int low, int high) {

		if (low < high) {

			int middle = getMiddle(list, low, high); // ��list�������һ��Ϊ��

			_quickSort(list, low, middle - 1); // �Ե��ֱ���еݹ�����

			_quickSort(list, middle + 1, high); // �Ը��ֱ���еݹ�����

		}

	}

	public int getMiddle(int[] list, int low, int high) {

		int tmp = list[low]; // ����ĵ�һ����Ϊ����

		while (low < high) {

			while (low < high && list[high] >= tmp) {
				high--;
			}
			list[low] = list[high]; // ������С�ļ�¼�Ƶ��Ͷ�
			while (low < high && list[low] <= tmp) {
				low++;
			}
			list[high] = list[low]; // �������ļ�¼�Ƶ��߶�
		}

		list[low] = tmp; // �����¼��β

		return low; // ���������λ��

	}

}