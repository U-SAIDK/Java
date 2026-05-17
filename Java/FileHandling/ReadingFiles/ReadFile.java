package FileHandling.ReadingFiles;

/// READ File (3 Options):-
/// BufferedReader + FileReader :  Best of Reading Text Files line by line
/// FileInputStream : Best For Binary Files (Eg:- images, audio Files)
/// RandomAccessFile : Best For Read/Write specific Portions of a Large File

import java.io.BufferedReader;  // Used to read characters from a file
import java.io.FileNotFoundException; // Handles case when file is missing
import java.io.FileReader; // Connects program to the file
import java.io.IOException; // Handles input/output errors


/// Ex :- BUfferedReader + FileReader
public class ReadFile {
    public static void main(String[] args) {

   // Absolute path of the file to read ; Stored in filePath String
    String filePath = "/home/usaid/TestFile.io/test4.txt";

    // As we are using BufferedReader + FileReader()
   // we Will Pass the Filereader as Argument in Constructor of Buffer Reader
  //  BufferedReader reader = new BufferedReader(new FileReader(filePath));

    try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
        System.out.println("That File Exists:-");
        // Reading File ->

        String line; // Variable to store one line at a time
        while ((line = reader.readLine()) != null) { //   readLine() reads ONE FULL LINE each time; Returns null when end of file is reached.
            System.out.println(line);
        }

    }

    catch(FileNotFoundException e){
        System.out.println("Could not Locate File");
    }
    catch(IOException e){
        System.out.println("Something went wrong");
    }


}
}

/// FileReader  → Opens the file
/// BufferedReader → Reads efficiently
/// readLine() → Reads line by line
