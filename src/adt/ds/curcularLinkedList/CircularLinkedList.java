package adt.ds.curcularLinkedList;

/**
 * Created by alice on 1/5/17.
 */
public class CircularLinkedList {
    private Node first;
    private Node last;

    /**
     * indicate if does exist nodes?
     *
     * @return
     */
    private boolean isEmpty() {
        return first == null;
    }

    /**
     * create a node and insert as first element, of circular list
     *
     * @param value
     */
    public void insertFirst(int value) {
        Node newNode = new Node();
        newNode.value = value;

        if (isEmpty()) {
            last = newNode;
        }

        newNode.next = first;
        first = newNode;
    }

    /**
     * Insert a node at the end of myList
     *
     * @param value
     */
    public void insertLast(int value) {
        Node newNode = new Node();
        newNode.value = value;

        if (isEmpty()) {
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;

        }
    }

    /**
     * Remove first node, and return its value
     *
     * @return
     */
    public int deleteFirst() {
        int firstValue = -1;
        if (isEmpty()) { //empty
            last = null;
            return firstValue;
        } else {
            firstValue = first.value;
            if (first == last) {// unique node
                first = null;
                last = null;
            } else {
                first = first.next;
            }
        }
        return firstValue;
    }


    public void displayList() {
        System.out.println("First ---> last:");
        Node currentNode = new Node();
        currentNode = first;
        while (currentNode != null) {
            currentNode.displayNode();
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}
