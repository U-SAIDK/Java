package DSA.COLLECTIONS.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/// ArrayList = A Resizable Array that Stores Objects (Autoboxing).
///             Arrays are Fixed in size,but ArrayLists can change [Dynamic]
/// Syntax = ArrayList<Wrapper Class(Datatype)> name = new ArrayList<>()

//   public class arraylist {
//   public static void main(String[] args) {
//
//
//   ArrayList<Integer> list = new ArrayList<>(); // Store Array of int
//   ArrayList<Double> list2 = new ArrayList<>(); // Store Array of double
//   ArrayList<String> list3 = new ArrayList<>(); // Store Array of String
//
//   // Use the add method to add elements into ArrayList
//   list.add(1); // Add these Primitive Values to an Array
//   list.add(2); // list = [1, 2, 3]
//   list.add(3);
//
//   list2.add(4.1);
//   list2.add(5.2);
//   list2.add(6.3);
//
//   list3.add("Apple");
//   list3.add("Banana");
//   list3.add("Orange");
//   list3.add("Watermelon");
//
//  // Use the remove method to Remove an element from ArrayList
//   list3.remove(2);
//
//  // Use set to Replace an element at Certain Index
//   list3.set(0, "Pineapple"); // Replace the Element at index 0 with Pineapple
//
//   System.out.println(list); // Makes an Array of [1, 2, 3]
//   System.out.println(list2); // Makes an Array of [4.1, 5.2, 6.3]
//   System.out.println(list3);
//
//   System.out.println(list3.get(0)); // get the Element to index 0
//   System.out.println(list3.size()); // get the Total Size of Array List
//
//   // Use the Collections Framework to Sort out an ArrayList
//   Collections.sort(list3); // Alphabetically Sort
//   System.out.println(list3);
//
///// You can use an Enhanced For Loop to Print each element of an Array List
//
//}
//}


/// Ex 2 accept user input for elements in Array List

   public class arraylist {
   public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);

   // Create an ArrayList that stores Strings;ArrayList size can grow dynamically
   ArrayList<String> foods = new ArrayList<>();

   // Ask user for number of foods
       System.out.println("Enter the # of food you  would like");
       int numOfFood = scanner.nextInt(); // Read integer input & Store it in numOfFood
       scanner.nextLine(); // Clear input buffer

   // Loop runs to take food input multiple times
   // Each iteration: ask for food name, read input, store in ArrayList
       for(int i = 0; i <= numOfFood; i++){
           System.out.println("Enter Food #" + i + ": ");
           String food = scanner.nextLine();  // Read full line text and Store it in food
           foods.add(food);  // Add food into ArrayList (foods)
       }

       System.out.println(foods);

  scanner.close();
  }
  }
