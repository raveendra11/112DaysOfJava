package Keywords;

class Animal {
    String name = "Tiger";
    int age = 5;
    String Hunt = "no";
}

public class Super extends Animal {
    String Hunt = "yes";

    public void superUsage(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(super.Hunt);
    }
    public static void main(String[] args) {

        Super object = new Super();
        object.superUsage();

    }

}
