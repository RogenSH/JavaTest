package org.shu.job;

/*
 * ��֪ǰ����������ַ����У�����������С�
 * ��������Ϊ��������������������
 * ��һ�ַ���:
 * ����һ�����������������ֵд�룬���˵ݼ�д������������������ѭ�����õݹ�ʵ�֡�
 * ��ʹ��String���api
 */
public class _BiTree_firstmid_last_1 {
	// i:��ʾҪ����������е�λ�ö������ɵĺ������У�Ӧ�ô����λ�ÿ�ʼд��
	// ���������ֵ�ݼ�������д�����Ȼ��д�������������д������
	public static int i = 0;

	public void getLast(char[] pre, char[] mid, char[] last) {
		// ������еĳ���С�ڵ���1�����������е�Ԫ�ز���last���У�Ȼ�󷵻�
		if (pre.length <= 1) {
			last[i] = pre[0];
			i--;
			return;
		}
		// ������г��ȴ���1���򽫶������ĸ�����last���У�Ȼ�����зֳ��������ֱ���еݹ�
		else {
			// ���Ԫ��
			last[i] = pre[0];
			i--;
			int j = 0;
			// ��mid���ҵ���Ԫ�أ��Ӵ˴���mid�ֳ�������
			for (; j < mid.length && pre[0] != mid[j]; j++)
				;
			// ѭ��������jΪ��Ԫ����mid�е�����λ��
			// ��������mid�ֿ�
			char[] newmid1 = new char[j];// j-1
			char[] newmid2 = new char[mid.length - j - 1];
			char[] newpre1 = new char[j];
			char[] newpre2 = new char[mid.length - j - 1];
			// ���������ĺ�������
			// ����Ҫ��֤j < mid.length - 1������ȵ�ʱ�򣬱�ʾû��������
			if (j < mid.length - 1) {
				// ��ʼ��������
				for (int n = 0; n < mid.length - j - 1; n++) {
					newmid2[n] = mid[n + j + 1];
					newpre2[n] = pre[n + j + 1];
				}
				getLast(newpre2, newmid2, last);
			}
			// ���������ĺ�������
			// ����Ҫ��֤j>0������ȵ�ʱ�򣬱�ʾû��������
			if (j > 0) {
				for (int m = 0; m < j; m++) {
					newmid1[m] = mid[m];
					newpre1[m] = pre[m + 1];
				}
				getLast(newpre1, newmid1, last);
			}
		}
	}

	public static void main(String[] args) {
		_BiTree_firstmid_last_1 st = new _BiTree_firstmid_last_1();
		char[] pre = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
		char[] mid = { 'C', 'D', 'B', 'E', 'A', 'G', 'F' };
		char[] last = new char[pre.length];
		i = mid.length - 1;
		st.getLast(pre, mid, last);
		for (int j = 0; j < last.length; j++)
			System.out.print(last[j]);
	}
}
