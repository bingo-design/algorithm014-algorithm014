package day1;

/**
 * @description:  爬楼梯 leetcode-70
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/climbing-stairs/
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class ClimbStairs {

    /**
     * 滚动数组法 时间复杂度O(n)，空间复杂度O(1)
     * @param n 台阶数
     * @return 方法数
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