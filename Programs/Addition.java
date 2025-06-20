package Programs;

public class Addition {

    private int number1;
    private int number2;


    Addition(int a, int b) {

        number1 = a;
        number2 = b;
    }

    public void doAddition() {

        int total = number1 + number2;
        System.out.println(total);
    }

    public static void main(String[] args) {

        Addition object = new Addition(10, 20);
        object.doAddition();
    }
}
