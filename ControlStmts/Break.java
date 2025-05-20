package ControlStmts;

public class Break {

    public void doPrint() {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Break object = new Break();
        object.doPrint();
    }
}
