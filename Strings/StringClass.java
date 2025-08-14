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
        //in SCP area
        String name = "Teja";
        //Stored in Heap area
        String lastname = new String("Sada");  

        System.out.println(firstName);
        System.out.println(lastName);
    }
}
