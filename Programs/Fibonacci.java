package Programs;

public class Fibonacci {

    public static void main(String[] args) {
        int number1 = 0, number2 = 1, series = 0;

        for (int i = 0; i <= 6; i++) {
            System.out.println(number1);
            series = number1 + number2;
            number1 = number2;
            number2 = series;

        }
    }
}
