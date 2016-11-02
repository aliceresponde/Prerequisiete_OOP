/**
 * Created by alicia.beltran on 01/11/2016.
 */
public class Animal {

    int age;
    int weghtInCm;
    String gender;

    public Animal(int age, int weghtInCm, String gender) {
        this.age = age;
        this.weghtInCm = weghtInCm;
        this.gender = gender;
    }

    public void eat() {
        System.out.println("I´m eating .....");
    }

    public void sleep() {
        System.out.println("Sleep ...");
    }


}
