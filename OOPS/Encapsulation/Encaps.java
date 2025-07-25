package OOPS.Encapsulation;

public class Encaps {

    String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
       this.name=name;
    }

    public static void main(String[] args) {
            Encaps object = new Encaps();
            object.setName("Ishu");
            object.setName("Ravi");
        System.out.println(object.getName());
    }
}
