package LinkedList;

import java.util.Stack;

public class palindromeWithStack {

    public class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        
        ListNode tortoise = head;
        ListNode hare = head;
        Stack<Integer> stack = new Stack<>();

        while (hare != null && hare.next != null){
            stack.push(tortoise.val);
            tortoise = tortoise.next;
            hare = hare.next.next;
        }

        // if odd number of elements, skip the middle element
        if (hare != null) tortoise = tortoise.next;

        while (tortoise != null){
            if (tortoise.val != stack.pop()) return false;
            tortoise = tortoise.next;
        }

        return stack.isEmpty();
    }
}
