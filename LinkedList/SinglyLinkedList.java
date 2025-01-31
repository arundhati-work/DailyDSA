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

    public void insertAtTail(int data){
        if (head == null){
            this.head = new Node(data);
            return;
        }

        Node current = head;
        Node temp = new Node(data);

        while(current.next != null){
            current = current.next;
        }

        current.next = temp;
    }

    public void find(int data){
        if (head == null) System.out.println("List is empty");

        Node current = head;
        int pos = 1;

        while (current != null){
            if (current.data == data){
                System.out.println("Element "+data+" found at position "+pos);
                break;
            }
            pos++;
            current = current.next;
        }
    }

    public void deleteNode(int data){
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;

        while (current != null){
            if ( (current.next != null) && (current.next.data == data)){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void printList(){
        if (head == null) return;

        Node current = head;

        while (current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        
        SinglyLinkedList SLL = new SinglyLinkedList();
        SLL.insertAtHead(5);
        SLL.insertAtHead(10);
        SLL.insertAtHead(15);
        SLL.insertAtHead(20);
        SLL.insertAtTail(25);
        SLL.insertAtTail(30);
        SLL.insertAtTail(35);
        SLL.insertAtTail(40);
        SLL.printList();
        SLL.deleteNode(25);
        SLL.printList();
        SLL.deleteNode(10);
        SLL.printList();
        SLL.find(5);
    }
}
