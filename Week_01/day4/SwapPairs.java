package day4;

/**
 * @description:  两两交换链表中的节点 leetcode-24
 */
public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode temp = pre;
        while (temp.next != null && temp.next.next != null) {
            ListNode start =  temp.next;
            ListNode end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return pre.next;
    }

    class ListNode {

        int val;

        ListNode next;

        ListNode(int x) { val = x; }

    }
}
