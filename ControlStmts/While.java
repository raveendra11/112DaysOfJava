package ControlStmts;

public class While {

    public void doPrint() {
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        While object = new While();
        object.doPrint();
    }
}
