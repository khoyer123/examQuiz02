package javaPract;


public class TestCondition {
    // psvm = shortcut
    public static void main(String[] args) {
        int x = 10;
        //if ( condition) {-- if block starts
        // action
        // }-- if block ends

        if (x > 10) {


            //sout = shortcut
            System.out.println("x is greater then 10");
        } else if (x < 10) {


            System.out.println("x is less than 10");
        } else if (x == 10) {
            System.out.println("x=10");

        } else {
            System.out.println("something else");
        }
        System.out.println("******************************");

        // | -- or
        // && -- and
        // ! --not
        // != not equal
        int s= 9;
        int t = 10;
        if (s >10 && t < 12) {
            System.out.println("we won");
        } else if (s==12 | t== 12) {
            System.out.println("we lost");
        } else if (s != 12) {
            System.out.println("nothing");
        }







    }
}

