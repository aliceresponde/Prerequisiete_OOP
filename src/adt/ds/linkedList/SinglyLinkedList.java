package adt.ds.linkedList;

/**
 * Created by alicia.beltran on 04/11/2016.
 * One direction list of nodes
 *
 */
public class SinglyLinkedList {
    private  Node head; //first

    public SinglyLinkedList(){}

    public boolean isEmpty(){
        return  head == null;
    }

    public void  insertFirst(int value){
        Node mNode = new Node();
        mNode.value =value;

        mNode.next = head;
        head = mNode;
    }

    public Node deleteFirst (){
        Node mNode = head;
        head = head.next;
        return  mNode;
    }

    public void  displayList(){
        System.out.println("List from Head --> Tail :");

        Node currentN = head;
        while (currentN != null){
            currentN.displayNode();
            currentN = currentN.next;
        }

        System.out.println();
    }
}
