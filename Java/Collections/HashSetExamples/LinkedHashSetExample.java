package Collections.HashSetExamples;
import java.util.LinkedHashSet;

/// A LinkedHashSet is a collection that stores unique elements and remembers the order they were added.
/// LinkedHashSet = set that does not allow duplicates and keeps the original insertion order.

public class LinkedHashSetExample {
    public static void main(String[] args) {

    LinkedHashSet<String> cars = new LinkedHashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Duplicate
        cars.add("Mazda");

        System.out.println(cars);


}
}