package adt.ds.curcularLinkedList;

import adt.Counter;
import adt.ds.linkedList.Node;
import adt.ds.linkedList.SinglyLinkedList;
import adt.ds.queue.Queue;
import adt.ds.stack.CharStack;
import adt.ds.stack.Stack;

/**
 * Created by alicia.beltran on 31/10/2016.
 */
public class Main {
    /**
     * Create a circular linked List with numbers {1,2...10}
     * @param args
     */
    public static void main(String args[]){
        CircularLinkedList mList = new CircularLinkedList();
        insetValuesOneToTen(mList);
        mList.displayList();
        System.out.println("Delete 1?");
        System.out.println("deleted :"  + mList.deleteFirst());
        mList.displayList();
    }

    private static void insetValuesOneToTen(CircularLinkedList mList) {
        mList.insertFirst(10);
        mList.insertFirst(9);
        mList.insertFirst(8);
        mList.insertFirst(7);
        mList.insertFirst(6);
        mList.insertFirst(5);
        mList.insertFirst(4);
        mList.insertFirst(3);
        mList.insertFirst(2);
        mList.insertFirst(1);
        mList.insertLast(11);
    }
}
