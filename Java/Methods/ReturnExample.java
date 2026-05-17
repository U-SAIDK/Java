package Methods;
import java.util.Scanner;

/// return = Returns a Value Back to where you Call a Function
///          When you call a Function it can send something Back


// public class ReturnExample {
//    static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter a number");
//        int num = scanner.nextInt();
//
//        int x = square(num);
//
//        System.out.println("The Square is: " + x);
//
//}
// static int square(int x){
//
//         return x*x;    }
//
//}


/// Ex 2 :- Check Age of a Person using Boolean Function

//public class ReturnExample {
//    static void main(String[] args) {
//    Scanner scanner=new Scanner(System.in);
//    int age;
//
//        System.out.println("Enter your age");
//        age = scanner.nextInt();
//
//
//    if(ageCheck(age)){
//        System.out.println(" You are 18+");
//    }
//    else {
//        System.out.println(" You are not 18");
//    }
//
//    }
//static boolean ageCheck(int age){
//   if (age >= 18)
//   return true;
//   else
//   return false;
//
//}
//}


///  Ex 3 Greater of 2 numbers

public class ReturnExample {
    static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int firstNum = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNum = scanner.nextInt();

     int result = getMax(firstNum, secondNum);

        System.out.println(result);

}
static int getMax(int x, int y){
        if (x > y){
            return x;
        }
        else{
            return y;
        }
}

}
