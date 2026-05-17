package ExceptionHandling.TryCatch;
import java.util.Scanner;
import java.util.InputMismatchException;

///   Exception = An Event that interrupts the Normal Flow of a Program
///   Ex - (Dividing By Zero , File not Found, Mismatch input type)
///   1) Without ExceptionExample handling → program CRASHES.
///   2) With ExceptionExample handling → program handles error safely.

///   Structure:
///     try {
///   risky code
///     }
///   catch(ExceptionType e) {
///   handling code
///    }
///   finally {
///   cleanup code (always runs)
///            }


///  Ex 1
//   public class ExceptionExample {
//   public static void main(String[] args) {
//   Scanner scanner = new Scanner(System.in);
//
//       try
//       {
//   //  System.out.println(1/0); // Arithmetic Exception
//       System.out.println("Enter a Number: "); // If you Type String you get an Exception
//       int number = scanner.nextInt();
//       System.out.println(number);
//       }
//
//       catch(InputMismatchException e){  //import the Exception Class Above
//           System.out.println("That Wasn't a Number");
//
//       }
//
//       catch(ArithmeticException e){ // Write the Type of Exception and give it name
//       // Instead of the Exception Error You Will See These as Result
//           System.out.println("You can't divide by zero Fool!!");
//       }
//
//
//       catch(Exception e){ // Exception followed by name = Custom Exception
//       // Acts as a Safety Net at last it is Good Practice
//       // In Case if any Previous catch didn't work these will work
//           System.out.println("Something went wrong!");
//       }
//
//       finally { // finally Block is if you forgot to add something and need to add it later
//           scanner.close();
//           System.out.println("These always Executed");
//       }
//
//  }
//  }


/// Ex - 2 :- try with Resources


//   public class ExceptionExample {
//   public static void main(String[] args) {
//
//   // Java is Going to Automatically Open & Close Resources
//
//       try (Scanner scanner = new Scanner(System.in)) {
//           //  System.out.println(1/0); // Arithmetic Exception
//           System.out.println("Enter a Number: "); // If you Type String you get an Exception
//           int number = scanner.nextInt();
//           System.out.println(number);
//       } catch (InputMismatchException e) { //import the Exception Class Above
//           System.out.println("That Wasn't a Number");
//
//       } catch (ArithmeticException e) { // Write the Type of Exception adn give it name
//           // Instead of the Exception Error You Will See These as Result
//           System.out.println("You can't divide by zero Fool!!");
//       } catch (Exception e) { // Write the Type of Exception -> Exception followed by name
//           // Acts as a Safety Net at last it is Good Practice
//           // In Case if any Previous catch didn't work these will work
//           System.out.println("Something went wrong!");
//       } finally { // finally Block is if you forgot to add something and need to add it later
//           System.out.println("These always Executed");
//       }
//
//  }
//  }