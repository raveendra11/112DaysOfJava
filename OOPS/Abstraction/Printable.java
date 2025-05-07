package OOPS.Abstraction;

public interface Printable {
    void canPrintable();
    default void doPrint(){
        System.out.println("Printing...");
    }
}
