package Multithreading;

public class MyThread extends Thread {

    public void run() {
        int i = 0;

        while (true) {
            System.out.println(i +"Hello");
            i++;
        }

    }

    public static void main(String[] args) {
        MyThread object = new MyThread();
        object.start();
        int i = 0;

        while (true) {
            System.out.println(i+"World");
            i++;
        }
    }
}
