package Basics;

public class Variables {

    //Instance variables
    //Declaration + Initialization (combined)
    int number = 10;
    boolean lightOn = true;

    //Static variable
    static String College = "USD";

    public void doPrint() {
        //Local variable
        boolean isPrintable = true;
        if (isPrintable)
            System.out.println("Printing....");
    }

    public static void main(String[] args) {
        //Declaration
        char letter;

        //Initialization
        letter = 'a';
    }
}
