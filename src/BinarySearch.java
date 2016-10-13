
public class BinarySearch {
    /**
     * ���ֲ���
     * 
     * ע�⣺���ֲ���ֻ������������еĸ�������򼯺�
     * 
     * @param target
     * @param array
     * @return
     */
    static boolean binarySearch(int target, int[] array) {
        int front = 0;
        int tail = array.length - 1;
        // �ж��������Ƿ����ٴζ���
        while (front <= tail) {
            // ��ȡ��������м�λ�ã������ݴ��м�λ�ý��ж���
            int middle = (front + tail) / 2;
 
            if (array[middle] == target) {
                return true;
            } else if (array[middle] > target) {
                tail = middle - 1;
            } else {
                front = middle + 1;
            }
        }
        return false;
    }
 
    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 5, 7, 9, 17, 121, 4545 };
        System.out.println(binarySearch(4545, array));
    }
}
