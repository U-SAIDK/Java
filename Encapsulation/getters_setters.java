package Encapsulation;

///  Encapsulation - make sure that "sensitive" data is hidden from users


///  They help protect object Data and Add Rules of Accessing or Modifying Them
///  GETTERS = Methods that make a field READABLE.
///  SETTERS = Methods that make a field WRITEABLE.

public class getters_setters {
   public static void main(String[] args) {

   Car car = new Car("Porche", "Yellow", 1000);

  // car.model = "Corvette"; // We can view and Change the Attributes if not Private
     car.setColor("Blue"); // You Can Now Change the Attributes(Setters)
     car.setPrice(9000);

// System.out.println(car.color + " " + car.model + " " + car.price); // You can't access because its Private
// Print with the get methods we created in Car Class
     System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());


}
}
