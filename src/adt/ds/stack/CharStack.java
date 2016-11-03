package adt.ds.stack;

/**
 * Created by alicia.beltran on 02/11/2016.
 * Fixed array, with data ...
 * the top index change acording  push/pop
 */
public class CharStack {
    private int maxSize;
    protected char [] stackArray;
    private  int top;

    public CharStack(int size){
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;  // no elemnts in stack
    }

    /**
     * top = -1  for not elements
     * top = n for n+1 elements
     * add element in top and increase topp
     * Note : be careful to do not overload the stack
     * @param element
     */
    public void push(char element){
        if (!isFull()) {
            top++;
            stackArray[top] = element;
        }else {
            System.out.println("The stack is already full");
        }
    }

    /**
     * decrese top counter, and retur top element
     * @return
     */
    public char pop(){
        if (!isEmty()) {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }else {
            System.out.println("The stack  is already empty");
            return  '#';
        }
    }

    public char peak(){
        return stackArray[top];
    }

    public boolean isEmty(){
        return  top == -1;
    }

    public boolean isFull(){
        return  top == (maxSize-1) ;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        CharStack mCopy = new CharStack(maxSize);
        mCopy = this;

        while (!mCopy.isEmty()){
          stringBuffer.append(mCopy.pop());
        }
        return stringBuffer.toString();
    }
}
