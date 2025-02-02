package LinkedList;

import LinkedList.MergeLists.ListNode;

public class DetectCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode tortoise = head;
        ListNode hare = head;

        while (hare!=null && hare.next!=null){
            tortoise = tortoise.next;
            hare = hare.next.next;
            if (tortoise == hare) return true;
        }
        return false;
    }
}
