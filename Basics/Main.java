package Basics;

public class Main {
    public static void main(String[] args) {
        Student object = new Student();
        object.id=101;
        object.name="Ishu";

        Employee emp = new Employee();
        emp.insertEmployee(100,"Ishu");

        Coyotes coyotes = new Coyotes(5,"juli");
    }
}
