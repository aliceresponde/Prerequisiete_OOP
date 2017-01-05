package adt.ds.linkedList;

/**
 * Created by alicia.beltran on 04/11/2016.
 * One direction list of nodes
 * Its  not efficient, when  I want to insert last, then
 * will be nice, to add a Node to point to last node, then it will
 * be a Circular Linked List.
 *
 */
public class SinglyLinkedList {
    private  Node first;

    public SinglyLinkedList(){}

    public boolean isEmpty(){
        return  first == null;
    }

    public void  insertFirst(int value){
        Node mNode = new Node();
        mNode.value =value;

        mNode.next = first;
        first = mNode;
    }

    public Node deleteFirst (){
        Node mNode = first;
        first = first.next;
        return  mNode;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.value = data;

        if (isEmpty()){
            first = newNode;
        }else{
            Node currentNode = new Node();
            currentNode =  first;
            while ( currentNode.next != null ){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void  displayList(){
        System.out.println("List from Head --> Tail :");
        Node currentN = first;
        while (currentN != null){
            currentN.displayNode();
            currentN = currentN.next;
        }
        System.out.println();
    }
}
