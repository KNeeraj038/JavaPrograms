package Basics.abstractclass;

public abstract class Animal {
    private int age;
    protected String name;

    Animal(int age, String name) {      // Constructor Possible.
        this.age = age;
        this.name = name;
    }

    public abstract void say();     // Abstract method possible

    public void sayAgain(){
        System.out.println("I am an "+name+" animal");
    }

    public String getName() {
        return name;
    }
}
