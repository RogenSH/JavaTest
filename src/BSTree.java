


/*
 * 
 * 
 */

/**
 * Java ����: ���������
 *
 * @author skywang
 * @date 2013/11/07
 */

public class BSTree<T extends Comparable<T>> {

    private BSTNode<T> mRoot;    // �����

    public class BSTNode<T extends Comparable<T>> {
        T key;                // �ؼ���(��ֵ)
        BSTNode<T> left;    // ����
        BSTNode<T> right;    // �Һ���
        BSTNode<T> parent;    // �����

        public BSTNode(T key, BSTNode<T> parent, BSTNode<T> left, BSTNode<T> right) {
            this.key = key;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

        public T getKey() {
            return key;
        }

        public String toString() {
            return "key:"+key;
        }
    }

    public BSTree() {
        mRoot=null;
    }

    /*
     * ǰ�����"������"
     */
    private void preOrder(BSTNode<T> tree) {
        if(tree != null) {
            System.out.print(tree.key+" ");
            preOrder(tree.left);
            preOrder(tree.right);
        }
    }

    public void preOrder() {
        preOrder(mRoot);
    }

    /*
     * �������"������"
     */
    private void inOrder(BSTNode<T> tree) {
        if(tree != null) {
            inOrder(tree.left);
            System.out.print(tree.key+" ");
            inOrder(tree.right);
        }
    }

    public void inOrder() {
        inOrder(mRoot);
    }


    /*
     * �������"������"
     */
    private void postOrder(BSTNode<T> tree) {
        if(tree != null)
        {
            postOrder(tree.left);
            postOrder(tree.right);
            System.out.print(tree.key+" ");
        }
    }

    public void postOrder() {
        postOrder(mRoot);
    }


    /*
     * (�ݹ�ʵ��)����"������x"�м�ֵΪkey�Ľڵ�
     */
    private BSTNode<T> search(BSTNode<T> x, T key) {
        if (x==null)
            return x;

        int cmp = key.compareTo(x.key);
        if (cmp < 0)
            return search(x.left, key);
        else if (cmp > 0)
            return search(x.right, key);
        else
            return x;
    }

    public BSTNode<T> search(T key) {
        return search(mRoot, key);
    }

    /*
     * (�ǵݹ�ʵ��)����"������x"�м�ֵΪkey�Ľڵ�
     */
    private BSTNode<T> iterativeSearch(BSTNode<T> x, T key) {
        while (x!=null) {
            int cmp = key.compareTo(x.key);

            if (cmp < 0) 
                x = x.left;
            else if (cmp > 0) 
                x = x.right;
            else
                return x;
        }

        return x;
    }

    public BSTNode<T> iterativeSearch(T key) {
        return iterativeSearch(mRoot, key);
    }

    /* 
     * ������С��㣺����treeΪ�����Ķ���������С��㡣
     */
    private BSTNode<T> minimum(BSTNode<T> tree) {
        if (tree == null)
            return null;

        while(tree.left != null)
            tree = tree.left;
        return tree;
    }

    public T minimum() {
        BSTNode<T> p = minimum(mRoot);
        if (p != null)
            return p.key;

        return null;
    }
     
    /* 
     * ��������㣺����treeΪ�����Ķ�����������㡣
     */
    private BSTNode<T> maximum(BSTNode<T> tree) {
        if (tree == null)
            return null;

        while(tree.right != null)
            tree = tree.right;
        return tree;
    }

    public T maximum() {
        BSTNode<T> p = maximum(mRoot);
        if (p != null)
            return p.key;

        return null;
    }

    /* 
     * �ҽ��(x)�ĺ�̽�㡣��������"������������ֵ���ڸý��"��"��С���"��
     */
    public BSTNode<T> successor(BSTNode<T> x) {
        // ���x�����Һ��ӣ���"x�ĺ�̽��"Ϊ "�����Һ���Ϊ������������С���"��
        if (x.right != null)
            return minimum(x.right);

        // ���xû���Һ��ӡ���x���������ֿ��ܣ�
        // (01) x��"һ������"����"x�ĺ�̽��"Ϊ "���ĸ����"��
        // (02) x��"һ���Һ���"�������"x����͵ĸ���㣬���Ҹø����Ҫ��������"���ҵ������"��͵ĸ����"����"x�ĺ�̽��"��
        BSTNode<T> y = x.parent;
        while ((y!=null) && (x==y.right)) {
            x = y;
            y = y.parent;
        }

        return y;
    }
     
    /* 
     * �ҽ��(x)��ǰ����㡣��������"������������ֵС�ڸý��"��"�����"��
     */
    public BSTNode<T> predecessor(BSTNode<T> x) {
        // ���x�������ӣ���"x��ǰ�����"Ϊ "��������Ϊ���������������"��
        if (x.left != null)
            return maximum(x.left);

        // ���xû�����ӡ���x���������ֿ��ܣ�
        // (01) x��"һ���Һ���"����"x��ǰ�����"Ϊ "���ĸ����"��
        // (01) x��"һ������"�������"x����͵ĸ���㣬���Ҹø����Ҫ�����Һ���"���ҵ������"��͵ĸ����"����"x��ǰ�����"��
        BSTNode<T> y = x.parent;
        while ((y!=null) && (x==y.left)) {
            x = y;
            y = y.parent;
        }

        return y;
    }

    /* 
     * �������뵽��������
     *
     * ����˵����
     *     tree ��������
     *     z ����Ľ��
     */
    private void insert(BSTree<T> bst, BSTNode<T> z) {
        int cmp;
        BSTNode<T> y = null;
        BSTNode<T> x = bst.mRoot;

        // ����z�Ĳ���λ��
        while (x != null) {
            y = x;
            cmp = z.key.compareTo(x.key);
            if (cmp < 0)
                x = x.left;
            else
                x = x.right;
        }

        z.parent = y;
        if (y==null)
            bst.mRoot = z;
        else {
            cmp = z.key.compareTo(y.key);
            if (cmp < 0)
                y.left = z;
            else
                y.right = z;
        }
    }

    /* 
     * �½����(key)����������뵽��������
     *
     * ����˵����
     *     tree �������ĸ����
     *     key ������ļ�ֵ
     */
    public void insert(T key) {
        BSTNode<T> z=new BSTNode<T>(key,null,null,null);
        // ����½����ʧ�ܣ��򷵻ء�
        if (z != null)
            insert(this, z);
    }

    /* 
     * ɾ�����(z)�������ر�ɾ���Ľ��
     *
     * ����˵����
     *     bst ������
     *     z ɾ���Ľ��
     */
    private BSTNode<T> remove(BSTree<T> bst, BSTNode<T> z) {
        BSTNode<T> x=null;
        BSTNode<T> y=null;

        if ((z.left == null) || (z.right == null) )
            y = z;
        else
            y = successor(z);

        if (y.left != null)
            x = y.left;
        else
            x = y.right;

        if (x != null)
            x.parent = y.parent;

        if (y.parent == null)
            bst.mRoot = x;
        else if (y == y.parent.left)
            y.parent.left = x;
        else
            y.parent.right = x;

        if (y != z) 
            z.key = y.key;

        return y;
    }

    /* 
     * ɾ�����(z)�������ر�ɾ���Ľ��
     *
     * ����˵����
     *     tree �������ĸ����
     *     z ɾ���Ľ��
     */
    public void remove(T key) {
        BSTNode<T> z, node; 

        if ((z = search(mRoot, key)) != null)
            if ( (node = remove(this, z)) != null)
                node = null;
    }

    /*
     * ���ٶ�����
     */
    private void destroy(BSTNode<T> tree) {
        if (tree==null)
            return ;

        if (tree.left != null)
            destroy(tree.left);
        if (tree.right != null)
            destroy(tree.right);

        tree=null;
    }

    public void clear() {
        destroy(mRoot);
        mRoot = null;
    }

    /*
     * ��ӡ"���������"
     *
     * key        -- �ڵ�ļ�ֵ 
     * direction  --  0����ʾ�ýڵ��Ǹ��ڵ�;
     *               -1����ʾ�ýڵ������ĸ���������;
     *                1����ʾ�ýڵ������ĸ������Һ��ӡ�
     */
    private void print(BSTNode<T> tree, T key, int direction) {

        if(tree != null) {

            if(direction==0)    // tree�Ǹ��ڵ�
                System.out.printf("%2d is root\n", tree.key);
            else                // tree�Ƿ�֧�ڵ�
                System.out.printf("%2d is %2d's %6s child\n", tree.key, key, direction==1?"right" : "left");

            print(tree.left, tree.key, -1);
            print(tree.right,tree.key,  1);
        }
    }

    public void print() {
        if (mRoot != null)
            print(mRoot, mRoot.key, 0);
    }
    
    
    private static final int arr[] = {1,5,4,3,2,6};

    public static void main(String[] args) {
        int i, i_len;
        BSTree<Integer> tree=new BSTree<Integer>();

        System.out.print("== �������: ");
        i_len = arr.length;
        for(i=0; i<i_len; i++) {
            System.out.print(arr[i]+" ");
            tree.insert(arr[i]);
        }

        System.out.print("\n== ǰ�����: ");
        tree.preOrder();

        System.out.print("\n== �������: ");
        tree.inOrder();

        System.out.print("\n== �������: ");
        tree.postOrder();
        System.out.println();

        System.out.println("== ��Сֵ: "+ tree.minimum());
        System.out.println("== ���ֵ: "+ tree.maximum());
        System.out.println("== ������ϸ��Ϣ: ");
        tree.print();

        System.out.print("\n== ɾ�����ڵ�: "+ arr[3]);
        tree.remove(arr[3]);

        System.out.print("\n== �������: ");
        tree.inOrder();
        System.out.println();

        // ���ٶ�����
        tree.clear();
    }
}