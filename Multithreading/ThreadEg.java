package Multithreading;

public class ThreadEg extends Thread{
    public void run(){
        System.out.println("This is a new thread.");
    }

    public static void main(String[] args) {
        ThreadEg object = new ThreadEg();
        object.start();
        System.out.println("Main Thread.");
    }
}
