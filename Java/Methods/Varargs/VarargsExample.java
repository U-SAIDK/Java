package Methods.Varargs;

//// VarargsExample = Allow A Method To Accept A Varying # of arguments
////           Makes Methods More Flexible , no need of overloaded Methods
////           Java will pack the Argument into the Array
////           ... ellipsis
//// Makes Methods Accept Any Number of Arguments

//// Ex 1
public class VarargsExample {
    public static void main(String[] args) {

        System.out.println(add(1,2,3,4));  // Can Pass Unlimited Number of Arguments
                                           // Java automatically converts these into an int array

}

static int add(int...numbers){    // ... -> ellipsis
                                 // You can think of it like: static int add(int[] numbers)

    int sum = 0;
    // Enhanced for-loop to iterate through the array
    for(int number : numbers){
       sum += number;

   }
return sum;
}


}

/// / Ex 2:- Example: Multiply Numbers
//
//public class VarargsExample {
//    public static void main(String[] args) {
//
//
//        System.out.println(multiply(2,2,2,2));
//
//}
//
//static double multiply(double...numbers){
//
//  double result = 1;
//   for(double number : numbers){
//        result *= number;  // result = result * n
//  }
//    return result;
//
//}
//}


/// If a method only processes inputs and
/// does not use object variables → make it static.