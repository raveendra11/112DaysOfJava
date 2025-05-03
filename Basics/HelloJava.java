package Basics;

public class HelloJava {
    String message = "Hello, Java!";

    public void doPrint() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        HelloJava object = new HelloJava();
        object.doPrint();
    }
}
