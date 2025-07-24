package Constructors;

public class ConstructorOverload {

    ConstructorOverload(int age, String name){
        System.out.println("This is constructor overloading");
        System.out.println("My name is " + name + " and I'm " + age + " Old");

    }

    ConstructorOverload(int age, String name, boolean say){

        System.out.println("This is constructor overloading");
        System.out.println("My name is " + name + " and I'm " + age + " Old."+"I always say "+say);
    }

    ConstructorOverload(int age,boolean say){

        System.out.println("This is constructor overloading");
        System.out.println(" I'm " + age + " Old"+" I always say "+say);
    }

    public static void main(String[] args) {

        ConstructorOverload object = new ConstructorOverload(27,"Ishu");
        ConstructorOverload object2 = new ConstructorOverload(27,"Ishu",true);
        ConstructorOverload object3 = new ConstructorOverload(27,false);
        ConstructorOverload object3 = new ConstructorOverload(27,"Ravi",false);

    }
}
