package Methods;

public class Car {

    public void doDrive(){
        System.out.println("I'm driving...");
    }

    public static void main(String[] args) {
        Car object = new Car();
        object.doDrive();
    }
}
