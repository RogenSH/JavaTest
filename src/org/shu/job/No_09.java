package org.shu.job;

/*
 * ��֪ǰ����������ַ����У�����������С�
 * ��������Ϊ��������������������
 * ��һ�ַ���:
 * ����һ�����������������ֵд�룬���˵ݼ�д������������������ѭ�����õݹ�ʵ�֡�
 * ��ʹ��String���api
 */
public class No_09 {
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
		No_09 st = new No_09();
		char[] pre = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };
		char[] mid = { 'C', 'D', 'B', 'E', 'A', 'G', 'F' };
		char[] last = new char[pre.length];
		i = mid.length - 1;
		st.getLast(pre, mid, last);
		for (int j = 0; j < last.length; j++)
			System.out.print(last[j]);
	}
}


///*
//* ��֪ǰ����������ַ����У�����������С�
//* ��������Ϊ��������������������
//* �ڶ��ַ���:
//* ����String��api������Ľ��б�������д����������д�����������д����ѭ�����õݹ�ʵ�֡�
//*/
//public class _BiTree_firstmid_last_2 {
//	// ȫ�ֱ�����ź�������
//	// ��д����������д�����������д��
//	public static String res = "";
//
//	// �����ַ����Ƿ��������ͬ���ַ�
//	public static boolean StringEquals(String a1, String a2) {
//		boolean state = true;
//		if (a1.length() != a2.length()) {
//			state = false;
//		}
//		if (a1.length() == a2.length()) {
//			for (int i = 0; i < a1.length(); i++) {
//				if (a2.indexOf(a1.charAt(i)) == -1)
//					state = false;
//			}
//		}
//		return state;
//	}
//
//	// ���б������
//	public static void cal_tree(String sa, String sb) {
//		boolean state = StringEquals(sa, sb);
//		if (state == false)
//			return;
//		// ���ǿ��ַ�����ʱ��
//		if (sb.length() == 0)
//			return;
//		// ��sa==sb==1��ʱ��������
//		if (sa.length() == 1) {
//			res += sa;
//			return;
//		}
//		// ��ȡ�������еĵ�һ���ַ�����Ϊ���ڵ���������������
//		char root = sa.charAt(0);
//		// ��ȡ���ַ������������е�λ��
//		int mid = sb.indexOf(root);
//		// �����������
//		// �������е�������
//		String c = sb.substring(0, mid);
//		// �������е�������
//		String d = sb.substring(mid + 1);
//		// ��������������������������������ڵ㡣������˳��
//		// ����������������������
//		cal_tree(sa.substring(1, c.length() + 1), c);
//		// ����������������������
//		cal_tree(sa.substring(1 + c.length()), d);
//		// д���
//		res += String.valueOf(root);
//		return;
//	}
//
//	public static void main(String[] agrs) {
//		// cal_tree("DBACEGF","ABCDEFG");
//		// cal_tree("ABCD","BDAC");
//		String s1 = "ABCDEFG";
//		String s2 = "CDBEAGF";
//		cal_tree(s1, s2);
//		if (res.length() != s1.length())
//			System.out.println("wrong tree list!");
//		else {
//			System.out.println(res);
//		}
//	}
//}