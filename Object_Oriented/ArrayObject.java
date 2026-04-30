package Object_Oriented;

  public class ArrayObject {
    public static void main(String[] args) {

    Car2 car1 = new Car2("BMW", "Black");
    Car2 car2 = new Car2("Ford", "Red");
    Car2 car3 = new Car2("Porche", "Blue");

    Car2[] cars = {car1, car2, car3}; // Array of Objects

    for(Car2 car : cars){  // For Every Car2 object(v name-> car) in Array of cars do these
        car.drive();

    }

}
}

/// Ex 2 :- Pass Anynomous Objects [Array of Objects]
///     Instead of Given Unique Identifier we Array -> Constructor -> Pass Argument

//public class ArrayObject {
//    public static void main(String[] args) {
//
//        // For Each Element we are Going to Call the
//        // Car Constructor & Pass the Necessary Arguments
//
//        Car2[] cars = {new Car2("BMW", "Black"),
//                       new Car2("Ford", "Red"),
//                       new Car2("Porche", "Blue")};
//
//        for(Car2 car : cars){   // For Every Car2 object(v name-> car) in Array of cars do these
//            car.color = "Black"; // These Changes all Color To Black
//        }
//        for(Car2 car : cars){
//            car.drive();
//        }
//
//    }
//}