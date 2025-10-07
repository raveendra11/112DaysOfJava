package Strings;

public class StringBuff {

    private StringBuffer name;
    private char[] words;

    public void createString(){
        String peru = "Aish"; //created using String litteral
        System.out.println("Your name : "+peru);
        char[] words = {'I','s','h','u'};
        String s = new String(words); // created by passing char array.
        s.concat("Ravi");
        System.out.println("Your name : "+s);
        StringBuffer name = new StringBuffer("Aishu"); //using String buffer
        name.append("Ravi");
        System.out.println("My name is : "+ name);
    }

    public static void main(String[] args) {

        StringBuff stringbuff = new StringBuff();
        stringbuff.createString();

    }
}
