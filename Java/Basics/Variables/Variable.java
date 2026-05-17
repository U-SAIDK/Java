package Basics.Variables; //// Variables are containers for storing data values.
             ////  Types of Variables in Java :- int ,float ,char , String, boolean



  public class  Variable {

  public static void main(String[] args){
    // Declaring Variables
    int myNum = 30;
    float myFloatNum = 2.0f;  // Float Value are Ended with f
    double pi = 3.1723;
    char myLetter = '$';
    String myText = "Hello";
    boolean myBool = true;

    //Printing Variables
    System.out.println(myNum);
    System.out.println(myFloatNum);
    System.out.println(pi);
    System.out.println(myLetter);
    System.out.println(myText);
    System.out.println(myBool);
}
}


//// # Ex -2  Display Variables , add Variables , Add String + Text ,
//// In Java + symbol has 2 Meaning :-
//// For text (strings), it joins them together (called concatenation).
//// For numbers, it adds values together.

//    public class  Variable {
//
//    public static void main(String[] args){
//        // Declaring Variables
//        String name = "USAID";
//        String surname = "KHAN";
//         int x = 5;  // Can Also be Written as int x = 5, y = 10; (comma-separated list)
//         int y = 10; // Multiple Variables Can Have the Same Value Ex int x,y,z;
//         //                                             x = y = z = 50; & x+y+z = 150
//        //To combine both text and a variable, use the + character :
//        System.out.println(name + " khan");
//
//        // To Combine 2 String Variable
//        System.out.println(name + surname);
//
//        // For int Number it Adds Values
//        System.out.println(x + y);
//
//        // For Combining String with Number :
//       System.out.println("Sum of X & Y is: " + x + y); // These will not Sum/Add x & y But Combine it
//       System.out.println("Sum of X & Y is: " + (x + y)); // These will Add x & y is (x+y) in is Round Bracs
//    }
//}



//// # Ex -3 :-  Constant (Final Keyword)
//// A variable declared with final becomes a constant, which means unchangeable and read-only:
//
//    public class Variable {
//
//    public static void main(String[] args){
//
//    final int num = 15; // Immutable Value , Cannot be Changed
//
//    System.out.println(num);
//    }
//}

//// #  Ex -4 :-  Var Keyword
////  The var keyword lets the compiler automatically detect the type of a variable based on the value you assign to it.
////  The var keyword was introduced in Java 10 (released in 2018).
////  Helps you write cleaner code and avoid repeating types
////  var only works when you assign a value at the same time (you can't declare var x; without assigning a value
//
//    public class Variable {
//
//    public static void main(String[] args) {
//
//        var myNum = 30; // No need to Declare Data Type just put var
//        var myFloatNum = 2.0f;
//        var pi = 3.1723;
//        var myLetter = '$';
//        var myText = "Hello";
//        var myBool = true;
//
//    System.out.println(myNum);
//    System.out.println(myFloatNum);
//    System.out.println(pi);
//    System.out.println(myLetter);
//    System.out.println(myText);
//    System.out.println(myBool);
//
//    }
//}
