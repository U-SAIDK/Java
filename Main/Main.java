package Main; // A package is simply a folder (namespace) used to organize classes.


// In Java, everything must be inside a class every application begins with a class name, and that class must match the filename.


// Access modifier -meaning that it is used to set the access level for classes, attributes, methods and constructors.
// 4 Types
// | Modifier         | Who can access it         |
// | 1) public        | Anyone, from anywhere     |
// | 2) (no modifier) | Same package only         |
// | 3) protected     | Same package + subclasses |
// | 4) private       | Same class only           |
// We put Access Modifiers at The Beginning of Class and Method

// Package :- A Group of Related Classes
//  Class - A class is a blueprint for an object.
//  A class is a [Box]container for Code,Ex:- functions,variables, etc
//  Methods - Function that is Part of a Class //  Method is Function that Belongs A Class


// Access modifier (Filename = Class Name)
//       |           |
      public class Main {  // Start of the Programme(Class)
      public static void main(String[] args) {    // Main Method-(Function that are Part of a Class) // main method: program execution starts from here
                                                  // psvm() is a Function that Belongs to a Class [Main]

// public = accessible from anywhere , JVM (Java Virtual Machine) must access this class to start execution
// static = Belongs to class, not to object [If static is removed → JVM cannot run program]
// void = Return type -> returns nothing [ NULL ]
// String[] args -> This is for command-line arguments ; String → Data type (text);[] → Array ; args → Variable name (Can name it AnyThing)

          System.out.println("Hello World");// Print Output

      }

}

// Tip/Note :- 1) Class Naming Rule - Use PascalCase -> First Char Capitalized
//             2) Method Naming Rule - Use camelCase -> First letter small ; Next words capitalized
//             3) Variable Naming Rule - camelCase
//             4) Constant Naming Rule(final) -  PascalCase