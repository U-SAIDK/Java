package IfElse;
import java.util.Scanner;


////  Short Hand If...Else (Ternary Operator)
////    Ternary means 3
////    __? ___ : __
////    condition ? expression_if_true : expression_if_false;
////    The ternary operator returns a value based on a condition: if the condition is true,
////    it returns the first value; Otherwise, it returns the second value.


//public class TernaryOperator {
//    public static void main(String[] args) {
//        int x,y,max;
//    Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter a 1st Number: ");
//        x = scanner.nextInt();
//
//        System.out.println("Enter a 2nd Number: ");
//        y = scanner.nextInt();
//
//        max = x>y ? x:y;
//        System.out.println("The Greater of two number is " + max);
//scanner.close();
//}
//}

/// Nested Ternary Operator

public class TernaryOperator {
    public static void main(String[] args) {
        int time = 22;
        String message = (time < 12) ? "Good morning." : (time < 18) ? "Good afternoon." : "Good evening.";
        // Nested ternary:
//* First condition:
// *   (time < 12)
//                *   - If true  → "Good morning."
//                *   - If false → check the next condition(2nd Contidion   )
// *
// * Second condition (nested ternary):
// *   (time < 18)
//                *   - If true  → "Good afternoon."
//                *   - If false → "Good evening."
        System.out.println(message);

    }

}