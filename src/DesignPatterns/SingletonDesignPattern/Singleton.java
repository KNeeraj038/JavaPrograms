package DesignPatterns.SingletonDesignPattern;

public class Singleton {
    private static Singleton instance;

    private volatile String value = "";

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        // double-checked locking design pattern
        if(instance == null) {
            synchronized (Singleton.class){
                if(instance == null) {
                    instance = new Singleton(value);
                }
            }
        }
        return instance;
    }

    public void print(){
        System.out.println(value);
    }
}
