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

    public void reverseIterative(){

    }

    public void reverseRecursive(){

    }
    
    public void insertAtHead(int data){

    }

    public void insertAtTail(int data){

    }

    public void deleteNode(int pos){

    }

    public void traverseForward(){

    }

    public void traverseBackward(){

    }

    public void printList(){

    }

    public static void main(String[] args){

    }
}
