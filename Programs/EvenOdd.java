package Programs;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check :");
        int number1 = input.nextInt();

        if (number1 % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
