package day5;

/**
 * @description: leetcode-258
 *
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 */
public class AddDigits {

    public int addDigits(int num) {
        return (num -1) % 9 + 1;
    }

}
