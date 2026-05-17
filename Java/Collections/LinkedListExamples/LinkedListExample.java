package Collections.LinkedListExamples;

import java.util.LinkedList;

/// LinkedList - List with fast insert and remove operations
/// A LinkedList is made of node that Contains contains :- The data , A pointer to the next node ;
/// Each element is stored separately in memory, connected by links.

public class LinkedListExample {
   public static void main(String[] args) {

   LinkedList<String> cars = new LinkedList<>();
     cars.add("Volvo");
     cars.add("BMW");
     cars.add("Ford");
     cars.add("Mazda");
   System.out.println(cars);

}
}

// LinkedList is faster for insert and delete operations because it does not require
// shifting elements in memory. Instead, it updates node references (pointers), which
// takes constant time O(1) once the position is known.