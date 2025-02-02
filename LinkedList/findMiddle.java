package LinkedList;

import LinkedList.MergeLists.ListNode;

public class findMiddle {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode tortoise = head;
        ListNode hare = head;

        while(hare != null && hare.next!=null){
            tortoise = tortoise.next;
            hare = hare.next.next;
        }

        return tortoise;
    }
}
