package adt.ds.stack;

/**
 * Created by alicia.beltran on 02/11/2016.
 */
public class Stack {
    private int maxSize;
    protected long [] stackArray;
    private  int top;

    public Stack (int size){
        maxSize = size;
        stackArray = new long[maxSize];
        top = -1;  // no elemnts in stack
    }
}
