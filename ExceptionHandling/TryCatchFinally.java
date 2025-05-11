package ExceptionHandling;

public class TryCatchFinally {

    public void tryCatch() {
        int a = 10;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }
        finally{
            System.out.println("Finally block");
        }
    }

    public static void main(String[] args) {
        TryCatchFinally object = new TryCatchFinally();
        object.tryCatch();
    }
}
