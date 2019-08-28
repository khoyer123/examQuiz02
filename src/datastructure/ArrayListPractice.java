package datastructure;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("Mr x");
        arrayList.add(" Mr y");
        System.out.println(arrayList.get(0));

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Mr k");
        stringArrayList.add("Mr d");

        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));


        }
    }
}