package Thread.ThreadBasics;

public class ThreadCreation {
    public static void main(String[] args){
        System.out.println("Hello");

        // Way 1
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName());

            }
        }, "Thread-1");

        th1.start();

        // Way 2
        CustomThread th2 = new CustomThread("CustomThread-1");
        th2.start();

        Thread th3 = new Thread(new CustomRunnable(), "ThreadWithCustomRunnable-1");
        th3.start();


        try {
            th1.join();
            th2.join();
            th3.join();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Completed running the Main Method");
    }


    static class CustomThread extends Thread {

        CustomThread(String threadName){
            super(threadName);
        }

        @Override
        public void run(){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    static class CustomRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
