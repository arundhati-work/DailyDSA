package LinkedList;

public class DoublyLinkedList {

    public class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;

    DoublyLinkedList(){
        this.head = null;
    }
    

    public int getSize(){
        Node current = this.head;
        int size = 0;

        while (current != null){
            size++;
            current = current.next;
        }

        return size;
    }

    public void find(){

    }
    
    public void insertAtHead(int data){
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void insertAtTail(int data){
        if (head == null){
            head = new Node(data);
            return;
        }

        Node current = head;
        Node newNode = new Node(data);

        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }

    public void deleteNode(int pos){
        if (head == null) return;

        if (pos == 0){
            head = head.next;
            if (head != null)
                head.prev = null;
            return;
        }

        Node current = head;

        while (current != null){
            if (pos == 0){
                Node previous = current.prev;
                Node post = current.next;
                previous.next = post;
                if (post!=null) post.prev = previous;
                return;
            }
            pos--;
            current = current.next;
        }
        System.out.println("Position out of bounds. No deletion performed.");
    }

    public void traverseForward(){

        if (head == null) return;

        Node current = head;
        System.out.println("traverse forward");

        while (current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    public void traverseBackward(){

        if (head == null) return;

        System.out.println("traverse backward");

        Node current = head;

        while (current.next != null){
            current = current.next;
        }

        while (current != null){
            System.out.print(current.data+" ");
            current = current.prev;
        }

    }

    public void reverseIterative(){

    }

    public void reverseRecursive(){

    }

    public void printList(){

        Node current = head;
        System.out.println();

        while (current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        
    }

    public static void main(String[] args){
        DoublyLinkedList DLL = new DoublyLinkedList();
        DLL.insertAtHead(5);
        DLL.insertAtHead(10);
        DLL.insertAtHead(15);
        DLL.insertAtTail(20);
        DLL.insertAtTail(25);
        DLL.insertAtTail(30);
        DLL.printList();
        System.out.println("Size: "+DLL.getSize());
        DLL.traverseForward();
        DLL.traverseBackward();
        DLL.deleteNode(1);
        DLL.printList();
        DLL.deleteNode(0);
        DLL.printList();
        DLL.deleteNode(3);
        DLL.printList();
        DLL.deleteNode(45);
        DLL.printList();
    }
}
