package Methods;
import java.util.Scanner;
/// Method = A Block of Code that is Executed when Called()
///            Also called Function in other Languages
/// Method is a Function inside a Class

// public class Method {
//    static void main(String[] args) {
//
//   String name = "USAID";
//   int age = 25;
//
//
//        happyBirthday(name, age);
//
//
//}
//static void happyBirthday(String name, int age){
//    System.out.println("Happy Birthday to You!");
//    System.out.printf("Happy Birthday to dear you %s!\n", name);
//    System.out.printf("You are %d years Old!", age);
//    System.out.println("Happy Birthday to You!\n");
//    }
//}



///  Ex 2 :- Example 2
public class Method {
    static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     String name;
     int age;

        System.out.println("Enter your name:");
        name = scanner.nextLine();

        System.out.println("Enter You Age");
        age = scanner.nextInt();

     happyBirthday(name, age);

    }

static void happyBirthday(String birthdayBoi, int birth){
    System.out.println("Happy Birthday");
    System.out.printf("Happy Birthday Dear %s", birthdayBoi);
    System.out.println("Happy Birthday to you");
    System.out.printf("You are %d years old", birth);

}
}