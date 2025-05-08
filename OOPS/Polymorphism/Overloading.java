package OOPS.Polymorphism;

public class Overloading {
    void doOverload(String grass, String water) {
        System.out.println("Eating grass.");
    }

    void doOverload(String grass, String water, String milk) {
        System.out.println("Drinking water and milk.");
    }

    void doOverload(String milk,int quantity ){
        System.out.println("Put "+quantity+"L milk.");
    }
    public static void main(String[] args) {
        Overloading object = new Overloading();
        object.doOverload("grass", "water");
        object.doOverload("grass", "water", "milk");
        object.doOverload("amul",5);
    }
}
