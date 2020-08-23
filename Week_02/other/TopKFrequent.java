package other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @description: 前K个高频元素 leetcode-345
 *
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 */
public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList();
        HashMap<Integer,Integer> map = new HashMap();
        for(int num : nums){
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        List<Integer>[] list = new List[nums.length+1];
        for(int key : map.keySet()){
            int i = map.get(key);
            if(list[i] == null){
                list[i] = new ArrayList();
            }
            list[i].add(key);
        }

        for(int i = list.length - 1;i >= 0 && res.size() < k;i--){
            if(list[i] == null) {
                continue;
            }
            res.addAll(list[i]);
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }

}
