package ControlStmts;

public class ForEach {

    public void doPrint() {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        for (int x : numbers) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        ForEach object = new ForEach();
        object.doPrint();
    }
}
