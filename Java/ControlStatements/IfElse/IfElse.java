package ControlStatements.IfElse;
import java.util.Scanner;

////  IF STATEMENT :- Run a block of code Code if a Condition is True
////                  If The Codition is false , don't do it
//// Note :- Conditions are checked from top to bottom; once a true condition is found, the remaining ones are skipped.
//public class IfElse {
//
//    public static void main(String args[]) {
//
//    var age = 1;
//
//    if(age >= 18){
//        System.out.println("You are adult");
//    }
//    else if(age < 0){
//        System.out.println("Not BOrn Yet");
//
//    } else if (age == 0) {
//        System.out.println("New Born");
//    }
//    else {
//        System.out.println("Child");
//    }
//
//    }
//
//}
//
//

//// Ex -2 User input
//public class IfElse{
//    public static void main(String[] args) {
//
//        int age;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter you age: ");
//        age = scanner.nextInt();
//
//    if(age >= 18){
//        System.out.println("You are adult");
//    }
//    else if(age < 0){
//        System.out.println("Not BOrn Yet");
//
//    } else if (age == 0) {
//        System.out.println("New Born");
//    }
//    else {
//        System.out.println("Child");
//    }
//
//}
//}

////// # Boolean

public class IfElse{
    static void main(String[] args) {

     boolean isStudent =  false;
     if(isStudent == true){
         System.out.println("You are a Student");
     }
     else {
         System.out.println("You are not a Student");
     }

    }
}
