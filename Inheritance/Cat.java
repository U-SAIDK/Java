package Inheritance;

/// Cat Class will inherit All the Attributes and Method of Animal CLass(Parent)
///  Even Though They don't anything within Them but they can have their own attributes& Methods
public class Cat extends Animal{

int lives = 1;

void speak(){
    System.out.println("Cat's Can't Speak");
}

}
