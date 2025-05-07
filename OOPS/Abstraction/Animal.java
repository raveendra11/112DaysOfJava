package OOPS.Abstraction;

abstract class Animal {
    abstract void doFeed();

    void doEat() {
        System.out.println("I'm not hungry.");
    }
}
