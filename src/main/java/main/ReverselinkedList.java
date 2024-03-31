package main;

public class ReverselinkedList {
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode pre = null;
            ListNode current = head;
            ListNode nextNode = null;
            while (current != null) {
                nextNode = current.next;
                current.next = pre;
                pre = current;
                current = nextNode;
            }
            return pre;
        }
    }
}
