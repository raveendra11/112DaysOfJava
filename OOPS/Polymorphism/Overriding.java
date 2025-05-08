package OOPS.Polymorphism;

public class Overriding extends Sub{

    void doRide(){
        System.out.println("I need a ride to Chicago");
    }

    public static void main(String[] args) {
        Overriding object = new Overriding();
        object.doRide();
    }
}
