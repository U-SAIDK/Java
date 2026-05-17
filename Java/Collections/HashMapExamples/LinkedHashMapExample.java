package Collections.HashMapExamples;
import java.util.LinkedHashMap;

///  A LinkedHashMap stores keys and values, and keeps them in the same order you put them in.
/// Use LinkedHashMap when you want predictable iteration order (insertion order).


public class LinkedHashMapExample {
   public static void main(String[] args) {

       LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();
       capitalCities.put("England", "London");
       capitalCities.put("India", "New Dehli");
       capitalCities.put("Austria", "Wien");
       capitalCities.put("Norway", "Oslo");
       capitalCities.put("Norway", "Oslo");  // Duplicate
       capitalCities.put("USA", "Washington DC");

       System.out.println(capitalCities);

// Output: The items will appear in the order they were added (e.g., {England=London, India=New Dehli, Austria=Wien, Norway=Oslo, USA=Washington DC}).
//Note: Duplicates like "Norway" are ignored.

}
}


