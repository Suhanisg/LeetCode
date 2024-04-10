package main;

public class LinkedListCycle {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) {
                return false;
            }

            ListNode a = head;
            ListNode b = head;

            while (b.next != null && b.next.next != null) {
                b = b.next.next;
                a = a.next;

                if (a== b) {
                    return true;
                }
            }
            return false;
        }
}
