package OOP.Polymorphism;

/// Polymorphism = "POLY" -> Many ; "MORPH" -> forms
/// Occurs when we have many classes that are related to each other by inheritance.

///    Objects can identify as other Object
///    Objects can be Treated as Objects of Common Superclass

///  Can be done with Abstraction & interefaces

public class Polymorphism {
   public static void main(String[] args) {

   Car car = new Car();
   Bike bike = new Bike();
   Boat boat = new Boat();

  Vehicle[] vehicles = {car, bike , boat};

  for(Vehicle vehicle : vehicles){
      vehicle.go();

  }

}
}