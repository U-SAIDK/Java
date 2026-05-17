package OOP.Aggregation;

/// Library HAS-A collection of Books
/// This class aggregates Book objects

public class Library {

 String name;
 int year;
 Book[] books; // Aggregation happens here;we Declare the books object

// Constructor initializes Library details
// Notice: Books are PASSED, not CREATED here
 Library(String name, int year, Book[] books){
     this.name = name;
     this.year = year;
     this.books = books;
}

// Displays library and book details
    void displayInfo() {
        System.out.println("The " + this.name + " is " + this.year + " years old.");
        System.out.println("Books Available: ");

// Loop through aggregated Book objects
        for (Book book : books) {
            System.out.println(book.displayInfo());
        }
                         }

}
