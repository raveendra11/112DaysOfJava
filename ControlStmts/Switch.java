package ControlStmts;

public class Switch {

    String name = "Ishu";

    public static void main(String[] args) {
        Switch object = new Switch();
        switch (object.name) {
            case "Ish":
                System.out.println("Name is Ish");
                break;
            case "Ishu":
                System.out.println("Name is Ishu");
                break;
            default:
                System.out.println("No name for this person");
                break;
        }
    }
}
