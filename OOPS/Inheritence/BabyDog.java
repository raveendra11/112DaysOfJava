package OOPS.Inheritence;

public class BabyDog extends Dog{
    void doWeep(){
        System.out.println("Weeping...");
    }

    public static void main(String[] args) {
        BabyDog object = new BabyDog();
        object.doWeep();
        object.doBark();
        object.doEat();
    }
}
