package Thread.ThreadBasics;

public class ThreadStates {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread State: "+Thread.currentThread().getState());

                try {
                    System.out.println("Thread State: "+Thread.currentThread().getState());
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Exception Occured !"+e.getMessage());
                    System.out.println("Thread State: "+Thread.currentThread().getState());
                }


            }
        });

        th1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        th1.interrupt();


    }
}
