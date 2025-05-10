package ExceptionHandling;

import java.util.Scanner;

public class Vote {

    public void verifyEligibility(int age) throws InvalidAgeException {

        if (age >= 18 && age > 0)
            System.out.println("Eligible");
        else
            throw new InvalidAgeException();

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Vote object = new Vote();

        try {

            object.verifyEligibility(input.nextInt());

        } catch (InvalidAgeException iae) {

            System.out.println("Invalid age passed ");
        }
    }

}
