package gr.aueb.cf.ch19.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        var intNodeNotNull = new Node<Integer>();

        Node<Integer> intNode = new Node<>();
        Node<String> strNode = new Node<>();

        intNode.setItem(1);
        strNode.setItem("CF");

        List<String> names = new ArrayList<>();
        //appendNewObject(names);  compilation error

    }

    //avoid raw types, because you lose type safety
//    static void appendNewObject(List list) {
//        list.add(new Object());
//    }


    static void appendNewObject(List<Object> list) {
        list.add(new Object());
    }
}
