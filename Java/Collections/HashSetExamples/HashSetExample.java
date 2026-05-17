package Collections.HashSetExamples;
// Import the HashSet class
import java.util.HashSet;


/// A HashSet is a collection of elements where every element is unique.
/// No Duplicates; No Accessing Elemets with index Number
//
//    public class HashSetExample {
//    public static void main(String[] args) {
//
//
//        HashSet<String> cars = new HashSet<>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("BMW");  // Duplicate
//        cars.add("Mazda");
//
//     // Enhanced Loop Through the Elements of the Hashset
//      for(String car : cars){
//          System.out.println(car);
//      }
//
//
//      //  Methods
//        cars.contains("Mazda"); // Check if Element Exists or not
//        cars.remove("Volvo"); // Remove and Element from the Set
//        cars.size(); // Give the Size of the Hashset
//        cars.clear(); // remove all elements
//
//
//
//
//        System.out.println(cars);
//}
//}


/// Var Keyword :- var keyword to declare a HashSet variable without writing the type twice
//public class HashSetExample {
//   public static void main(String[] args) {
//
//// Using var instead of :- HashSet<String> cars = new HashSet<String>();
//
// var cars = new HashSet<String>();
//
//       cars.add("Volvo");
//       cars.add("BMW");
//       cars.add("Ford");
//       cars.add("Mazda");
//       System.out.println(cars);
//
//}
//}


/// Ex 3:- Set interface
// You can set an interface a collection that can store another diff object

import java.util.Set;
import java.util.HashSet;

public class HashSetExample {
   public static void main(String[] args) {

// variable (cars) is declared as a Set (the interface),
// but it stores a HashSet object (the actual set).
// As HashSet implements the Set interface,this is possible
   Set<String> cars = new HashSet<>();

       cars.add("Volvo");
       cars.add("BMW");
       cars.add("Ford");
       cars.add("Mazda");
       System.out.println(cars);

}
}