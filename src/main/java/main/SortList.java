package main;

public class SortList {
    class Solution {
        public ListNode getMid(ListNode head){
            ListNode slow=head, fast=head.next;
            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }
        public ListNode merge(ListNode left, ListNode right){
            ListNode dummy = new ListNode();
            ListNode tail = dummy;

            while(left != null && right != null){
                if(left.val < right.val){
                    tail.next = left;
                    left = left.next;
                }else{
                    tail.next = right;
                    right = right.next;
                }
                tail = tail.next;
            }
            if(left != null){
                tail.next = left;
            }
            if(right != null){
                tail.next = right;
            }
            return dummy.next;
        }
        public ListNode sortList(ListNode head) {
            if(head == null || head.next == null){
                return head;
            }
            ListNode left = head;
            ListNode right = getMid(head);
            ListNode tmp = right.next;
            right.next = null;
            right = tmp;

            left = sortList(left);
            right = sortList(right);
            return merge(left, right);
        }
    }

}
