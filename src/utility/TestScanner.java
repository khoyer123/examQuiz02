package utility;

import java.util.Scanner;

public class TestScanner {

    public static int calculator () {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();    // insert first value. e.g; 10
        int b = scanner.nextInt();    // insert second value. e.g; 20

        int x = a+b;
        return x;
    }
    public static void studentInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert the name of the student");
        String name = scanner.nextLine();
        System.out.println("insert age ");
        int age = scanner.nextInt();
        System.out.println("insert mobile number");
        long number = scanner.nextLong();
        System.out.println("gender");
        char gender = scanner.next().charAt(0);

        System.out.println("name is: "  + name);
        System.out.println("age is :"    +age);
        System.out.println("mobileNumber is:"    + number);
        System.out.println("gender is :"     + gender);
    }

    public static void main(String[] args) {

       // int result = calculator();
       // System.out.println(result);      //result = first + second value = 30

         studentInfo();
    }







}
