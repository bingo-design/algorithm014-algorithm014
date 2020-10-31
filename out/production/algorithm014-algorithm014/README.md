# 学习笔记

## 作业：
    
- **柠檬水找零**

    _Week_04.day4.LemonadeChange.java_

- **买卖股票的最佳时机 II**

    _Week_04.day3.MaxProfit.java_

- **分发饼干**

    _Week_04.other.FindContentChildren.java_
    
- **模拟行走机器人**
    
    _Week_04.other.RobotSim.java_

- **单词接龙**
    
    _Week_04.other.LadderLength.java_
    
- **岛屿数量**
    
    _Week_04.day5.NumIslands.java_

- **扫雷游戏**
    
    _Week_03.other.PermuteUnique.java_
    
## 学习总结：
  
    第四周，果然是到了最不容易坚持的时候。这周除了学习算法以外，还加入了一些其他方面的学习，一下子就让学习更紧张了，继续坚持吧。
    
    使用二分查找，寻找一个半有序数组 [4, 5, 6, 7, 0, 1, 2] 中间无序的地方
    
    解题思路：
    1、如果数组为空，或者数组长度小于3，那这个数组不可能半有序
    2、二分查找法，如果mid的左右两个子数组([0, mid - 1], [mid, nums.length - 1])均为有序数组，则mid即为中间无序的地方
    3、所以问题就变成了判断一个数组是否为有序数组
    
代码实现：
    
 ```java
    public class Sloution {
        public static int findDisorderIndex(int[] nums) {
                if (null == nums || nums.length < 3) {
                    return -1;
                }
                if (nums.length == 3) {
                    return nums[1];
                }
                int left = 0, right = nums.length - 1, mid;
                while (left <= right) {
                    mid = (right - left) / 2 + left;
                    boolean isLeftNumsSorted = isArraySorted(nums, left, mid);
                    boolean isRightNumsSorted = isArraySorted(nums, mid + 1, right);
                    if (isLeftNumsSorted && !isRightNumsSorted) {
                        // 如果左边有序、右边无序, 则只需要继续在右边无序侧查找
                        left = mid + 1;
                    } else if (!isLeftNumsSorted && isRightNumsSorted) {
                        // 如果左边无序、右边有序, 则只需要继续在左边无序侧查找
                        right = mid - 1;
                    } else {
                        // 左右均为有序数组， 则无序处必定是nums[mid - 1], mid, nums[mid + 1]中的一个
                        for (int i = mid - 1; i <= mid + 1 ; i++) {
                            if (judgeUnsortedPoint(nums, i)) {
                                return i;
                            }
                        }
                    }
                }
                return -1;
            }
        
            /**
             * 是否为有序数组
             */
            private static boolean isArraySorted(int[] nums, int start, int end) {
                boolean ascFlag = true,descPlag = true;
                //是否为升序
                for (int i = start; i < end; i++) {
                    if (nums[i] != Math.min(nums[i], nums[i + 1])) {
                        ascFlag = false;
                        break;
                    }
                }
                //是否为降序
                for (int i = start; i < end; i++) {
                    if (nums[i] != Math.max(nums[i], nums[i + 1])) {
                        descPlag = false;
                        break;
                    }
                }
                return ascFlag || descPlag;
            }
        
            /**
             * 判断是否为无序处
             */
            private static boolean judgeUnsortedPoint(int[] nums, int point) {
                // TODO
                return true;
            }
        
            public static void main(String[] args) {
                int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
                int index1 = findDisorderIndex(nums1);
                System.out.println("nums1无序处下标：" + index1);
                int[] nums2 = {4, 5, 6, 7, 0, 1, 2, 3};
                int index2 = findDisorderIndex(nums2);
                System.out.println("nums2无序处下标：" + index2);
                int[] nums3 = {6, 7, 0};
                int index3 = findDisorderIndex(nums3);
                System.out.println("nums3无序处下标：" + index3);
                int[] nums4 = {6, 1, 2};
                int index4 = findDisorderIndex(nums4);
                System.out.println("nums4无序处下标：" + index4);
            }
    }
 ```
    