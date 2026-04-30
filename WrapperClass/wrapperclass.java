package WrapperClass;

///  Wrapper Class = Allow Primitive Values (int,char,double,Boolean)
///                  to be used as Object. "Wrap them in an object"

///  Generally,Don't Wrap Primitives unless you need an object
///  Allows use of Collections Framework and static Utility Methods

//  The Table below shows the primitive type and the equivalent wrapper class:
//  Primitive Data Type	    Wrapper Class
//       byte	               Byte
//       short	               Short
//       int	               Integer
//       long	               Long
//       float	               Float
//       double	               Double
//       boolean	           Boolean
//       char	               Character


public class wrapperclass {
    public static void main(String[] args) {

    //  int a = 123 ; Primitive

    // Wrapper Class
    //  a,b,c,d is an Object and it Contains Primitive Value as Argument

        Integer a = new Integer(123);
        Double b = new Double(123.45);
        Character c = new Character('a');
        Boolean d = new Boolean(true);

    // Modern Way(Autoboxing) to Write Wrapper Class

        Integer a1 = 123;
        Double b2 = 123.45;
        Character c2 = 'a';
        Boolean d2 = true;

    // Unboxing (Primitive Form)
        int A = 123;
        Double B = 123.45;
        char C = 'a';
        Boolean D = true;
    }
}

////  Sometimes you must use wrapper classes, for example when working with Collection objects,
////  such as ArrayList where primitive types cannot be used (the list can only store objects)

/// Ex 2) Convert Primitive Data Type -> String , Using the tostring Method
//
// public class wrapperclass {
//    public static void main(String[] args) {
//
//
//   // Pass the Primitive Values to be Converted to String
//    String a = Integer.toString(123);
//    String b = Double.toString(123.56);
//    String c = Character.toString('A');
//    String d = Boolean.toString(true);
//
//    String x = a + b + c + d;
//        System.out.println(x);
//
// }
// }



/// Ex 3) Convert String -> Primitive DataType using the .parseDatatype Method

//   public class wrapperclass {
//   public static void main(String[] args) {
//
//   int a = Integer.parseInt("123");
//   double b = Double.parseDouble("123.45");
//   char c = "Pizza".charAt(0); // Unrelated to Wrapper Classes(it doesn't have .parse method)
//   boolean d = Boolean.parseBoolean("true");
//
//       System.out.println(a);
//       System.out.println(b);
//       System.out.println(c);
//       System.out.println(d);
//
//
//}
//}

/// Ex 4:- Char Wrapper Class Methods

//   public class wrapperclass {
//   public static void main(String[] args) {
//
//   char letter = 'b';
//       System.out.println(Character.isLowerCase(letter)); // Return True/false
//       System.out.println(Character.isUpperCase(letter)); // Pass in the Variable name
//  }
//  }
