package ControlStmts;

public class For {

    public void doPrint() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        For object = new For();
        object.doPrint();
    }
}
