package Arrays;

public class Single {

    int[] numbers = {1, 2, 3, 4, 5};

    public void printSingle() {

        for (int x : numbers) {
            System.out.println(x);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {

        Single object = new Single();
        object.printSingle();
    }
}
