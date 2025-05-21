package OOPS.Encapsulation;

public class Encapsulation {

    private String name;
    private int age;
    private boolean hasJob;

    public String getName(){

        return name;
    }

    public void setName(String name){

        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean gethasJob(){
        return hasJob;
    }

    public void sethasJob(boolean hasJob){
        this.hasJob=hasJob;
    }

    public static void main(String[] args) {
            Encapsulation object = new Encapsulation();
            object.setName("Ishu");
            object.setAge(27);
            object.sethasJob(true);
        System.out.println("My name is "+object.getName()+" and I am "+object.getAge()+" years old"+", a "+object.gethasJob()+" Worker!");
    }
}
