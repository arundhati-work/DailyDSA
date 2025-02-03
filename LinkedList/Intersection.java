package LinkedList;

import LinkedList.MergeLists.ListNode;

// both pointers move the exact same distance and hence meet at the intersection point

public class Intersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode L1 = headA;
        ListNode L2 = headB;

        while (L1 != L2){
            
            if (L1 == null){
                L1 = headB;
            } else{
                L1 = L1.next;
            }
            if (L2 == null){
                L2 = headA;
            }else{
                L2 = L2.next;
            }
        }
        return L1;
    }
}
