package LinkedList;

import LinkedList.MergeLists.ListNode;

public class StartingPointOfCycle {
  public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode tortoise = head;
        ListNode hare = head;

        do{
            if (hare == null || hare.next == null) return null;
            tortoise = tortoise.next;
            hare = hare.next.next;
        } while (tortoise != hare);

        tortoise = head;

        while (tortoise != hare){
            tortoise = tortoise.next;
            hare = hare.next;
        }

        return tortoise;
    }  
}
