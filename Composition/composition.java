package Composition;
///  Building a whole object using smaller parts that belong only to it.

///  Composition = Represent a "part-of" relationship Between Objects.
///                For exp:- An Engine is "Part of" a Car.
///                Allows complex objects to be Constructed From Smaller Objects.

public class composition {
  public static void main(String[] args) {


    Car car = new Car("Corvette", 2025, "V8");

      System.out.println(car.model);
      System.out.println(car.year);

      // Access Engine object inside Car, then print engine type
      System.out.println(car.engine.type);

}
}

/// Composition = one object is made up of other objects.
