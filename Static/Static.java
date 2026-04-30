 package Static;

///  Static  = Makes a Variable or Method
///           Belong To a Class & Common to All the Objects
///           Commonly Used for Utility Methods or Shared Resources

///  Ex 1:- Static Variables
///  Static members belong to the CLASS, not individual objects
///  Static variables are shared among all objects

// class Mobile
// {
//    String brand;       // Instance variable → each object has its own copy,different for every object
//    static String name; // Static variable → shared by all objects
//    int price;          // Instance variable
//
//
// // 1 Method to display mobile details
// public void show()
// {
//    System.out.println(brand + ": " + name + ": " + price);
// }
//}
//
//    public class Static {
//    public static void main(String[] args) {
//
//    // Create first Mobile object
//     Mobile obj1 = new Mobile();
//     Mobile.name = "Smartphone";   // Access static variable using class name (recommended way)
//     obj1.brand = "Iphone";
//     obj1.price = 5000;
//
//     // Create second Mobile object
//
//     Mobile obj2 = new Mobile();
//     obj2.name = "Very Smartphone";
//     // Assign values specific to obj2
//     obj2.brand = "Samsung";
//     obj2.price = 8000;
//
//     // Changing static variable again
//     // This change affects ALL objects
//     Mobile.name = "Phone"; // These not only change obj1name but also obj2name
//
//        obj1.show();  // Simple Call Method with Object Name
//        obj2.show();
//
// }
// }


/// Ex 2 :- Static Method
/// Static Method Can be Directly Used with Class Name
/// You can Use Static Variable inside Static Method
/// But Cannot Use Non-Static Variable inside Static Method

class Mobile
{
    // -------- VARIABLES --------
    String brand;       // Instance  variable ->  Every object has its own copy,
    static String name; // Static    variable ->  Shared by all objects
    int price;          // Instance  variable ->  Different for every object [obj1.brand ≠ obj2.brand]


    // 1 Simple Non-Static Method to display mobile details
    public void show()
    {
        System.out.println(brand + ": " + name + ": " + price);
    }

    // 2 Static Method
    public static void show1(Mobile obj){   // Set the Parameters if you are Receiving Non Static Variables
        System.out.println(obj.brand + ": " + name + ": " + obj.price);
    }

}

 public class Static {
     public static void main(String[] args) {

         // -------- OBJECT 1 CREATION --------
         Mobile obj1 = new Mobile();

         Mobile.name = "Smartphone"; // Accessing Static Variable
         obj1.brand = "Iphone";
         obj1.price = 5000;

         // -------- OBJECT 2 CREATION --------
         Mobile obj2 = new Mobile();

         obj2.name = "Very Smartphone";
         obj2.brand = "Samsung";
         obj2.price = 8000;


         // This changes static value for ALL objects
         // obj1.name and obj2.name both become "Phone"
         Mobile.name = "Phone"; // Changing Static Variable


         // -------- CALLING NON-STATIC METHOD --------
         obj1.show();   // called using object name
         obj2.show();
      // Mobile.show(); ❌ ERROR -> Non-static methods require an object

         // -------- CALLING STATIC METHOD --------
         Mobile.show1(obj1);
         // Static methods are called using class name
         // Object passed As Argument because method needs instance data of a Certain Object
     }
 }
///  Static method → can access only static data directly.
///  To access non-static data → object reference is required.

//// The main method is static so the JVM can call it without creating an object of the class.
//// Static methods belong to the class not to Object
