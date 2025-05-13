package Multithreading;

public class ThreadExtend extends Thread {

    public void run() {
        int i = 0;

        while (true) {
            System.out.println(i +"Hello");
            i++;
        }

    }

    public static void main(String[] args) {
        ThreadExtend object = new ThreadExtend();
        object.start();
        int i = 0;

        while (true) {
            System.out.println(i+"World");
            i++;
        }
    }
}
