# 学习笔记

## 作业：

- **写一个关于 HashMap 的小总结**

    #### _HashMap源码解析（基于JDK1.8）_
    
    - 六个重要参数
    
        - 默认初始容量：16
        
        - 最大容量：2的30次方
        
        - 默认加载因子：0.75
        
        - 链表转红黑树的阈值：8。当链表长度大于该值时，链表转为红黑树。
        
        - 红黑树转链表的阈值：6。当红黑树内长度小于该值时，红黑树转为链表。
        
        - 最小树形化容量阈值：64。当哈希表的容量大于该值时，才允许树形化链表。否则如果桶内元素过多，则进行扩容。为避免扩容和树形化时产生冲突，该值至少为4*链表转红黑树的阈值。
        
        // TODO
    
- **有效的字母异位词**

    _Week_02.other.IsAnagram.java_

- **两数之和**

    _Week_02.other.IsAnagram.java_

- **N 叉树的前序遍历**

    _Week_02.other.Preorder.java_
    
- **字母异位词分组**
    
    _Week_02.other.GroupAnagram.java_

- **二叉树的中序遍历**
    
    _Week_02.other.InorderTraversal.java_

- **二叉树的前序遍历**

    _Week_02.other.PreorderTraversal.java_
    
- **N 叉树的层序遍历**

    _Week_02.other.Levelorder.java_

- **丑数**

    _Week_02.other.IsUgly.java_

- **前 K 个高频元素**

    _Week_02.other.TopKFrequent.java_
    
## 学习总结：
  
    因为生病，第二周的大部分时间都是在病床上度过的。精力问题，刷题量和刷题遍数都没办法得到保证。除了每日一题之外，只能保证把作业完成。
    
    遍数不够的情况下，刷题效果确实大打折扣。现在的感觉是，如果刷题遍数和刷题量都能得到保障的话当然最好。如果不能，刷题遍数的优先级应该要大于刷题量。
    
    