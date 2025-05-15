package Basics;

public class AnonymousObject {

    public void iamAnonymous(){
        System.out.println("Called by an anonymous object.");
    }

    public static void main(String[] args) {
        new AnonymousObject().iamAnonymous();

    }
}
