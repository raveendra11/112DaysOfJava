package Programs;

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = new int[]{5, 2, 1, 9, 6, 2, 5, 8, 10};

        int largest = numbers[0];
        int secondlargest = numbers[1];
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }

        for (int j = 0; j < numbers.length; j++) {
            if (secondlargest < numbers[j] && largest > numbers[j]) {
                secondlargest = numbers[j];

            }
        }
        System.out.println(secondlargest);
    }
}
