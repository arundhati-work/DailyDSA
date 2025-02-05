package LinkedList;

import LinkedList.MergeLists.ListNode;

public class palindrome {
    public ListNode middle(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode tortoise = head;
        ListNode hare = head;

        while (hare != null && hare.next != null){
            tortoise = tortoise.next;
            hare = hare.next.next;
        }

        return tortoise;
    }

    public ListNode reverse(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode post = head.next;

        while (curr != null){
            curr.next = prev;
            prev = curr;
            curr = post;
            if (post != null) post = post.next;
        }

        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode mid = middle(head);
        ListNode rev = reverse(mid);

        while (rev != null){
            if (head.val != rev.val) return false;
            head = head.next;
            rev = rev.next;
        }

        return true;
    }
}
