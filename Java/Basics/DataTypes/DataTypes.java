package Basics.DataTypes;

// A variable in Java must be a specified data type
// Data types are divided into two groups:
// Primitive  - Use to Simple Values/Data Directly into Memory (Stack)
// Reference -  Memory Address(Stack) that Points to the (Heap)
//              Used for Storing Complex Objects such as String, Arrays and Classes

// For Primitive - JRE Allocates & Releases memory Autmatically.(NO Manual)
// For Reference - We Allocate Memory(Manually) & JRE releases it Automatically

// There are eight primitive data types in Java:
// Data Type	      Suffix              Description
// byte	                --          Stores whole numbers from -128 to 127
// short	            --          Stores whole numbers from -32,768 to 32,767
// int	                --          Stores whole numbers from -2,147,483,648 to 2,147,483,647
// long	                L/l         Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
// float	            F/f         Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
// double	            --          Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
// boolean	            --          Stores true or false values
// char	               '  '         Stores a single character/letter or ASCII values

// There can be Multiple Objects As it is Created by User but here are few Examples - string , array , object


// #  Ex :- 1  Primitive DataType
public class DataTypes {

 public static void main(String[] args) {

       byte age = 30  ;
       long viewCount = 3_123_324_324l; // _ Underscore here is similar to Comma in Simple Language - 3,123,324,324
       int num = 10;
       float price = 10.99f;
       char letter = 'A';
       boolean isEligible = true;

       System.out.println(age);
       System.out.println(viewCount);
       System.out.println(num);
       System.out.println(price);
       System.out.println(letter);
       System.out.println(isEligible);

 }
 }


//import java.awt.*;  // Importing the Point class from java.awt package
//
////// EX :- 2 Difference Between Primitive and Reference Datatype
//// Primitive :- The value that we assign to a variable is stored directly
////               in that variable's memory location.
//// Reference :- Reference types store memory addresses, not actual values.
////              They store a reference (address) to an object that exists somewhere else in memory (Heap memory).
//
//public class DataTypes {
//
//    public static void main(String[] args) {
//
//// 1) "new Point(1,1)" creates a NEW object in HEAP memory,that object Contains x= 1, y = 1;
//// 2)  But the Variable "point1" does NOT store the actual object,
////     it stores the MEMORY ADDRESS (reference) of that Point object.
//// Memory representation:
////
//// point1  -------->  [ Point Object ]
////                        x = 1
////                        y = 1
//
//     Point point1 = new Point(1,1);
//
//     Point point2 = point1;
//// STEP 2:We are simply copying the  REFERENCE stored in point1 into point2.
//// point2(second reference) now points to the SAME object as point1.
////   Memory representation:-
////
////   point1  -------->
////                       [ Point Object ]
////   point2  -------->       x = 1
////                           y = 1
//
//
//     point2.x = 2;
//// By Modifying either of the Reference Variable we are just changing Values in the Point Object
//// If we printed point1, it would print the SAME result,because both variables reference the same object.
//
//
//     System.out.println(point2);
//
//}
//}
