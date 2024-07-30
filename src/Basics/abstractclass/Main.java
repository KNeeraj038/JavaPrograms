package Basics.abstractclass;

public class Main {

    // Why Abstract Needed
    /*
    *       - Can't create Object.
    *       - Can make subclass to utilse
    *       - Why ?
    *           - Share feilds from the class who extends it.
    *
    *          - Abstract Method.
    *               - Do not imlepment in  abstract class but class extending the class will be implementing the abstract method.
    *
    *
    * Interface:
    *   - Every method is abstract.
    *   -
    *
    * Diff:
    *   - Can impl. as many as interfaces in Java
    *   - Can Extend only one Abs. Class
    *
    *   - Interface:
    *           Variable is static and final by default.
    *   - Abs.class:
    *       Diff variable instance for each class.
    *
    *
    * Closely related class.   <-- Abstract class
    *
    * Unrelated class, but wanted to do same things.  <-- Interface.
    * */





    public static void main(String[] args) {
        Cat cat = new Cat(10, "Cattee");
        Dog dog = new Dog(20, "Doggo");
        cat.say();
        cat.sayAgain();

        dog.say();
        dog.sayAgain();

        cat.getName();
        dog.getName();

        Cat cat1 = new Cat(10, "Cat");
        Dog dog1 = new Dog(20, "Dog");
        System.out.println(cat1.getName());
        System.out.println(dog1.getName());

    }
}
