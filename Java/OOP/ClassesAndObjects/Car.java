package OOP.ClassesAndObjects;

///      Object = An Entity That Holds Data (Attributes)
///               And Can Perform Actions(Methods)
///               It is a Reference Data Type
///      Class = An Bluprint for Creating Objects

////   This class is NOT a program so it won't Run
////   It is a: ✅ Blueprint (template) used to create objects
////   It is only responsible for defining data and behavior.


public class Car {

        // These are Known as Attributes
        public String make = "Ford";
        public String model = "BMW";
        public int year = 1980;
        public double price = 50000.99;
        public boolean isRunning = true;


       // These are Methods Created and Can be Called
       void start(){  // Method 1
           isRunning = true;
           System.out.println("You Start the Engine");
       }
       void stop(){ // Method 2
           isRunning = false;
           System.out.println("You Stop the Engine");
       }
       void drive(){
           System.out.println("You Drive the car " + model);
       }
       void bbreak(){
        System.out.println("You Break the car");
    }

}

/// Ex 2 :- Array Of Objects
