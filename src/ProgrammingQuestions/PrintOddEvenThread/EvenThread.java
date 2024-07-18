package ProgrammingQuestions.PrintOddEvenThread;

public class EvenThread implements Runnable{

    private final Object lock;

    public EvenThread(Object lockObject) {
        this.lock = lockObject;
    }

    @Override
    public void run() {
        synchronized (lock){
            for(int i=Main.START_NUMBER; i<Main.END_NUMBER; i++){
                if(i%2 == 0){
                    try {
//                        System.out.println(Thread.currentThread().getName() + " "+"Waiting for lock: "+i);
                        lock.wait();
                        System.out.println(Thread.currentThread().getName() + ": " + i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else{
//                    System.out.println(Thread.currentThread().getName() + " "+"Notified: "+i);
                    lock.notify();
                }
            }
        }
    }
}
