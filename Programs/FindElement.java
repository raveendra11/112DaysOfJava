package Programs;

public class FindElement {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 7};
        int findElement = 6;
        boolean flag = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == findElement) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
