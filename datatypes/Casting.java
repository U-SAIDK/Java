package datatypes;


// Type Casting :- Type casting means converting one data type into another.

// Implicit/Widening casting is done automatically by the compiler
// Explicit/Narrowing casting is done manually by the programmer using a cast operator.

    //// Ex - 1:-  Implicit Casting

    public class Casting {
        public static void main(String[] args) {

            int x = 10;
            int y = 3;

            double div = x / y;   // Automatically Done by the Compiler int -> Float
            System.out.println(div);

        }
    }


//// Ex - 2 Explicit Casting

//    public class Casting {
//
//    public static void main(String[] args) {
//
//        int x = 10;
//        int y = 3;
//
//        double div = (double) x / y ; // Manually Specifying (double)
//
//    System.out.println(div);
//   }
//   }



