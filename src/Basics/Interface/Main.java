package Basics.Interface;

public class Main {
    // Why Abstract Needed
    /*
     *       - Can't create Object.
     *       - Can make subclass to utilise
     *       - Why ?
     *           - Share fields from the class who extends it.
     *
     *          - Abstract Method.
     *               - Do not implement in  abstract class but class extending the class will be implementing the abstract method.
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
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

        Developer dev = new Developer();

        dev.startCoding(laptop);
        dev.startCoding(desktop);

    }

    static class Developer {
        void startCoding(Computer computer){
            computer.code();
        }
    }
}
