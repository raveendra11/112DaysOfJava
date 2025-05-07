package OOPS.Inheritence;

public class Tiger extends Animal{
  void doHunt(){
      System.out.println("I'm going for it.");
  }

    public static void main(String[] args) {
        Tiger object = new Tiger();
        object.doHunt();
        object.doEat();
    }
}
