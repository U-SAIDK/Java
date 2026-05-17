package AdvancedConcepts.TimerClass;
import java.util.Timer;
import java.util.TimerTask;


///  Timer = Class that schedules tasks at specific times or periodically
///     Useful for :  Sending Notifications, scheduled updates, repetitive actions


///  TimerTask = Represents the task that will be excuted by the Timer
///              You will extendt the TimerTask Class to define You Task
///              Create a subclass of TimerTask & @Overide run()


public class TimerClassExample {
   public static void main(String[] args) {

   // Create Timer object (scheduler)
   Timer timer = new Timer();

   // Anonymous class extending TimerTask
   TimerTask task = new TimerTask(){

   int count = 4;

   // This method runs when timer executes
   @Override
   public void run() {
       System.out.println("Hello");
       count--;
      if(count <= 0){
         System.out.println("Task Complete");
         timer.cancel();
      }

   }
   };

   // Schedule task after 3000 milliseconds (3 seconds)
   timer.schedule(task, 0, 1000); // (task , Delay , period)
   // task -> run this task; 0 -> start immediately; 1000 -> repeat every 1000 ms (1 second)

}
}
