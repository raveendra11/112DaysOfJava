package Basics;

public class Main {
    public static void main(String[] args) {
        Student object = new Student();
        object.id=101;
        object.name="Ishu";

        Employee emp = new Employee();
        emp.insertEmployee(100,"Ishu",800000);
        emp.insertEmployee(101,"Ravi",500000);

        Coyotes coyotes = new Coyotes(5,"juli");
    }
}
