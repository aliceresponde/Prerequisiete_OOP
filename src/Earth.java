import adt.Counter;
import adt.ds.stack.CharStack;
import adt.ds.stack.Stack;

/**
 * Created by alicia.beltran on 31/10/2016.
 */
public class Earth {
    /**
     * Entry point for all Java app
     * Code is exceuted line by line in order
     * objects are created when program is running
     * @param args
     */
    public static void main(String args[]){
       // humanSample();
       // counterSample();
        //stackSample();
        System.out.println(reverseWord("Alicia"));
    }

    public static String reverseWord(String word){
        int i =0;
        CharStack mWordOnStak  = new CharStack(word.length());
        // inset into stack by char
        while (i< word.length()){
            char mChar = (char) word.charAt(i);
            mWordOnStak.push(mChar);
            i++;
        }

        return mWordOnStak.toString();
    }

    private static void humanSample() {
        Human alice = new Human("Alicia", 30, "black", 161);
        Human gabriela = new Human("Gabriela", 32, "brown", 157);
        alice.speak();
        gabriela.speak();
    }

    private static void stackSample() {
        Stack mStack = new Stack(10);
        mStack.push(20);
        mStack.push(40);
        mStack.push(60);
        mStack.push(80);

        while (!mStack.isEmty()){
            System.out.println(mStack.pop());
        }
    }

    private static void counterSample() {
        Counter mCounter = new Counter("Counter");
        System.out.println(mCounter.getCurrentValue());
        mCounter.increment();
        mCounter.increment();
        mCounter.increment();
        mCounter.increment();
        System.out.println(mCounter.getCurrentValue());
    }
}
