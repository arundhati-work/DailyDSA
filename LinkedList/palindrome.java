package LinkedList;

import LinkedList.MergeLists.ListNode;

public class palindrome {
    public ListNode middle(ListNode head){
        if (head == null || head.next == null) return head;

        ListNode tortoise = head;
        ListNode hare = head;

        while (hare.next != null && hare.next.next != null){
            tortoise = tortoise.next;
            hare = hare.next.next;
        }
        return tortoise;
    }

    public ListNode reverse(ListNode head){
        
        if (head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode current = head;
        ListNode post = head.next;

        while (current != null){
            current.next = prev;
            prev = current;
            current = post;
            if (post!= null) post = post.next;
        }
        return prev;
    }


    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode midElement = middle(head);

        ListNode elementAfterMid = midElement.next;
        midElement.next = null;
        ListNode rev2 = reverse(elementAfterMid);

        ListNode current = head;

        while (current!= null && rev2 != null){
            if (current.val == rev2.val){
                current = current.next;
                rev2 = rev2.next;
            } else{
                return false;
            }
        }
        return true;
    }
}
