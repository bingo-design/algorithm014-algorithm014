package day1;

/**
 * @description:  爬楼梯 leetcode-70
 */
class ClimbStairs {

    /**
     * 滚动数组法
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        int first = 0;
        int second = 0;
        int third = 1;
        for (int i = 1; i <= n; i++) {
            first = second;
            second = third;
            third = first + second;
        }
        return third;
    }

}