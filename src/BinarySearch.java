
public class BinarySearch {
    /**
     * 二分查找
     * 
     * 注意：二分查找只是针对有序排列的各种数组或集合
     * 
     * @param target
     * @param array
     * @return
     */
    static boolean binarySearch(int target, int[] array) {
        int front = 0;
        int tail = array.length - 1;
        // 判断子数组是否能再次二分
        while (front <= tail) {
            // 获取子数组的中间位置，并依据此中间位置进行二分
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
