package DSA.MAP;
import java.util.TreeMap; // Import the TreeMap class

///  A TreeMap is a collection that stores key/value pairs in sorted order by key.
///   Unlike HashMap, which does not maintain order, TreeMap keeps its keys sorted.
///

public class Treemap {
   public static void main(String[] args) {

   TreeMap<String, String> capitalCities = new TreeMap<>();

       capitalCities.put("England", "London");
       capitalCities.put("India", "New Dehli");
       capitalCities.put("Austria", "Wien");
       capitalCities.put("Norway", "Oslo");
       capitalCities.put("Norway", "Oslo");  // Duplicate
       capitalCities.put("USA", "Washington DC");

       System.out.println(capitalCities);

// Output: The keys are sorted alphabetically (e.g., {Austria=Wien, England=London, India=New Dehli, Norway=Oslo, USA=Washington DC}).
//Note: Duplicates like "Norway" will only appear once.

}
}
