package Threading;
import java.util.Scanner;

/// Threading = Running multiple tasks at the same time (concurrently)
///             Help improve performance with Time-Consuming Operations
///            (File I/O, network communications, or any Background Tasks)

///   KEY IDEA:
///  Main Thread → handles user interaction
///  Background Thread → handles time-based or heavy work

///  Threads can be used to perform complicated tasks in the background
///  without interrupting the main program

/// How to Create a Thread [2 Options]
/// Option 1 :- Extend the Thread Class (Simplier) and override its run() method:
/// Option 2 :- Implement the Runnable interface (Better) ; Implement Syntax

public class threading {
   public static void main(String[] args) {
   ///  Program always starts from ONE thread called: MAIN THREAD
   /// Everything here runs sequentially unless we create new threads.

   Scanner scanner = new Scanner(System.in);

      System.out.println("You have 5 seconds to enter your name");

      // Create an Object of the Runnable interface we Created
      MyRunnable myRunnable = new MyRunnable();

      // Create New Thread -> & Pass Runnable object to Thread
      Thread thread = new Thread(myRunnable);

      // Setting a thread as Daemon means: If main() ends → daemon thread dies immediately.
      //  → it will automatically terminate when the main (user) thread ends.
      thread.setDaemon(true);

      // These starts the Background Thread
      thread.start();


      // Main thread waits for user input
      System.out.print("Enter you name: ");
      String name = scanner.nextLine();
      System.out.println("Hello " + name);

scanner.close();

}
}
//  Program ends when all threads finish
//  DAEMON THREAD CONCEPT 🧠
//  Two types of threads:
//  1) User Thread   → keeps JVM alive
//  2) Daemon Thread → background helper
//  Daemon threads automatically stop when ALL user threads finish.