import adt.Counter;
import adt.ds.linkedList.Node;
import adt.ds.linkedList.SinglyLinkedList;
import adt.ds.queue.Queue;
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
        // stackSample();
        //System.out.println(reverseWord("Alicia"));
        //queueSample();
        //nodeLinkedSample();
        singlyLinkedListSample();
    }

    /**
     * Create a siglyLinkedList, insert numbers as first
     * {88,99,50,100}
     * Insetert others at the end
     * {88,99,50,100,9913, 777777}
     */
    private static void singlyLinkedListSample() {
        SinglyLinkedList mList = new SinglyLinkedList();
        mList.insertFirst(100);
        mList.insertFirst(50);
        mList.insertFirst(99);
        mList.insertFirst(88);
        //88,99,50,100

        mList.insertLast(99913);
        mList.insertLast(7777777);
        //88,99,50,100,9913, 777777

        mList.displayList();
    }

    private static void nodeLinkedSample() {
        Node nodeA = new Node();
        nodeA.value = 1;

        Node nodeB = new Node();
        nodeB.value=  5;

        Node nodeC = new Node();
        nodeC.value = 2;

        Node nodeD = new Node();
        nodeD.value = 8;


        // link a,b,c
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println("#Linked nodes (A): " + linkedNodes(nodeA));
        System.out.println("#Linked nodes (B): " + linkedNodes(nodeB));
        System.out.println("#Linked nodes (C): " + linkedNodes(nodeC));

    }

    /**
     * Count number of nodes linked to head (first node)
     * @param head
     * @return
     */
    public static int linkedNodes(Node head){
        Node aux = new Node();
        aux = head;

        int nNodes = 0;
        while (aux!= null){
            nNodes++;
            aux = aux.next;
        }

        return  nNodes;
    }

    private static void queueSample() {
        Queue mQueue = new Queue(3);
        mQueue.insert(12);
        mQueue.insert(120);
        mQueue.insert(1200);
        mQueue.insert(1);
        mQueue.insert(1);
        mQueue.insert(1);
        mQueue.insert(1);
        mQueue.view();
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
        mStack.push(90);
        mStack.push(100);

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
