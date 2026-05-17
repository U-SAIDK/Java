package AdvancedConcepts.Generics;

// Generic class
public class Box<T> {

    // T is a placeholder type
    T item;

    // Setter method
    public void setItem(T item){
        this.item = item;
    }

    // Getter method
    public T getItem(){
        return this.item;
    }
}
