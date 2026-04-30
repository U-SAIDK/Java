package Encapsulation;

///  The meaning of Encapsulation, is to make sure that "sensitive"
///  data is hidden from users. To achieve this, you must: declare class variables/attributes as private
///  1)  get  methods -> View / access the value of a private variable
///  2) set methods -> Update / Change Value of a private variable

    public class Car {
    // The Attributes are Publically Accessible

    // private make them accessible only inside the Class they are created in
    private String model;
    private String color;
    private int price;


    Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

   // Create Method getter method for an Attributes to be Viewed
   // The get method returns the value of the variable name.
    String getModel(){return this.model;}
    String getColor() {return this.color;}
    String getPrice(){return "$" + this.price;}

    // setter Method for Attributes make Attributes mutable
    void setColor(String color){
        this.color = color;
    }
    void setPrice(int price){
        this.price = price;
    }
    // As we Have not set the model Attributes We Can't Change it(immutable)
    
}