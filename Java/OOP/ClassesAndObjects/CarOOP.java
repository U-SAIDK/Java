package OOP.ClassesAndObjects;

///      Object = An Entity That Holds Data (Attributes)
///               And Can Perform Actions(Methods)
///               It is a Reference Data Type
///      Class = An Bluprint for Creating Objects


////  Ex 1

  public class CarOOP {
    public static void main(String[] args) {

     // STEP 1: Create an Object
     // Car → class (blueprint)
     // car → reference variable
     // new Car() → creates an actual object in memory (Heap)
        Car car = new Car();


        // Since 'car' is a reference datatype,
        // Java prints the class name + hashcode- Unique Identifier
        // These hashcode is Calculated using memory address
        System.out.println(car);

        // STEP 3: Access Object Attributes using Dot Operator (.)
        // . -> Dot Operator allows access to variables and methods that belong to the object.
        System.out.println(car.model);
        System.out.println(car.make);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        // STEP 4: Calling Object Methods (Behavior)/Perform Action
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

        car.drive();

 }
 }


//// Ex 2
//
//    public class CarOOP {
//    public static void main(String[] args) {
//
//      Car car1 = new Car();
//      Car car2 = new Car(); // Creating New Object
//
//      System.out.println(car1.make + " " + car1.model); // Same Output As we have not set the Constructor
//      System.out.println(car2.make + " " + car2.model); // Same Output
//
// }
// }
