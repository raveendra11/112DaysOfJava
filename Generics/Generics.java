package Generics;

import java.util.ArrayList;
import java.util.Iterator;

class Generics{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("rahul");
        list.add("jai");

        String s=list.get(1);
        System.out.println("element is: "+s);

        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}