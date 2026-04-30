package datatypes;

/// Strings are Immutable in Java (Cannot be Changed)
/// Every modification creates a new object for Strings [slow & memory waste]

/// 2 Mutable String Classes 1) StringBuffer ; 2) StringBuilder
///  Both allow changing text without creating new objects repeatedly.
///  String Builder is Latest and Mostly used & Effective


///  Ex -1 String BTS

   public class String_Class {
   public static void main(String[] args) {

       String str1 = "Hello";
       str1.concat("World"); // concat() joins (adds) one string to another string.
       System.out.println(str1); // Immutable Cannot be Changed

// Every modification creates a new object for Strings [slow & memory waste]
    String a = "Hello"; //  Hello is Created as Object
    String b = a + " World"; // "Hello World" is created as a new object.
//    System.out.println(b);
}
}




/// Ex 1 String Buffer :- is a Mutable String that is thread-safe.
/// Multiple threads can use it safely.  [Medium Speed]

//   public class String_Class{
//   public static void main(String[] args) {
//
//    StringBuffer sb = new StringBuffer("Java"); // Pass the String to the StringBuffer object
//
//   // Same object modified — no new string created.
//    sb.append(" Programming"); // Add String/Char
//    sb.insert(4, " Language");  // Add Char/String at index number
//    sb.replace(0, 4, "Core"); // Replaces characters between indexes.
//    sb.delete(0, 3); // Deletes part of text.
//    sb.deleteCharAt(4); // remove char
//    sb.reverse(); // reverse
//
//       System.out.println(sb);
//       System.out.println(sb.capacity()); // Internal Memory Size
//}
//}

/// Ex 2:- StringBuilder is a changeable string that is NOT thread-safe but very fast.
/// Used when only one thread works.

//public class String_Class{
//   public static void main(String[] args) {
//
//   StringBuilder text = new StringBuilder();
//   StringBuilder loop = new StringBuilder();
//       text.append("Java");
//       System.out.println(text);
//
//   // Building Text in Loop (Real Use Case)
//       for(int i = 1; i <= 5; i++) {
//           loop.append(i);
//       }
//
//       System.out.println(loop); // Very fast because object is reused.
//
//}
//}


/// Notes
/// Buffer = Safe
/// Builder = Faster

/// 🔧 Common Methods (Same for Both)
////      | Method    | What it Does    |
//        | --------- | --------------- |
//        | append()  | Add text        |
//        | insert()  | Add at position |
//        | delete()  | Remove part     |
//        | replace() | Replace text    |
//        | reverse() | Reverse string  |
//        | length()  | Get length      |
