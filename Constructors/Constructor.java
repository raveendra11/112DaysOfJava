package Constructors;

public class Constructor {
    private boolean doConstruct;
    private boolean doDeconstruct;

    public Constructor(boolean construct) {
        doConstruct = construct;
        System.out.println(doConstruct);
    }

    public Constructor(boolean construct,boolean deconstruct){
        doConstruct = construct;
        doDeconstruct = deconstruct;
        System.out.println(doConstruct);
        System.out.println(doDeconstruct);
    }


    public static void main(String[] args) {
        Constructor object = new Constructor(true);
        Constructor obj = new Constructor(true,false);

    }
}
