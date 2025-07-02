package Programs;

public class LargestNumber {

    public static void main(String[] args) {
        int[] numbers = new int[]{5, 1, 6, 2, 9, 3, 1};
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        System.out.println("largest number is : " +largest);
    }
}
