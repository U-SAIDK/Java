package IfElse;

// Syntax
//   if (condition1) {
//   // code to run if condition1 is true
//   if (condition2) {
//     // code to run if both (previous)condition1 and condition2(current) are true
//    }
//  }


//    public class nested {
//
//    public static void main(String[] args) {
//
//    int age = 20;
//
//    if (age >= 18){
//       if(age >=60) {
//           System.out.println("You are a Senior Student");
//       }
//       else {
//           System.out.println("You are an Adult");
//       }}
//       else {
//           System.out.println("You are a Minor");
//       }
//}
//}


//// Ex 2:-

      import java.util.Scanner;

      public class nested {

          public static void main(String[] args) {

              int age;
              boolean isCitizen = false;
              Scanner scanner = new Scanner(System.in);

              System.out.println("Enter You Age");
              age = scanner.nextInt();

              if (age >= 18) {
                  System.out.println("Old Enough to Vote");

              if (isCitizen) {
                  System.out.println("You are a Citizen");
              }
              else  {
                  System.out.println("You are not a Citizen");
              }
              }
              else {
                  System.out.println("Not Old Enough to Vote");
              }

scanner.close();
}
}