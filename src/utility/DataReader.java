package utility;


import java.io.*;
import java.util.Properties;

public class DataReader {

    // public static void main(String[] args) {


    //  DataReader dataReader = new DataReader()
    // dataReader.readDoc();


   /* public String readMyTextFile(String filePath) {
        String text;
        String finalText = null;

        //this is path too: /Users/muhammedkhoyer/IdeaProjects/CoreIava/src/utility/information.txt
        // i copy below this path from terminal
        try {
            FileReader readMyTextFile = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(readMyTextFile);


            while ((text = bufferedReader.readLine()) != null) {
                finalText = text;
            }
            readMyTextFile.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return finalText;
    }


    public static void main(String[] args) {
        // to write a file

         //FileWriter fileWriter = new FileWriter("/src/test.txt");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/test.txt",true));
            bufferedWriter.write("test writing using bufferedWriter");
            bufferedWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }*/


    public static void main(String[] args) {

        Properties properties = new Properties();
        try {
            InputStream inputStream = new FileInputStream("src/utility/peopleNtech.properties");
            properties.load(inputStream);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(properties.getProperty("year"));
        System.out.println(properties.getProperty("date"));
        System.out.println(properties.getProperty("subject"));

    }




       public Properties getProperties(String filePath) {

           Properties properties = new Properties();
           try {
               InputStream inputStream = new FileInputStream(filePath);
               properties.load(inputStream);


           } catch (FileNotFoundException e) {
               e.printStackTrace();
           } catch (IOException e) {
               e.printStackTrace();
           }
           System.out.println(properties.getProperty("year"));
           System.out.println(properties.getProperty("date"));
           System.out.println(properties.getProperty("subject"));

           System.out.println(properties.getProperty("id"));
           System.out.println(properties.getProperty("name"));

           return properties;
       }






}
