package DSA.Set;
import java.util.TreeSet;

/// A TreeSet is a collection that stores unique elements in sorted order
///  Duplicates will Appear Once;Elements will be sorted Automatically
///  It is part of the java.util package and implements the Set interface.

public class Treeset {
   public static void main(String[] args) {

   TreeSet<String> cars = new TreeSet<>();

      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("BMW");  // Duplicate
      cars.add("Mazda");

    // Methods same as hashset

      System.out.println(cars);



}
}
