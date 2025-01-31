package LinkedList;

public class SinglyLinkedList {
    
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    Node head;

    public SinglyLinkedList(){
        this.head = null;
    }
}
