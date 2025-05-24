package CollectionsFw;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

    public void doPrint() {
        LinkedList object = new LinkedList();
        object.add(1);
        object.add("Ish");
        object.add(true);

        Iterator itr = object.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {

        Linkedlist object = new Linkedlist();
        object.doPrint();

    }
}
