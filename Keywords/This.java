package Keywords;

public class This {
    int age;
    String name;

    This(int age,String name) {

        this.age = age;
        this.name = name;
        System.out.println(this.age);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        This object = new This(27,"Ishu");
        This object1 = new This(27,"Ravi");
    }
}
