package LinkedList;

public class RemoveCycle {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head;
    
    public static void removeLoop(Node head) {
        // code here
        
        if (head == null || head.next == null) return;
        
        Node tortoise = head;
        Node hare = head;
        Node prev;
        
        do{
            if (hare == null || hare.next == null) return;
            tortoise = tortoise.next;
            prev = hare;
            hare = hare.next.next;
        }while (tortoise != hare);
        
        tortoise = head;
        
        if (tortoise == hare){
            while (hare.next != tortoise){
                hare = hare.next;
            }
        } else{
            while (tortoise.next != hare.next){
                tortoise = tortoise.next;
                hare = hare.next;
            }
        }
        
        hare.next = null;
    }
}
