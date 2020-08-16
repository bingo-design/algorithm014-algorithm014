package day6;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:  猜数字游戏 leetcode-299
 */
public class GetHint {
    public String getHint(String secret, String guess) {
        Integer bullsNum  = 0;
        for (int i = 0; i < secret.length(); i++ ) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bullsNum++;
            }
        }
        Integer cowsNum = 0;
        Map<Integer, Integer> secretMap = stringToMap(secret);
        Map<Integer, Integer> guessMap = stringToMap(guess);
        for (Integer key : secretMap.keySet()) {
            cowsNum += Math.min(secretMap.get(key), guessMap.getOrDefault(key, 0));
        }
        cowsNum -= bullsNum;
        return bullsNum + "A" + cowsNum + "B";
    }

    private Map<Integer, Integer> stringToMap (String s) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(Integer.valueOf(s.charAt(i)), map.getOrDefault(Integer.valueOf(s.charAt(i)), 0) + 1);
        }
        return map;
    }
}
