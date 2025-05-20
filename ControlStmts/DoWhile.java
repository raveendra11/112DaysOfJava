package ControlStmts;

public class DoWhile {

    public void doPrint() {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void main(String[] args) {
        DoWhile object = new DoWhile();
        object.doPrint();
    }
}
