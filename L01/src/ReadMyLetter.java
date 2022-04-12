import java.io.BufferedReader;
import java.io.FileReader;

public class ReadMyLetter {
    public static void main(String[] args)
    {
        System.out.println("Reading File from Java code");

                //Name of the file
                // String
                String fileName = "hello.txt"; //file stored at the same level as src folder

                try{
                        //Create object of FileReader
                        FileReader inputFile = new FileReader(fileName);

                        //Instantiate the BufferedReader Class
                        BufferedReader bufferReader = new BufferedReader(inputFile);

                        //Variable to hold the one line data
                        String line;

                        // Read file line by line and print on the console
                        while ((line = bufferReader.readLine()) != null) {
                        System.out.println(line);
                    }

                //Close the buffer reader
                    bufferReader.close();
                }catch(Exception e){
                    System.out.println("Error while reading file line by line:" +
                            e.getMessage());
                }
    }
}