package day4;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: Fizz Buzz leetcode-412
 *
 * Write a program that outputs the string representation of numbers from 1 to n.
 *
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i=0;i<=n;i++) {
            boolean isThree = n % 3 == 0;
            boolean isFive = n % 5 == 0;
            if (isThree && !isFive) {
                list.add("Fizz");
            } else if (!isThree && isFive) {
                list.add("Buzz");
            } else if (isThree && isFive) {
                list.add("FizzBuzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

}
