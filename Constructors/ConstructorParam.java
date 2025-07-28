package Constructors;

public class ConstructorParam {

    ConstructorParam(int age, String name) {
        System.out.println("This is parameterized constructor");
        System.out.println("My name is " + name + " and I'm " + age + " Old");

    }

    public static void main(String[] args) {
        ConstructorParam object = new ConstructorParam(27, "Ishu");
        ConstructorParam object = new ConstructorParam(27, "Ravi");
        
    }
}
