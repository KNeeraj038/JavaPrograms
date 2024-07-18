package ProgrammingQuestions.ThreadSynUsingString;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable(){
            String lock = "abc";  // Trying changing this values make both lock values as same and in another case as different
            @Override
            public void run() {
                synchronized (lock){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Thread 1");
                    lock.notify();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable(){
            String lock = "abc";    // Trying changing this values.

            @Override
            public void run() {
                synchronized (lock){
                    System.out.println("Thread 2");
                    lock.notify();
                }
            }
        });

        thread2.start();
        Thread.sleep(300);
        thread1.start();
    }
}
