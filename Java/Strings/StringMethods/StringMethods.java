// String in Java are Class (Build in) -> Reference Data Type
// Real Syntax = String name = new String("John") but as we use it often
// we Write it As- String name = "John"
// Strings are immutable in Java

package Strings.StringMethods;
import java.util.Scanner;

public class StringMethods {
public static void main(String[] args) {
    String message = "  Hello World" + "!!";
    System.out.println(message);

    // Methods inside String Class(Reference Type)
    System.out.println(message.startsWith("!!")); // Returns True/False to the Argument seeing at the end
    System.out.println(message.endsWith("!!")); // Returns True/False to the Argument seeing at the start
    System.out.println(message.length()); // Count the Lenght of a String
    System.out.println(message.toUpperCase()); // Convert string to upper Case
    System.out.println(message.toLowerCase()); // Convert string to Lower Case
    System.out.println(message.indexOf("H")); // Give the index of particular Character
    System.out.println(message.trim());  // Remove White Spaces
    System.out.println(message.replace("!", "*")); // Parameters are the target and replacement and ! & * are Argument we pass
}
}


////  Ex:- 2 - Substring() = A Method Used to Extract a Portion Of A String
////                         .substring(start, end)

// public class StringMethods{
//    static void main(String[] args) {
//
//    Scanner scanner =  new Scanner(System.in);
//
//
//
//    String email = "xyz123@gmail.com";
//    String username = email.substring(0, 6); // Create a New Substring of char index - 0-6
//    String domain = email.substring(6, 16); // instead of 6-16 just type 6(it will understand Till End)
//    // instead of index we find char
//    String username1 = email.substring(0, email.indexOf("@")); // same Output as email
//    String domain1 = email.substring(email.indexOf("@"));   // same Output as domain1
//
//        System.out.println(username);
//        System.out.println(domain);
//        System.out.println(username1);
//        System.out.println(domain1);
//
//        scanner.close();
//}
//}

//// Ex 3: User Input [Substring]

//  public class StringMethods {
//     static void main(String[] args) {
//
//     Scanner sc = new Scanner(System.in);
//
//     String email;
//     System.out.print("Enter you email: ");
//     email = sc.nextLine();
//
//
//     String userName = email.substring(0, email.indexOf("@"));
//     String domain = email.substring(email.indexOf("@"));
//
//     System.out.println("Your name is " + userName);
//     System.out.println("Your Domain is " + domain);
//
//  }
//  }