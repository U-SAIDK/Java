package Basics.DataTypes;

//  Non-primitive data types are called reference types because they refer to objects.

//  Reference -  Memory Address(Stack) that Points to the (Heap)
//               Used for Storing Complex Objects such as String, Arrays , Classes
// We Allocate Memory(Manually) & JRE releases it Automatically
// In Java, every class is a reference data type
// They store a memory address (reference) to the object rather than the actual value.

// The main differences between primitive and non-primitive data types are:
// Primitive types in Java are predefined and built into the language, while Reference types are created by the programmer (except for String).
// Reference types can be used to call methods to perform certain operations, whereas primitive types cannot.
// Primitive types start with a lowercase letter (like int), while Reference types typically starts with an uppercase letter (like String).
// Primitive types always hold a value, whereas Reference types can be null.


// Ex - 1 - Reference Data Types
// The Date class belongs to the java.util package.
// Since it is not in the same package as this class, we must import it.
import java.util.Date;

public class Reference {

    public static void main(String[] args) {

        Date now = new Date(); // Prints Current Date & Time

// Date → CLASS NAME (Reference Data Type)
// now (Reference Variable Name)
// -> It stores the memory address (reference) of the object of that Date object created in the heap.
// -> whereas  The reference variable itself is stored in STACK memory.

// new [Operator] Used to Allocate Memory for the Date object in the heap
// -> ; 2. Create an object ;  3. Call the constructor

// Date() is the constructor of Date Class , It prepares (initialize) the object
// -> Stores the current date & time inside the object as no Arguments are Passed
// -> () → Parentheses are used to pass arguments to the constructor.

// An object is an Instance of a Class
// The object created by "new Date()" is the instance of Date class.
// Objects are usually created using the new keyword.

        System.out.println(now); //  // Prints the Date object

    }
}   