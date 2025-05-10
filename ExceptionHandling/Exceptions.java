package ExceptionHandling;

public class Exceptions {

    public static void main(String[] args) {
        int a = 0;
        int b = 5;

        try {
            System.out.println(b / a);
        } catch (ArithmeticException ae) {
            System.out.println("Please change the inputs " + ae);

        }

    }
}
