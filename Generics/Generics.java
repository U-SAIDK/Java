package Generics;
import java.util.ArrayList;

///  Generic = A Concept where you can write a Class , interface , or Method
///            that is Compatible with Different Data Types
///   <T> type Parameter (PlaceHolder that Gets Replaced With a Real type)
///  <String, Interger etc> type Argument (specifies)


   public class Generics {
   public static void main(String[] args) {

   // Creating Box that stores String type
   Box<Integer> box = new Box<Integer>(); // Just add the Wrapper Class in <>


   box.setItem(5); // Add Values of Matching Data Type

   System.out.println(box.getItem());

}
}

/// Ex 2 :- Two Generics <Placeholder> & 2 Parameter

// public class Generics {
//  public static void main(String[] args) {
//
//  Product<String, Double> product1 = new Product<>("Apple", 30.0);
//  Product<String, Integer> product2 = new Product<>("Ticket", 15);
//
//
//     System.out.println(product1.getitem());
//     System.out.println(product1.getprice());
//
//     System.out.println(product2.getitem());
//     System.out.println(product2.getprice());
//
//}
//}