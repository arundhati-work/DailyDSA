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

    public int find(int data){
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }

        Node current = head;
        int pos = 1;

        while (current != null){
            if (current.data == data){
                System.out.println("Element "+data+" found at position "+pos);
                return pos;
            }
            pos++;
            current = current.next;
        }

        System.out.println("Element not found");
        return -1;
    }

    public int getSize(){
        if (head == null) return 0;

        int size = 0;
        Node current = head;

        while (current != null){
            size++;
            current = current.next;
        }

        return size;
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

    public void deleteByIndex(int pos){
        if (head == null){
            System.out.println("List is empty");
            return;
        }
        if (pos == 0) {
            this.head = head.next;
            return;
        }
        Node current = head;

        for(int i=0; current != null && i < pos-1; i++){
            current = current.next;
        }

        if (current == null || current.next == null){
            System.out.println("Invalid position");
            return;
        }

        current.next = current.next.next;
    }

    public void reverseList(){
        if (head == null || head.next==null) return;
        Node prev = head;

        Node curr = head.next;
        Node post = head.next.next;
        prev.next = null;

        while (curr!=null){
            curr.next = prev;
            prev = curr;
            curr = post;
            if (curr != null)
                post = post.next;
        }

        this.head = prev;
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
        System.out.println("Linked List size: "+SLL.getSize());
        SLL.deleteByIndex(1);
        SLL.printList();
        SLL.reverseList();
        SLL.printList();
    }
}
