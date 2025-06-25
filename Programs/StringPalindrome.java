package Programs;

public class StringPalindrome {
    public static void main(String[] args) {

        String name = "Ishu";
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);
        if (reverse.equals(name)) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }

}
