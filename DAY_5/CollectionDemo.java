import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        // 1. LIST: ArrayList (Maintains order, duplicates allowed)
        List<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Neha");
        names.add("Rahul"); // Duplicate allowed
        System.out.println("ArrayList: " + names);

        // 2. SET: HashSet (No order, NO duplicates)
        Set<Integer> rollNos = new HashSet<>();
        rollNos.add(101);
        rollNos.add(105);
        rollNos.add(101); // Will be ignored quietly
        System.out.println("HashSet: " + rollNos);

        // 3. MAP: HashMap (Key-Value Pair)
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Maths", 95);
        marks.put("Science", 88);
        marks.put("Maths", 98); // Key repeat ki, toh purani value update (overwrite) ho jayegi
        System.out.println("HashMap: " + marks);
    }
}