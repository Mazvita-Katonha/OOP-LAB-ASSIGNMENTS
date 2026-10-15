package Lab08_Collections;


  
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateRemover {
    public static void main(String[] args) {
        System.out.println("--- Lab 8 Basic: Lists vs Sets ---");

        // ---- PART 1: Working with a List (Allows Duplicates) ----
        List<String> rawNames = new ArrayList<>();
        rawNames.add("Farai");
        rawNames.add("Anesu");
        rawNames.add("Chipo");
        rawNames.add("Farai");  // Duplicate entry
        rawNames.add("Anesu");  // Duplicate entry
        rawNames.add("Tendai");

        System.out.println("Original List (with duplicates): " + rawNames);
        System.out.println("Total elements in List: " + rawNames.size());

        // ---- PART 2: Removing Duplicates using a Set ----
        // Passing the list into a HashSet instantly strips out all duplicates
        Set<String> uniqueNames = new HashSet<>(rawNames);
        System.out.println("\nHashSet Output (Duplicates removed, unordered): " + uniqueNames);

        // ---- PART 3: Sorting Elements ----
        // If we want the unique elements sorted alphabetically, we can use a TreeSet
        Set<String> sortedUniqueNames = new TreeSet<>(rawNames);
        System.out.println("TreeSet Output (Duplicates removed, automatically sorted): " + sortedUniqueNames);

        // Alternatively, sorting a standard List using the Collections utility class
        Collections.sort(rawNames);
        System.out.println("\nOriginal List after Collections.sort(): " + rawNames);
    }
}


