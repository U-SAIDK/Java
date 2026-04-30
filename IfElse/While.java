package IfElse;

import java.util.Scanner;


// while loop = Continue some code while the condition is true
//                Condition must be true to enter the loop

//// while loop:
//   check condition → true = run forever , → false = stop
//   if condition is false initially → loop runs 0 times

//  public class While {
//    static void main(String[] args) {
//        int num ;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a number");
//        num = sc.nextInt();
//
//
//        while (num <= 0) {        // These will Keep on Running if the condition is True
//            System.out.println("Please enter a number greater than or equal to zero");
//        }
//
//}
//}

//// Ex 2:- While Loop

//public class While{
//    static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        String input = "";
//
//        while(!input.equals("Q")){
//            System.out.println("You are Playing a Game");
//            System.out.println("Press Q to Quit: ");
//            input = scanner.next();
//        }
//        System.out.println("You have Quit the Game ");
//
//scanner.close();
//
//}
//}

//// Ex 3

//  public class While {
//    static void main(String[] args) {
//        int age = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your age");
//        age = scanner.nextInt();
//
//        while (age < 0) {
//            System.out.println("Invalid age");
//            System.out.println("Enter your age");
//            age = scanner.nextInt();
//        }
//        System.out.println("you are " + age + " years old");
//
//
//    scanner.close();
//}
//}




//// Do While
// 1) Do while A do-while loop runs the code once first, then checks the condition and the condition at end.
// 2) If the condition is true, it runs again; if false, it stops.
// 3) This loop will execute the code block once, before checking if the condition is true, .
//    then it will repeat the loop as long as the condition is true

//// Ex 1
//public class While {
//    static void main(String[] args) {
//        int age = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter your age");
//        age = scanner.nextInt();
//
//        do {          // Do These Code inside{} Atleast Once Than see the Condition
//            System.out.println("Invalid age");
//            System.out.println("Enter your age");
//            age = scanner.nextInt();
//        }while (age < 0);
//        System.out.println("you are " + age + " years old");
//
//        scanner.close();
//    }
//}


//// Ex 2:-

public class While {
    static void main(String[] args) {

    int number = 0;
    Scanner scanner = new Scanner(System.in);

     do {
         System.out.println("Enter a number between 1-10");
         number = scanner.nextInt();

     }while (number < 1 || number > 10);
        System.out.println("You picked " + number);

scanner.close();
}
}


