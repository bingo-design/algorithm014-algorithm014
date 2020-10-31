import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @description:
 * @author: jiabin1
 * @time: 2020/9/15 7:26 下午
 */
public class Merge {

    public static void main(String[] args) {
//        int[] arr = {8, 7, 6, 5, 4, 3, 2, 1};
//        int length = arr.length;
//        /**
//         * 我们对于归并排序的定义是左闭右闭的，所以第 3 个参数应该使用数组的长度 -1
//         */
//        mergeSort(arr, 0, length - 1);
//        System.out.println(Arrays.toString(arr));
        String s1 = "0.00";
        String s2 = "12";
        System.out.println(new BigDecimal(s1).longValueExact());
//        System.out.println(s2.substring(0,s2.indexOf(".")));
    }

    private static void mergeSort(int[] arr, int left, int right) {

        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        mergeTwoSortedArray(arr, left, mid, right);
    }

    /**
     * 把两个已经排好序的数组进行合并
     * 第 1 个数组：arr[left, ..., mid]，是排好序的
     * 第 2 个数组：arr[mid+1, ..., right]，是排好序的
     *
     * @param arr   待排序数组
     * @param left  arr[left,mid] 已经是排好序的
     * @param mid
     * @param right arr[mid+1,right] 已经是排好序的
     */
    private static void mergeTwoSortedArray(int[] arr, int left, int mid, int right) {

        int length = right - left + 1;
        int[] temp = new int[length];
        for (int i = 0; i < length; i++) {
            temp[i] = arr[left + i];
        }
        int l = 0;
        int r = mid - left + 1;

        for (int i = 0; i < length; i++) {
            if (l > mid - left) {
                arr[i + left] = temp[r];
                r++;
            } else if (r > length - 1) {
                arr[i + left] = temp[l];
                l++;
            } else if (temp[l] < temp[r]) {
                arr[i + left] = temp[l];
                l++;
            } else {
                arr[i + left] = temp[r];
                r++;
            }
        }
    }

}
