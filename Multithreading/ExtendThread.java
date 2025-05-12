package Multithreading;

public class ExtendThread {
    public static void main(String[] args) {
        new Threads();
        try{
            for(int i =5;i>0;i--){
                System.out.println("Main Thread: "+i);
                ThreadEg.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting");
    }
}
