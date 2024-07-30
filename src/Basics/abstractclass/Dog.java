package Basics.abstractclass;

public class Dog extends Animal{

    Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void say() {
        System.out.println("Dog says Dog");
    }
}
