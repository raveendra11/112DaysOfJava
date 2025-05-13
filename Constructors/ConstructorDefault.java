package Constructors;

public class ConstructorDefault {
    public ConstructorDefault() {

        boolean lightOn = true;
        boolean fanOn = false;
        System.out.println("Is room light On " + lightOn);
        System.out.println("Is room fan On " + fanOn);
        System.out.println("This is a defalut constructor");
    }


    public static void main(String[] args) {
        ConstructorDefault object = new ConstructorDefault();
    }
}
