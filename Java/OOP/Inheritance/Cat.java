package OOP.Inheritance;

/// Cat Class will inherit All the Attributes and Method of Animal CLass(Parent)
///  Even Though They don't anything within Them but they can have their own attributes& Methods
public class Cat extends Animal{

public int lives = 1;

public void speak(){
    System.out.println("Cat's Can't Speak");
}

}
