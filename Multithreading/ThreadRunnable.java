package Multithreading;

public class ThreadRunnable implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(i + "Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        ThreadRunnable object = new ThreadRunnable();
        Thread td = new Thread(object);
        td.start();
        int i = 0;
        while (true) {
            System.out.println(i + "World");
            i++;
        }
    }
}
