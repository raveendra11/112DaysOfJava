package Multithreading;

public class Threads extends Thread {
    Threads(){
        super("Demo Thread");
        System.out.println("Child thread: "+this);
        start();
    }
    public void run(){
        try{
            for(int i=5;i>0;i--) {
                System.out.println("Child Thread: " + i);
                ThreadEg.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread");
    }
}
