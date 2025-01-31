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

    public void insertAtHead(int data){
        if (head == null){
            this.head = new Node(data);
            return;
        }

        Node current = new Node(data);
        current.next = head;
        this.head = current;
    }

    public void printList(){
        if (head == null) return;

        Node current = head;

        while (current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }

    public static void main(String[] args){
        
        SinglyLinkedList SLL = new SinglyLinkedList();
        SLL.insertAtHead(5);
        SLL.insertAtHead(10);
        SLL.insertAtHead(15);
        SLL.insertAtHead(20);
        SLL.printList();
    }
}
