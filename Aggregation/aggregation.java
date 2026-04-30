package Aggregation;
///     Aggregation = Collection without Dependency


///     Aggregation - Represents a "has-a" Relationship between objects'
///                   An Object can Contain Another Object as Part of its Structure
///                   But the Contained object's can exist independently

public class aggregation {
    public static void main(String[] args) {

   // STEP 1: Create independent Book objects
   // (Books exist even without Library → Aggregation)
    Book book1 = new Book("The Fellow of Ring", 150);
    Book book2 = new Book("The Two Towers", 250);
    Book book3 = new Book("The Return of the King", 550);

    // STEP 2: Store books inside an array
    Book[] books = {book1, book2, book3};

    // STEP 3: Create Library object
    Library library = new Library("Deccan", 1990, books); //Library receives already-created books

    library.displayInfo();

}
}

/// PSEUDOCODE — AGGREGATION

//  START
//
//  Create Book objects independently
//  Store books inside a collection (array)
//
//  Create Library object
//  Pass books into Library
//
//  Call displayInfo()
//  Print library details
//  Loop through books
//  Print each book info
//
//  END