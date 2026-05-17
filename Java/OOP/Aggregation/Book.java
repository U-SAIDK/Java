package OOP.Aggregation;

/// Independent Class
/// Book objects can exist WITHOUT Library

public class Book {

String title;
int pages;

Book(String title, int pages ){
this.title = title;
this.pages = pages;
}

 String displayInfo(){
   return this.title + " (" + this.pages + "pages)";
 }

}
///Key Idea:
/// Library contains Books ,BUT Books can exist independently without Library

