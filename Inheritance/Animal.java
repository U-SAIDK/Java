package Inheritance;

///  The Animal Class will be the Parent,
///  Cat,Dog will be the Child


// public class Animal {
//
// boolean isAlive;
//
// // Animal Constructor
// Animal(){
//  isAlive=true;
// }
//
// // Method
// void eat(){
//  System.out.println("Animal is eating");
// }
//
//
// }

public class Animal extends Organism { /// Parent <- Grandparent

 boolean isAlive;

 // Animal Constructor
 Animal(){
  isAlive=true;
 }

 // Method
 void eat(){
  System.out.println("Animal is eating");
 }

 void move(){
  System.out.println("Animal is moving");
 }


}
