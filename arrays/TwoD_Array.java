package arrays;

//// 2D Array = An Array Where Each Element is an Array
////            Useful for Storing A Matrix of Data


    public class  TwoD_Array {
    public static void main(String[] args) {

//
//          R  C                              0                        1                                   2
//          |  |                              |                        |                                   |
     String [] [] groceries = {{"apple", "orange", "banana"}, {"potato", "onion", "carrot"}, {"Beef", "Chicken", "Fish"}};

//        -> R & C are Rows and Columns ; -> Elements at index of 0,1,2
//        Remember it in these format {{"apple", "orange", "banana"},    3 Rows and 3 Columns
//                                     {"potato", "onion", "carrot"},
//                                     {"Beef", "Chicken", "Fish"}},

     groceries[0][0] = "pineapple"; // Changing Elements
     groceries[1][0] = "Celery";

     System.out.println(groceries[0][0]); // Printing ELements

       for(String[] foods : groceries){ // Looping Through the array elements one by one
       for(String food : foods){
           System.out.print(food + " ");
       }
       System.out.println();
   }

}
}
