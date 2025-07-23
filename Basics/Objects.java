package Basics;

public class Objects {

    int age = 27;
    String name = "Ishu";
    String gender = "female";

    public static void main(String[] args) {
        //object creation
        Objects object = new Objects();

        //printing age and name with object
        System.out.println(object.age);
        System.out.println(object.name);
        System.out.println(object.gender);
    }
}
