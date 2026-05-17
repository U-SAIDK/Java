package Collections.IteratorExamples;
import java.util.ArrayList;
import java.util.Iterator;


/// An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.

public class IteratorExample {
   public static void main(String[] args) {

       // Make a collection
       ArrayList<String> cars = new ArrayList<String>();
       cars.add("Volvo");
       cars.add("BMW");
       cars.add("Ford");
       cars.add("Mazda");

       // Get the iterator
       Iterator<String> car = cars.iterator();

       // Looping through
       System.out.println(car); // Will give Hash code as car is a String

       // Looping Through a Collection to Print each item
       while (car.hasNext()){
           System.out.println(car.next());
       }

       // Print the first item
       System.out.println(car.next());

}
}
