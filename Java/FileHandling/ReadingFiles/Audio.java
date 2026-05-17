package FileHandling.ReadingFiles;
import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

///  Play Audio With Java (.wav, .au, .aiff)

public class Audio {
   public static void main(String[] args) {

   String filePath = "/home/usaid/TestFile.io/audio.wav";
   File file = new File(filePath);

   try(Scanner scanner = new Scanner(System.in); AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){


       Clip clip = AudioSystem.getClip(); // Sound Player(play,pause)
       clip.open(audioStream);
       System.out.println("No Problem Detected");

       String response = "";

       while(!response.equals("Q")){
           System.out.println("P = Play");
           System.out.println("S = Stop");
           System.out.println("R = Reset");
           System.out.println("Q = Quit");

           System.out.print("Enter you choice: ");
           response = scanner.next().toUpperCase();

           // ⭐ MUSIC PLAYER CONTROLS
           switch(response){

               case "P" :
               clip.start();
               break;

               case "S" :
               clip.stop();
               break;

               case "R" :
               clip.setMicrosecondPosition(0);
               break;

               case "Q" :
               clip.close();
               break;

               default:
                   System.out.println("Invalid choice");
           }
      }
}
   catch(FileNotFoundException e) {
       System.out.println("Could not Locate File");
   }

   catch(LineUnavailableException e){
       System.out.println("Unable to Access Audio Resource");
   }
   catch(UnsupportedAudioFileException e){
       System.out.println("Audio File Not Found");
   }

   catch(IOException e){
       System.out.println("Something went wrong");
   }
   finally {
       System.out.println("Bye!");
   }

}
}