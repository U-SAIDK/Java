package Basics.Operators;

///  ORDER OF OPERATIONS = [P-E-M-D-A-S]
///  Parenthsis() , Exponent ² , Multiplication , Division , Addition , Substraction

//// Assigment Operators =

//// Arithematic Operators
//    public class Operator {
//
//    public static void main(String[] args) {
//
//        int x = 10;
//        int y =3;
//
//        System.out.println(x + y); // 13
//        System.out.println(x - y); // 7
//        System.out.println(x * y); // 30
//        System.out.println(x / y); // 3
//        System.out.println(x % y); // 1
//
//        int z = 5;
//        ++z;                   // Increment
//        System.out.println(z); // 6
//        --z;                   // Decrement
//        System.out.println(z); // 5
//
//    }
//}


//// Augmented Assigment Operators - = , += , -= , *= , /= , %= , &= , |= , ^= , >>= , <<=

//public class Operator{
//
//     public static void main(String[] args){
//
//     int x = 5;
//     int y = 5;
//
//     x += y; // Similar as x = x + y
////   x -= y;
////   x *= y;
////    etc...
//
//     System.out.println(x);
//}
//}




//// Comparison Operators - == , != , > , < , >= , <=

// Logical Operators
// &&  - AND :- Both Conditions Must be True
// || - OR   :- Either of one Condtion must be true , Atleast one the Condition is True
// !  - Not  :- Reverse / Do the Opposite

////  Ex 1 - &&  - AND

//public class Operator {
//
//    public static void main(String[] args) {
//
//        int temp = -1;
//        if (temp > 0 && temp < 30) { // Both the Conditions Must be True
//            System.out.println(" The Temperature is GOOD");
//        }
//        else {
//            System.out.println(" The Temperature is BAD");
//        }
//
//}
//}

import java.util.Scanner;

//// Ex 2 - || - OR
//
//public class Operator {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//         System.out.print("Enter you Current Temprature:  ");
//         int temp = scanner.nextInt();
//
//         if (temp < 0 || temp > 30){
//             System.out.println("The temprature is Bad");
//         }
//         else{
//             System.out.println("The temprature is Good");
//         }
//    scanner.close();
//}
//}

//// Ex 3 = !  - Not

public class Operator {

    public static void main(String args[]){

    boolean isSunny = true;
    if(!isSunny){               // ! Does the Exact Opposite
        System.out.println("ITS SUNNY OUTSIDE");
    }
    else{
        System.out.println("ITS Cloudy OUTSIDE");
    }
    }
}
