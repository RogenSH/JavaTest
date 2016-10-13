package org.shu.job;

/*
 * 已知前序与中序的字符序列，输出后序序列。
 * 后序序列为：左子树，右子树，根
 * 第一种方法:
 * 利用一个索引，从最大索引值写入，依此递减写入右子树和左子树，循环利用递归实现。
 * 不使用String类的api
 */
public class No_09 {
	// i:表示要插入后序序列的位置对于生成的后序序列，应该从最后位置开始写，
	// 从索引最大值递减依此先写入根，然后写入右子树，最后写左子树
	public static int i = 0;

	public void getLast(char[] pre, char[] mid, char[] last) {
		// 如果序列的长度小于等于1，将该序列中的元素插入last序列，然后返回
		if (pre.length <= 1) {
			last[i] = pre[0];
			i--;
			return;
		}
		// 如果序列长度大于1，则将二叉树的根插入last序列，然后将序列分成两个，分别进行递归
		else {
			// 添加元素
			last[i] = pre[0];
			i--;
			int j = 0;
			// 在mid中找到根元素，从此处将mid分成两部分
			for (; j < mid.length && pre[0] != mid[j]; j++)
				;
			// 循环结束后j为根元素在mid中的索引位置
			// 两部分以mid分开
			char[] newmid1 = new char[j];// j-1
			char[] newmid2 = new char[mid.length - j - 1];
			char[] newpre1 = new char[j];
			char[] newpre2 = new char[mid.length - j - 1];
			// 求右子树的后序序列
			// 必须要保证j < mid.length - 1，当相等的时候，表示没有右子树
			if (j < mid.length - 1) {
				// 初始化右子树
				for (int n = 0; n < mid.length - j - 1; n++) {
					newmid2[n] = mid[n + j + 1];
					newpre2[n] = pre[n + j + 1];
				}
				getLast(newpre2, newmid2, last);
			}
			// 求左子树的后序序列
			// 必须要保证j>0，当相等的时候，表示没有左子树
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
//* 已知前序与中序的字符序列，输出后序序列。
//* 后序序列为：左子树，右子树，根
//* 第二种方法:
//* 利用String的api，正向的进行遍历，先写左子树，后写右子树，最后写根，循环利用递归实现。
//*/
//public class _BiTree_firstmid_last_2 {
//	// 全局变量存放后序序列
//	// 先写左子树，后写右子树，最后写根
//	public static String res = "";
//
//	// 两个字符串是否包含了相同的字符
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
//	// 进行遍历输出
//	public static void cal_tree(String sa, String sb) {
//		boolean state = StringEquals(sa, sb);
//		if (state == false)
//			return;
//		// 当是空字符串的时候
//		if (sb.length() == 0)
//			return;
//		// 当sa==sb==1的时候，则就添加
//		if (sa.length() == 1) {
//			res += sa;
//			return;
//		}
//		// 获取先序序列的第一个字符，作为根节点来划分中序序列
//		char root = sa.charAt(0);
//		// 获取根字符在中序序列中的位置
//		int mid = sb.indexOf(root);
//		// 拆分中序序列
//		// 中序序列的左子树
//		String c = sb.substring(0, mid);
//		// 中序序列的右子树
//		String d = sb.substring(mid + 1);
//		// 下面就是先左子树，后右子树，最后根节点。即后序顺序
//		// 先序左子树，中序左子树
//		cal_tree(sa.substring(1, c.length() + 1), c);
//		// 先序右子树，中序右子树
//		cal_tree(sa.substring(1 + c.length()), d);
//		// 写入根
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