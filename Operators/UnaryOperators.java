package Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int x = +10;
        System.out.println(x);         //10
        System.out.println(-x);   //-10

        int y = 10;
        System.out.println(y++);   //10 (11)
        System.out.println(++y);   //12

        System.out.println(x--);    //10
        System.out.println(--x);   //8

        int a = 10;
        int b = -10;
        boolean c = true;
        boolean d = false;
        System.out.println(~a);//-11 (minus of total positive value which starts from 0)
        System.out.println(~b);//9 (positive of total minus, positive starts from 0)
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true
    }
}
