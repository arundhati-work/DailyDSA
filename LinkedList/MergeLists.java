package LinkedList;

public class MergeLists {

    public class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode dummy;
        if (list1.val <= list2.val){
            dummy = list1;
            list1 = list1.next;
        } else{
            dummy = list2;
            list2 = list2.next;
        }
        ListNode newHead = dummy;

        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                dummy.next = list1;
                dummy = dummy.next;
                list1 = list1.next;
            }
            else{
                dummy.next = list2;
                dummy = dummy.next;
                list2 = list2.next;
            }
        }

        while (list1 != null){
            dummy.next = list1;
            dummy = dummy.next;
            list1 = list1.next;
        }
        while (list2 != null){
            dummy.next = list2;
            dummy = dummy.next;
            list2 = list2.next;
        }
        return newHead;

    }
}
