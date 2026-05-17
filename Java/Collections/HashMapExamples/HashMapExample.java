package Collections.HashMapExamples;
import java.util.HashMap; // Import the HashMap class

/// A HashMap stores items in key/value pairs, where each key maps to a specific value.
/// Instead of accessing elements by an index (like with ArrayList), you use a key to retrieve its associated value.
/// It is part of the java.util package and implements the Map interface
////  A HashMap can store many different combinations, such as:
///   String keys and Integer values OR String keys and String values etc....


//public class HashMapExample {
//   public static void main(String[] args) {
//
//   HashMap<String, String> capitals = new HashMap<>();
//
//
//   capitals.put("India", "Delhi"); // /// India is key and Delhi is Value
//   capitals.put("Pakistan", "Karachi");
//   capitals.put("Russia", "Moscow");
//   capitals.put("Afghanistan", "Kandahar");
//   capitals.put("USA", "Washington DC");
//   capitals.put("USA", "Khorasan"); // These Value will Overide
//                                   // A Key is unique(Immutable) But values can be Overridden
//
//   // Other methods
//   capitals.get("India"); // To access a value ;get() method and refer to its key
//   capitals.remove("Russia"); // use the remove() method and refer to the key: To remove an item
//   capitals.size(); // To find out how many items are There
//
//   System.out.println(capitals);
//   System.out.println(capitals.get("India"));
//   System.out.println(capitals.size());
//
//}
//}

/// Ex -2 Loop thorugh HashMapExample
//public class HashMapExample {
//   public static void main(String[] args) {
//
//   HashMap<String, String> capitalCities = new HashMap<>();
//
//       capitalCities.put("England", "London");
//       capitalCities.put("India", "New Dehli");
//       capitalCities.put("Afghanistan", "Kandahar");
//       capitalCities.put("Russia", "Moscow");
//       capitalCities.put("USA", "Washington DC");
//
//
// // For Printing Keys
//   for (String capitalcity :  capitalCities.keySet())
//   {
//       System.out.println(capitalcity);
//   }
//       System.out.println();
// // Print values
//    for (String capitalcity :  capitalCities.values())
//    {
//       System.out.println(capitalcity);
//    }
//
//// // Print keys and values
//     for (String cities : capitalCities.keySet())
//     {
//         System.out.println("key: " + cities + " -> values: " + capitalCities.get(cities));
//     }
//
//
//}
//}

/// Ex -3 :- Diff DataTypes

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> personInfo = new HashMap<>();

        personInfo.put("Adam", 30);
        personInfo.put("Jane", 26);
        personInfo.put("Zayn", 29);
        personInfo.put("Xavier", 30);

      // Enhnaced FOR LOOP
      // These will print items ascendingly according to the integers

        for (String person : personInfo.keySet()) {
            System.out.println(person + personInfo.get(person) );

        }

}
}

/// You can use the Var keyword
// Without var
// HashMap<String, String> capitalCities = new HashMap<String, String>();

// With var
// var capitalCities = new HashMap<String, String>();

/// The Map Interface
//  import java.util.Map;
//  import java.util.HashMap;
//
//  Map<String, String> capitalCities = new HashMap<>();
// These is Possible because hashmap implements Map interface
