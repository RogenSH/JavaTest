package org.shu.job;

/*
 * ��֪ǰ����������ַ����У�����������С�
 * ��������Ϊ��������������������
 * �ڶ��ַ���:
 * ����String��api������Ľ��б�������д����������д�����������д����ѭ�����õݹ�ʵ�֡�
 */
public class _BiTree_firstmid_last_2 {
	// ȫ�ֱ�����ź�������
	// ��д����������д�����������д��
	public static String res = "";

	// �����ַ����Ƿ��������ͬ���ַ�
	public static boolean StringEquals(String a1, String a2) {
		boolean state = true;
		if (a1.length() != a2.length()) {
			state = false;
		}
		if (a1.length() == a2.length()) {
			for (int i = 0; i < a1.length(); i++) {
				if (a2.indexOf(a1.charAt(i)) == -1)
					state = false;
			}
		}
		return state;
	}

	// ���б������
	public static void cal_tree(String sa, String sb) {
		boolean state = StringEquals(sa, sb);
		if (state == false)
			return;
		// ���ǿ��ַ�����ʱ��
		if (sb.length() == 0)
			return;
		// ��sa==sb==1��ʱ��������
		if (sa.length() == 1) {
			res += sa;
			return;
		}
		// ��ȡ�������еĵ�һ���ַ�����Ϊ���ڵ���������������
		char root = sa.charAt(0);
		// ��ȡ���ַ������������е�λ��
		int mid = sb.indexOf(root);
		// �����������
		// �������е�������
		String c = sb.substring(0, mid);
		// �������е�������
		String d = sb.substring(mid + 1);
		// ��������������������������������ڵ㡣������˳��
		// ����������������������
		cal_tree(sa.substring(1, c.length() + 1), c);
		// ����������������������
		cal_tree(sa.substring(1 + c.length()), d);
		// д���
		res += String.valueOf(root);
		return;
	}

	public static void main(String[] agrs) {
		// cal_tree("DBACEGF","ABCDEFG");
		// cal_tree("ABCD","BDAC");
		String s1 = "ABCDEFG";
		String s2 = "CDBEAGF";
		cal_tree(s1, s2);
		if (res.length() != s1.length())
			System.out.println("wrong tree list!");
		else {
			System.out.println(res);
		}
	}
}
