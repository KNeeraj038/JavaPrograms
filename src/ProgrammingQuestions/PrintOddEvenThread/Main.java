package ProgrammingQuestions.PrintOddEvenThread;

public class Main {

    public static volatile int START_NUMBER = 0;
    public static volatile int END_NUMBER = 50;

    public static void main(String[] args) {

        Object lockObject = new Object();

        Thread evenThread = new Thread(new EvenThread(lockObject), "Even Thread");
        Thread oddThread = new Thread(new OddThread(lockObject), "Odd Thread");

        evenThread.start();
        oddThread.start();
    }
}
