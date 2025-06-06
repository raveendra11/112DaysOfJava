package Operators;

public class LogicalOperators {

    int age = 28;
    String name = "Ishu";

    void checkAgeName(){
        if(age == 28 && name.equals("Ishu")){
            System.out.println("Belated Happy Birthday!");
        }
    }

    public static void main(String[] args) {
        LogicalOperators object = new LogicalOperators();
        object.checkAgeName();
    }
}
