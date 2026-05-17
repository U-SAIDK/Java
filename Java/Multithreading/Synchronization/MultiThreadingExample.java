package Multithreading.Synchronization;

/// Multithreading = Enables a Program to run Multiple Threads Concurrently
///                  (Thread = A Set of instructions that Run Independently)
///                  Useful for Background Tasks or Time-Consuming Operations


public class MultiThreadingExample {
   public static void main(String[] args) {


     // Creating 2 Threads and Passing the Anoynomous MyRunnableSync object as Argument
     // Java executes expressions from inside parentheses first.
       Thread thread1 = new Thread(new MyRunnableSync());
       Thread thread2 = new Thread(new MyRunnableSync());

       thread1.start();
       thread2.start();


}
}

///  new Something() = Create object + immediately use it
/// It doesn't Require a Name as it is an Anoynomous Object
