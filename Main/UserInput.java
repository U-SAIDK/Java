package Main;


import java.util.Scanner;

public class UserInput{

public static void main(String[] args){

  Scanner scanner = new Scanner(System.in);
// Scanner → CLASS (Reference Data Type)
// scanner → REFERENCE VARIABLE (points to a Scanner object)


  System.out.print("Enter Your Name: ");
  String name = scanner.nextLine();
// String(Varaible DataType) name(Variable Name)
// scanner is Reference pointing to Scanner object
// nextLine() reads input(String) and returns it(String)

  System.out.print("Enter Your Age: ");
  int age = scanner.nextInt();
// nextInt() -> Reads input(int) and returns it(int)

  System.out.print("Enter Your GPA: ");
  double gpa = scanner.nextDouble();

  System.out.println("Are you Student? (True/False)");
   boolean isStudent = scanner.nextBoolean();

System.out.println("Your Name is " + name);
System.out.println("Your Age is " + age);
System.out.println("Your GPA is " + gpa);

 if(isStudent){
     System.out.println("Your are a Student ");
 }
 else{
     System.out.println("Your are not a Student ");
 }

}
}

//// Ex - 2 :- Input Buffer - An input buffer in Java is a temporary memory area that stores incoming input data
//// When you Take the int as input First instead of String There is an Input Buffer
// public class UserInput {
//    public static void main(String[] args) {
//
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Enter your age: ");
//    int age = scanner.nextInt();
//    scanner.nextLine(); // Eradicates the Input Buffer
//
//
//    System.out.print("Enter you name: ");
//    String name = scanner.nextLine();
//
//    System.out.print("Enter you Favorite Color: ");
//    String color = scanner.nextLine();
//
//    System.out.println(age);
//    System.out.println(name);
//    System.out.println(color);
//
//    scanner.close();
//
//}
//}


//// Ex 3:- Calculating Area of Rectangle :- Area = length × width

//public class UserInput {
//    public static void main(String[] args) {
//
//    Scanner scanner = new Scanner(System.in);
//
//   System.out.print("Enter Length: ");
//   double length = scanner.nextDouble();
//
//   System.out.print("Enter Width: ");
//   double width = scanner.nextDouble();
//
//   double area = length * width;
//   System.out.println("Area is: " + area);
//
//scanner.close();
//}
//}