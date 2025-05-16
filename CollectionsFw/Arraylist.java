package CollectionsFw;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist{

    public void doPrint(){
        ArrayList al = new ArrayList();
        al.add(1);
        al.add("Hi, Ishu!");
        al.add(true);
        al.add('I');
        al.add(1.9);

        Iterator itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        Arraylist all = new Arraylist();
        all.doPrint();
    }
}
