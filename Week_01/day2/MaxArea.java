package day2;

public class MaxArea {

    /**
     * 暴力解法，循环嵌套
     * @param height
     * @return
     */
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i=0; i < height.length; i++) {
            for (int j = height.length-1; j > 0; j--) {
                if (i >= j) {
                    break;
                }
                int h = Math.min(height[i], height[j]);
                int w = j - i;
                int area = h * w;
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;
    }

    /**
     * 双指针法
     * @param height
     * @return
     */
    public static int maxArea2(int[] height) {
        int i = 0, j = height.length - 1, res = 0;
        while(i < j){
            res = height[i] < height[j] ?
                    Math.max(res, (j - i) * height[i++]):
                    Math.max(res, (j - i) * height[j--]);
        }
        return res;
    }

}
