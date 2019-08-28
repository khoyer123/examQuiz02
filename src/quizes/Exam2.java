package quizes;

import java.util.ArrayList;
import java.util.Random;

public class Exam2 {


    private static String secretSantaOf;

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Arif");
        list.add("Jahid");
        list.add("Jamil");
        list.add("Jakir");
        list.add("Liton");
        list.add("Mike");
        list.add("Jerry");

        System.out.println("Family members are :" + list);

        Random random = new Random();
        int index = random.nextInt(list.size());
        System.out.println(index);

        String secret = list.get(index);

         System.out.println(secretSantaOf + "secret santa for this year is :"  + secret);

        for (int i = 0; i < 7; i = i + 2) {
            System.out.println(i);

           // System.out.println(secretSantaOf + "secret santa for this year is :" + secret);
        }
    }

    }
