package utility;

public class execution {
    public static void main(String[] args) {

        String value = null;
        String value2 = null;


        DataReader dataReader = new DataReader();
       // value = dataReader.readMyTextFile("/Users/muhammedkhoyer/IdeaProjects/CoreIava/src/test.txt");
       // value2 = dataReader.readMyTextFile("/Users/muhammedkhoyer/IdeaProjects/CoreIava/src/utility/information.txt");

        System.out.println("valye is: "+value);
        System.out.println("value2 is "+value2);

        System.out.println("***************propertiesReader********************* ");

        dataReader.getProperties("src/utility/peopleNtech.properties");
        dataReader.getProperties("src/utility/new.properties");
        dataReader.getProperties("src/utility/new2.properties");


    }
}







