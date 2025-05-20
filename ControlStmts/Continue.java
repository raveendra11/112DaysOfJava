package ControlStmts;

public class Continue {

    public void doPrint(){
        for(int i=0;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Continue object = new Continue();
        object.doPrint();
    }
}
