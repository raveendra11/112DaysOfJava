class SumExample {  
    public static int sum(int n) {  
        if (n == 0)  
            return 0;  
        else  
            return n + sum(n - 1);
    }  
}
public class Recursion{
 public static void main(String[] args) {  
    int num = 5;
    int result = SumExample.sum(num);
    System.out.println("Sum of first " + num + " natural numbers is: " + result);  
 }  
}  
