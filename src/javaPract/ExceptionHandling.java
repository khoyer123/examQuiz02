package javaPract;

public class ExceptionHandling {
    public static void main(String[] args) {


        String[] name = {"Mr X", "Mr Y", "Mr Z", "Mr A"};


        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

        //try-- keyword { --try block start
        //-- body of the try block
       // }-- try block ends. catch -- keyword ( exception name which we are trying to catch  e -- is variable for the exception)
       // {-- catch block start
        // body of the catch block
        // } catch block ends


        try {
            System.out.println(name[4]);
        } catch ( ArrayIndexOutOfBoundsException e) {
            System.out.println("exception occurred");

        }

        try {
            System.out.println(name[3]);
        } catch ( ArrayIndexOutOfBoundsException e) {
            System.out.println("Mr A");

        }


        // finally -- keyword-- finally blocks always executed
        // mostly used for database (DB) connectivity closing
                                     // file reader closing

        finally {


        }

    }
}
