package METHOD;


/// A lambda expression is a short block of code that takes in parameters and returns a value.
/// lambdas look similar to methods, but they do not need a name, and they can be written right inside a method body.
/// Syntax :- parameter -> expression OR (parameter1, parameter2) -> expression
/// Lambda expressions work only with functional interfaces.

//        | Part                 | Meaning                     |
//        | -------------------- | --------------------------- |
//        | `(parameters)`       | Input parameters            |
//        | `->`                 | Lambda operator (“goes to”) |
//        | `expression / block` | Code to execute             |



@FunctionalInterface
interface A
{
    void show();
}

public class Lambda {
   public static void main(String[] args) {

   A obj = () -> System.out.println("Hello World"); // Lambda Expression

   obj.show();

}
}
