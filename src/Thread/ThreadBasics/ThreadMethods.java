package Thread.ThreadBasics;

public class ThreadMethods extends Thread {

    public ThreadMethods(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Started");

        for (int i = 0; i < 10; i++) {
            //System.out.println(Thread.currentThread().getName() +" is running !");
            try {
                Thread.sleep(100);
                Thread.yield();
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted");
            }
        }
        System.out.println(Thread.currentThread().getName() + " is COMPLETED --- !");
    }

    public static void main(String[] args) {
        ThreadMethods th1 = new ThreadMethods("Thread1");
        ThreadMethods th2 = new ThreadMethods("Thread2");
        ThreadMethods th3 = new ThreadMethods("Thread3");

        th3.setPriority(Thread.MAX_PRIORITY);
        th2.setPriority(Thread.MIN_PRIORITY);
        th2.setDaemon(true);
        th3.setDaemon(true); // Doesn't wait for this thread to complete its task.

        th1.start();
        th2.start();
        th3.start();

        /*
         * start()
         * run()
         * join()
         * interrupt()
         * setPriority()
         * yield()   // Giving hint that CPU is stop its task and allocate to othre task if needed.
         * setDeamon()
         * */

        th1.interrupt();


//        try {
//            th1.join();
//            th1.join();
//            th3.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("main thread task completed");
    }
}
