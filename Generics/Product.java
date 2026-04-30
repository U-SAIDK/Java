package Generics;

public class Product<T, U> {// You can Pass Unlimited Parameter(Placeholder) T,U,V...etc

T item;
U price;

Product(T item, U price) {
        this.item = item;
        this.price = price;
}

 public T getitem(){
    return this.item;
 }

 public U getprice(){
    return this.price;
 }

}
