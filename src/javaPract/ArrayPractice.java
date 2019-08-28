package javaPract;

public class ArrayPractice {


    public static void main(String[] args) {
        // Array --[]
        String [] name = {"Mr X" , "Mr Y", "Mr Z"} ;


        System.out.println(name [0]);
        System.out.println(name [1]);
        System.out.println(name [2]);


        System.out.println(name.length);

        for (int a = 0; a <3 ; a++ ) {        //for (int a = 0; a <name.length ; a++ ) {
            System.out.println(name[a]);
        }
        int [] numbers1 = {12, 11, 111, 223, 332};
        Object[] objectArray = { "Mr B" ,1};

        for ( int i =0; i< objectArray.length; i++ ) {
            System.out.println(objectArray[i]);
        }

        System.out.println("********************");
        // enhance for loop
        int [] id = {12, 11, 111, 223, 332};
        for ( int s : id ) {
            System.out.println(s) ;
        }

        System.out.println("**********new types of array******************");

        int[] numbers = new int[3] ;
        numbers [0] = 11;
        numbers [1] = 12;
        numbers [2] = 13;


        System.out.println(numbers.length);
        System.out.println(numbers[2]);
        int[] newArray = numbers.clone();
        System.out.println(newArray.length);
        System.out.println(newArray[2]);

    }
}
