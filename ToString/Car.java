package ToString;

public class Car {
    String make;
    String model;
    String color;
    int year;

Car(String make, String model, String color, int year)
{    this.make = make;
     this.model = model;
     this.color = color;
     this.year = year;
}

// @Override is Annotation it shows if any errors
// The toString(){} Method we first Declare the access modifier then return type
/// It returns a String representation of the object But after we Use toString(){}
/// We override it to return Meaningful details.
@Override
public String toString(){

 return this.color + " " + this.year + " " + this.make + " " + this.model;


}


}
