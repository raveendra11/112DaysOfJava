package Strings;

public class StringClass {

    public static void main(String[] args) {
        //in SCP area
        String firstName = "Ishu"; 
        //Stored in Heap area
        String lastName = new String("Ishu"); 
        //in SCP area
        String name = "Ravi";
        //Stored in Heap area
        String lastname = new String("Pujari");  

        System.out.println(firstName);
        System.out.println(lastName);
    }
}
