package org.shu.job;

/*
 * 已知前序与中序的字符序列，输出后序序列。
 * 后序序列为：左子树，右子树，根
 * 第二种方法:
 * 利用String的api，正向的进行遍历，先写左子树，后写右子树，最后写根，循环利用递归实现。
 */
public class _BiTree_firstmid_last_2 {
	// 全局变量存放后序序列
	// 先写左子树，后写右子树，最后写根
	public static String res = "";

	// 两个字符串是否包含了相同的字符
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

	// 进行遍历输出
	public static void cal_tree(String sa, String sb) {
		boolean state = StringEquals(sa, sb);
		if (state == false)
			return;
		// 当是空字符串的时候
		if (sb.length() == 0)
			return;
		// 当sa==sb==1的时候，则就添加
		if (sa.length() == 1) {
			res += sa;
			return;
		}
		// 获取先序序列的第一个字符，作为根节点来划分中序序列
		char root = sa.charAt(0);
		// 获取根字符在中序序列中的位置
		int mid = sb.indexOf(root);
		// 拆分中序序列
		// 中序序列的左子树
		String c = sb.substring(0, mid);
		// 中序序列的右子树
		String d = sb.substring(mid + 1);
		// 下面就是先左子树，后右子树，最后根节点。即后序顺序
		// 先序左子树，中序左子树
		cal_tree(sa.substring(1, c.length() + 1), c);
		// 先序右子树，中序右子树
		cal_tree(sa.substring(1 + c.length()), d);
		// 写入根
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
