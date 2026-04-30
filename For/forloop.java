package For;
import java.util.Scanner;
// For Loop :- Repeat some code a limited number of times /
//             Execute Some Code a CERTAIN amount of Times
// // for loop = init → check → run → update → repeat



public class forloop {
    public static void main(String[] args) {

     int x;
     Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many times you want to Loop");
        int max = scanner.nextInt();

     for (int i = 0; i < max; i++) {
         System.out.println(i);
     }


scanner.close();
}
}

// i++ increments the value of i by 1 (forward counting).
// i-- decrements the value of i by 1 (backward counting).
// i += 2 increments i by 2 (skips one value each time).
// i -= 2 decrements i by 2 (moves backward by two values).


