package ExceptionHandling;

import java.util.Scanner;

public class Vote {

    public void verifyEligibility(int age) throws CustomException {

        if (age >= 18)
            System.out.println("Eligible");
        else
            throw new CustomException();

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Vote object = new Vote();

        try {

            object.verifyEligibility(input.nextInt());

        } catch (CustomException iae) {

            System.out.println("Invalid age passed ");
        }
    }

}
