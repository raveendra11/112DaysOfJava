package CollectionsFw;

import java.util.Iterator;
import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        Stack object = new Stack();
        object.push("Ishu");
        System.out.println(object.peek());
        object.push(27);
        Iterator itr = object.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
