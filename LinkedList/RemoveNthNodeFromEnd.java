package LinkedList;

import LinkedList.MergeLists.ListNode;

public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return head;
        ListNode tortoise = head;
        ListNode hare = head;

        for(int i=0; i<=n; i++){
            if (hare == null) return head.next;
            hare = hare.next;
        }

        while (hare != null){
            tortoise = tortoise.next;
            hare = hare.next;
        }

         if (tortoise.next != null)
            tortoise.next = tortoise.next.next;
        return head;
    }
}
