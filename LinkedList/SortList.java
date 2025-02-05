package LinkedList;

public class SortList {

    public class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public ListNode middle(ListNode head){
        if (head == null || head.next == null) return head;

        ListNode tortoise = head;
        ListNode hare = head;
        ListNode prev = null;

        while (hare != null && hare.next != null){
            prev = tortoise;
            tortoise = tortoise.next;
            hare = hare.next.next;
        }

        if (prev != null){
            prev.next = null;
        }

        return tortoise;
    }

    public ListNode merge(ListNode A, ListNode B){
        if (A == null) return B;
        if (B == null) return A;
        
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (A != null && B != null){
            if (A.val <= B.val){
                current.next = A;
                A = A.next;
            } else{
                current.next = B;
                B = B.next;
            }
            current = current.next;
        }

        current.next = (A != null)? A : B;

        return dummy.next;
    }


    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode mid = middle(head);
        ListNode leftSorted = sortList(head);
        ListNode rightSorted = sortList(mid);
        return merge(leftSorted, rightSorted);
    }
}
