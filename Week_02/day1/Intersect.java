package day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: 两个数组的交集 II leetcode-350
 */
public class Intersect {

    /**
     * map解法
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int[] result = new int[nums1.length];
        int index = 0;
        for (int j = 0; j < nums2.length; j++) {
            int count = map.getOrDefault(nums2[j], 0);
            if (count > 0) {
                result[index] = map.get(nums2[j]);
                index++;
                count--;
                if (count > 0) {
                    map.put(nums2[j], count);
                } else {
                    map.remove(nums2[j]);
                }
            }
        }
        return Arrays.copyOfRange(result, 0, index);
    }

}
