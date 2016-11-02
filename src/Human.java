/**
 * Created by alicia.beltran on 31/10/2016.
 */
public class Human {
    String name;
    int age;
    String eyeColor;
    int heightInCm;


    // ===============================Constructor ======================
    public Human(){}

    public Human(String name, int age, String eyeColor, int heightInCm) {
        super();
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.heightInCm = heightInCm;
    }

    //===================================Human Behaivior ============================
    public void speak(){
        System.out.println("My name is " +name );
        System.out.println("I´m  " +age + " years old" );
        System.out.println("My eyes are  " +eyeColor );
        System.out.println("I´m " +heightInCm + " cm " );
    }
    public void eat(){
        System.out.println("I´m eating .....");
    }

    public void walk(){
        System.out.println("Waling ...");
    }

    public void work(){
        System.out.println("Working .....");
    }
}
