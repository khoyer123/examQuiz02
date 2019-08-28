package datastructure;

import java.util.LinkedList;

public class LinkedListPractice {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("Mr a");
        linkedList.add("Mr x");
        linkedList.add("Mr z");

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println("**********after*************************");
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.getFirst());

        System.out.println(linkedList.peek());
        System.out.println(linkedList.element()); //noSuchElement exception thrown element()

        System.out.println(linkedList.remove());
        System.out.println( "********* after 2nd *************");

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println("********");
        System.out.println(linkedList.get(0));
        linkedList.set(0 , "Mr Random");
        System.out.println(linkedList.getFirst());

    }

    }

