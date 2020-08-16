#学习笔记

##作业：

- **用 add first 或 add last 这套新的 API 改写 Deque 的代码**

    ```` java
    Deque<String> deque = new LinkedList<String>();
    
    deque.addFirst("a");
    
    deque.addFirst("b");
    
    deque.addFirst("c");
    
    System.out.println(deque);
    
    String str = deque.peek();
    
    System.out.println(str);
    
    System.out.println(deque);
    
    while (deque.size > 0) {
    
        System.out.println(deque.pop());
        
    }
   
    System.out.println(deque);  
    
- **分析 Queue 和 Priority Queue 的源码**

    - Queue源码解析（**_基于 JDK1.8_**）
    
        - Queue是接口，继承自Collection接口。
        
        - Queue接口中定义了以下6个方法：
        
            - add方法。向队列中添加一个元素，成功返回true。如果容量已满，则抛出IllegalStateException。
            
            - offer方法。向队列中添加一个元素，成功返回true,失败返回false。
            
            - remove方法。移处并返回队列头部元素，如果队列为空则抛出NoSuchElementException。
            
            - poll方法。移处并返回队列头部元素，如果队列为空则回null。
            
            - element方法。获取队列头部元素但不移除，如果队列为空则抛出NoSuchElementException。
            
            - peek方法。获取队列头部元素但不移除，如果队列为空则返回null。
            
    - Priority Queue源码解析（**_基于 JDK1.8_**）
    
        - PriorityQueue继承自抽象类AbstractQueue，AbstractQueue为Queue接口的实现类。
        
        - 待补充

- **删除排序数组中的重复项**
    
    _Week_01.other.RemoveDuplicates.java_

- **旋转数组**

    _Week_01.other.Rotate.java_

- **合并两个有序链表**

    _Week_01.day5.MergeTwoLists.java_

- **合并两个有序数组**
    
    _TODO: Week_01.other.Merge.java_

- **两数之和**
    
    _Week_01.day3.TwoSum.java_

- **移动零**

    _TODO: Week_01.other.MoveZeroes.java_
    
- **加一**

    _Week_01.day2.PlusOne.java_

- **设计循环双端队列**

    _Week_01.day7.MyCircularDeque.java_

- **接雨水**

    _TODO: Week_01.other.Trap.java_
    
##学习总结：
  
    所谓不破不立，加入算法训练营的第一周的关键词就是打破。
    
    1、打破原有时间安排。
    
    调整工作与学习的时间安排，把算法学习的优先级提高。不过这一点做的并不是特别好，学习计划还是会被突如其来的工作打乱，后续还需要逐步调整，争取将每天的学习时间固定下来。
    
    2、打破原有学习习惯。
    
    以往刷算法题的路子就是死磕，效率极低。现在刷题，如果看了一会儿没思路，果断看解题，找最优解。然后再按照五毒神掌的模式去刷，确实效率高了很多。
    
    还需要改善的点：
    
    1、加大刷题时间投入。
    
    2、按每周课程知识点考察类型增加刷题量。
    