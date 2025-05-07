package OOPS.Abstraction;

public class Dog extends Animal {

    void doFeed() {
        System.out.println("Feeding");
    }

    public static void main(String[] args) {
        Dog object = new Dog();
        object.doFeed();
        object.doEat();
    }
}
