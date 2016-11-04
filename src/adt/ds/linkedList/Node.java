package adt.ds.linkedList;

/**
 * Each element of linkedList
 * Created by alicia.beltran on 04/11/2016.
 */
public class Node {
    public int value;
    public Node next = null;

    public void displayNode(){
        System.out.println("{ " + value + " }");
    }
}
