package Threading.Multi_Threading;

import Threading.MyRunnable;

/// Multithreading = Enables a Program to run Multiple Threads Concurrently
///                  (Thread = A Set of instructions that Run Independently)
///                  Useful for Background Tasks or Time-Consuming Operations


public class Main {
   public static void main(String[] args) {


     // Creating 2 Threads and Passing the Anoynomous myrunnable object as Argument
     // Java executes expressions from inside parentheses first.
       Thread thread1 = new Thread(new myrunnable());
       Thread thread2 = new Thread(new myrunnable());

       thread1.start();
       thread2.start();


}
}

///  new Something() = Create object + immediately use it
/// It doesn't Require a Name as it is an Anoynomous Object
