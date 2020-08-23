package other;

/**
 * @description: 丑数 leetcode-263
 */
public class IsUgly {

    public boolean isUgly(int num) {
        for (int i = 2; i < 6; i++) {
            while (num % i == 0) {
                num /= i;
            }
        }
        return num == 1;
    }

}
