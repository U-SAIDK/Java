package arrays;
import java.util.Scanner;
import java.util.Arrays;    // Import these Package,Method to use Methods in Array


//// Array = A Collection of Values of the Same Data Type
//// Syntax = Datatype[] name; Actual Syntax:- Datatype[] name = new String[size in bytes]
//// Arrays are Reference Data Types


///  Ex -1 - Basics
  public class Array {
    static void main(String[] args) {

  String[] fruits = {"apple", "banana", "cherry", "lemon"};
        System.out.println(fruits); // These will Show the Address of Memory Address of String[] fruit as String is Reference Data Type
        System.out.println(fruits[0]); // Accessing members via index number

      fruits[0] = "Pineapple"; // Change the Value of Element at index 0 -> Pineapple
        System.out.println(fruits[0]);
}
}

/// Ex -2 Size of
//  public class Array {
//    static void main(String[] args) {
//
//  String[] fruits = {"apple", "banana", "cherry", "lemon"};
//
//       int numOfFruits = fruits.length;  // The Size of Array is Calculated and Stored in numOfFruits
//       for(int i =0; i< numOfFruits; i++){
//           System.out.println(fruits[i]); // Print ALl Elements Using Loop
//       }
//}
//}

//// Ex 3 :- Enhanced For Loop(For Each Loop)
/// It will Cycle Once for each element within an Array
/// Simplifies Iterating Through a Collection[arrays]
/// Syntax:- FOR each item inside the array
///          Take one item
///          Put it in a temporary variable
///          Do something with it
///          REPEAT until no items left
///   for (type variable : arrayname) {
///        // code block to be executed
///        }

//    public class Array {
//    public static void main(String[] args) {
//
//    String[] fruits = {"apple", "banana", "cherry", "lemon"};
//
//    // iterate through all elements in Fruit &
//    // Store it temporarily in variable called "fruit"
//    // It runs multiple times — once for each item in the array.
//    for (String fruit : fruits){ // For every fruit in my Fruits do code in {}
//
//        System.out.print(fruit + " "); // Print all Element of Array one by one
//
//    }
//  }
//  }


/// Ex 3:- Array Methods


//    public class Array {
//    static void main(String[] args) {
//
//        String[] fruits = {"apple", "orange", "banana", "coconut"};
//
//        Arrays.sort(fruits); // Sorting Elements Aphabetically
//      //Arrays.fill(fruits, "pineapple"); // Fill Array with an Element(Value)
//
//        for(String fruit : fruits){
//        System.out.println(fruit);
//    }
//}
//}


/// Ex 4 new Keyword - This makes an empty array with space for a fixed number,
///                    of elements which you can fill later:

//    public class Array {
//    static void main(String[] args) {
//
//    String[] foods = new String[3]; // Using new Keyword we allocate memory to String
//                                  // SIZE IS 3 [We Can Add 3 Elements]
//
//  foods[0] = "Pizza";
//  foods[1] = "Beef";
//  foods[2] = "Cheese";
//
//  for(String food : foods){
//     System.out.println(food);
//  }
//
//  }
//  }
