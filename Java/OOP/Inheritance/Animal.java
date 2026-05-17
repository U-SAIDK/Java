package OOP.Inheritance;

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

 public boolean isAlive;

 // Animal Constructor
 public Animal(){
  isAlive=true;
 }

 // Method
 public void eat(){
  System.out.println("Animal is eating");
 }

 public void move(){
  System.out.println("Animal is moving");
 }


}
