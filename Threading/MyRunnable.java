package Threading;

/// The Runnable is a functional interface in Java that belongs to the java.lang package.
///  Runnable = TASK definition ; It DOES NOT create a thread, It only describes: "What work should be done?"
///  Thread object later executes this task.

/// Uses interface {Runnable} as it is Mandaory in interfaces to override its method [run]

public class MyRunnable implements Runnable{

 // Run here is the Method of Runnable (interface)
 // We Override it as per our Need
 // Anything inside run() executes on a SEPARATE THREAD.

 @Override
 public void run() {
     for (int i = 1; i <= 5; i++) {

         // As these is Risky/Dangerous Code we do it in try
         try{
             Thread.sleep(1000); // Background Thread Sleeps for 1000 ms(1s) for each iterations
         }                             // 1000 x 5 = 5 sec ; Main thread still runs normally

         catch (InterruptedException e){
             System.out.println("Thread interrupted");
         }
         if(i == 5){
             System.out.println("Times up!");
             System.exit(0); // These will End the Programme when timer hits 5
                                   // Stop the entire JVM immediately.
         }

     }

}

}
