package OOPS.Abstraction;

public class Print implements Printable {

    @Override
    public void canPrintable() {
        System.out.println("Can able to print.");
    }

    public static void main(String[] args) {
        Print object = new Print();
        object.canPrintable();
        object.doPrint();
    }
}
