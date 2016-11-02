package adt;

/**
 * Created by alicia.beltran on 01/11/2016.
 */
public class Counter {
    private int value=0;
    private String name =null;

    public Counter(String name){
        this.name =name;
    }

    public void increment(){
        value++;
    }
    public String getCurrentValue(){
        return  name + ": "+ value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}




