package IfElse;
import java.util.Scanner;

//   switch(expression) {
//        case x:
//        // code block
//        break;
//        case y:
//        // code block
//        break;
//   default:
//        // code block
//        }


//// Ex 1:- Switch
 public class Switch {

    public static void main(String[] args) {

    int day = 4;

 switch(day)

    {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default: // Acts as Else ;
            System.out.println("Please enter a valid day");
    }
    }}




//// Ex 2:- Enhanced Switch = A Replacement to many else if Statement & Switches [JAVA 14 FEATURE]

//public class Switch {
//    static void main(String[] args) {
//
//    String day = "Sunday" ;
//
//    switch(day) // Inside the Paranthesis Add the Value You Want to Examine against any matching Cases
//   {
//   case "Monday" -> System.out.println("It is a Weekday");
//   case "Tuesday" -> System.out.println("It is a Weekday");
//   case "Wednesday" -> System.out.println("It is a Weekday");
//   case "Thursday" -> System.out.println("It is a Weekday");
//   case "Friday" -> System.out.println("It is a Weekday");
//   case "Saturday" -> System.out.println("It is a WeekEnd");
//   case "Sunday" -> System.out.println("It is a WeekEnd");
//   default -> System.out.println("It is a Not A Valid Day");
//
//}
//}
//}


//// Ex 3:- Enhanced Switches:- Take User input and write more effectively


//   public class Switch {
//
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     String day;
//
//     System.out.println("Enter the day");
//     day = sc.nextLine();
//
//     switch (day){
//
//     case "Monday", "Tuesday", "Wednesday", "Thursday",  "Friday" -> System.out.println("Its a Weekday");
//     case "Saturday", "Sunday" -> System.out.println("Its a Weekend !!");
//
//    }
//
//}
//}

