import adt.Counter;

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
      /*
        Human alice = new Human("Alicia", 30, "black", 161);
        Human gabriela = new Human("Gabriela", 32, "brown", 157);
        alice.speak();
        gabriela.speak();
      */

        Counter mCounter = new Counter("Counter");
        System.out.println(mCounter.getCurrentValue());
        mCounter.increment();
        mCounter.increment();
        mCounter.increment();
        mCounter.increment();
        System.out.println(mCounter.getCurrentValue());
    }
}
