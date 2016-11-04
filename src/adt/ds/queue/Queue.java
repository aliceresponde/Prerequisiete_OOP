package adt.ds.queue;

/**
 * Created by alicia.beltran on 03/11/2016.
 * FIFO
 */
public class Queue {
    private int maxSize;
    private long[] queueArray;
    private int frontIndex;
    private int lastIndex;
    private int nItems;

    public Queue(int size) {
        queueArray = new long[size];
        maxSize = size;
        frontIndex = 0;
        lastIndex = -1; // no items
        nItems = 0;
    }

    /**
     * Remove firstItem
     * @return
     */
    public long remove(){
        long firts = queueArray[frontIndex];
        frontIndex++;
        if (frontIndex==maxSize){
            frontIndex=0;
        }
        nItems--;

        return  firts;
    }

    public boolean isEmpty(){
        return nItems == 0;
    }

    public boolean isFull(){
        return nItems == maxSize;
    }

    /**
     * Return firs element
     * @return
     */
    public long peekFront(){
        return queueArray[frontIndex];
    }

    /**
     * insert element on lastPosition (at the end)
     * @param element
     */
    public void insert(long element){

        if (!isFull()) {

            // Circular Queue
            if (lastIndex == maxSize-1){
                lastIndex = -1;
            }

            lastIndex++;
            queueArray[lastIndex] = element;
            nItems++;
        }else {
            System.out.println("Queue is full");
        }
    }

    public void view() {
        System.out.print("[");
        for (long i : queueArray){
            System.out.print(i + " ");
        }
        System.out.print("]");
    }
}
