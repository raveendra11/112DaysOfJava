package Java8;

public class FunctionalInt implements sayable{
    public void say(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        FunctionalInt fie = new FunctionalInt();
        fie.say("Hello there");
    }
}