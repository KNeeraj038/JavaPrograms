package DesignPatterns.SingletonDesignPattern;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton.getInstance("Hello").print();
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton.getInstance("Hey").print();
            }
        });
        thread2.start();
    }
}
