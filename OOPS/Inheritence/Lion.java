package OOPS.Inheritence;

public class Lion extends Animal {
    void doHunt(){
        System.out.println("I'm not hungry.");
    }

    public static void main(String[] args) {
        Lion object = new Lion();
        object.doHunt();
        object.doEat();
    }
}
