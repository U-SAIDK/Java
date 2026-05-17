package Basics.InputOutput;

 public class Print {

    public static void main(String[] args) {
//
////   System - Predefined Java class - java.lang(Contains system-related stuff & Methods)
////     out  - Member/method/Function of System class - output stream(console)- Static object inside System
////   print - Method to print text ; ln - Automatically Adds New Line

        System.out.println("These is a Statement !");
        System.out.println("These is the 2nd Statement !");

        System.out.println(5);    // You can Also Print Number instead of Text Just Don't Use ""
        System.out.println(5+5);  //You can Also Perform Mathematical Operations
        System.out.println("5" + 5); // "5" -> String , 5 -> int
        System.out.println("Sum of 5 is: " + (5 + 5));
  }
  }

////// Ex 2 :- Escape Sequence
//public class Print {
//
//    public static void main(String[] args) {
//        System.out.println("Hello \"john\" "); // Double Quotes \" \"
//        System.out.println("c:\\Windows\\.."); // backslash \ use \\
//        System.out.println("Usaid\nKhan"); // New Line \n
//        System.out.println("Usaid\tKhan"); // Tab (4 whitespace)
//}
//}

//// Format Output
//// Ex 3:- printf() = A Method Used to Format Output
////         %[flags][width][.precision][specifier-character]
//
//public class Print{
//   public static void main(String[] args) {
//
//        String name = "SpongeBob";
//        char firstLetter = 'S';
//        int age = 30;
//        double height = 60.5;
//        boolean isEmployed = true;
//
//        System.out.printf("Hello %s\n", name);
//        System.out.printf("Your name starts with %c\n", firstLetter);
//        System.out.printf("Your age is %d\n", age);
//        System.out.printf("Your height is %.1f\n", height); // Precision;
//        System.out.printf("Employed: %b\n", isEmployed);
//
//        System.out.printf("%s is %d years old\n", name, age);
//    }
//
//}

//// Ex :- Precision , FLags

//public class Print {
//   public static void main(String[] args) {
//
//    double price1 = 9000.99;
//    double price2 = 100.915;
//    double price3 = -54.01;
//
//        // + = output a Plus
//        // , = comma Grouping Seperator
//        // ( = negative number are enclosed in()
//        // space = display a minus if negative, space if positive
//
//        System.out.printf("%+.2f\n", price1);
//        System.out.printf("%,.2f\n", price2); // comma seperator for displaying prices
//        System.out.printf("%(.2f\n", price3);
//}
//}