package javaPract;

public class TestClassForSingleton {
     String x ;

     //TestclassforSingleton getTestClassForSingleton = newTestClassForSingleton()
private static TestClassForSingleton getTestClassForSingleton=null;
    private TestClassForSingleton() {

        x = "this is singleton class";
    }

         public static TestClassForSingleton getInstance() {
             if(getTestClassForSingleton == null) {
                 getTestClassForSingleton = new TestClassForSingleton();
             }

                 return getTestClassForSingleton;

        }
    }


