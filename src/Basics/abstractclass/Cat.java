package Basics.abstractclass;

public class Cat extends Animal{

    Cat(int age, String name) {
        super(age, name);
    }

    @Override
    public void say() {
        System.out.println("cat says cat");
    }
}
