package DesignPatterns.SingletonDesignPattern;

public class Singleton {
    private static Singleton instance;

    private volatile String value = "";

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if(instance != null ){
            return instance;
        }
        else{ // Making it thread safe.
            synchronized (Singleton.class){
                instance = new Singleton(value);
            }
        }
        return instance;
    }

    public void print(){
        System.out.println(value);
    }
}
