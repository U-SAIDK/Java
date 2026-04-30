package File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

//   How to Write a File Using Java (4 options)
///  FileWriter = Good For Small Or Medium-Sized Text Files
///  BufferedWriter = Better Performance for Large Amounts of Text
///  PrintWriter = Best for Structured Data , like reports or Logs
///  FileOutputStream = Best for Binary Files (Eg:- Images, Audio Files)


//   public class WriteFile {
//   public static void main(String[] args) {
//// FileWriter writer = new FileWriter(""); Create Object of Class FileWriter
//// & Pass the filepath->filename as Argument
//
// try(FileWriter writer = new FileWriter("/home/usaid/TestFile.io/test.txt"))
//    {
//      writer.write("I LIKE PIZZA"); // Using the writer object & write method -> Pass the Argument String
//        System.out.println("File Has Been Written");
//    }
//  catch (FileNotFoundException e) {
//      System.out.println("Could not Locate File Location");
//  }
//
//  catch(IOException e)
//  {
//      System.out.println("Could not Write File");
//  }
//
//  }
//  }

/// Ex 2 :- Better Writing


public class WriteFile {
   public static void main(String[] args) {

   String FilePath = "/home/usaid/TestFile.io/test4.txt"; // Write Filepath as Value to the String
// String TextContent = "Hii These is Written via Code!\n Hello World!"; // TextContent as String
   String TextContent = """ 
           Roses are Red
           Voilets are Blue
           HEHE WHO HWO
                        """ ;  // Instead of using \n We Can Use the """ Text """ For Multiline


   try(FileWriter writer = new FileWriter(FilePath)){ // Pass the FilePath(String) as Argument
      writer.write(TextContent);                      // Pass the TextContent as Argument
       System.out.println("File is Written Successfully");

   }

   // 2 Possible Exception Errors
   catch (FileNotFoundException e){
       System.out.println("FIle Location is InValid");
   }
   catch (IOException e){
       System.out.println("Cannot Write File");
   }
}
}