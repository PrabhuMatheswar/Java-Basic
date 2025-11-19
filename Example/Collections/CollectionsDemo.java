import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        // --- List examples ---
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Bus");
        arrayList.add("Car");
        arrayList.add("Train");
        System.out.println("ArrayList: " + arrayList);

        List<String> linkedList = new LinkedList<>(arrayList);
        linkedList.add(0, "Flight");
        System.out.println("LinkedList: " + linkedList);

        // --- Set examples ---
        Set<String> hashSet = new HashSet<>(Arrays.asList("Bus", "Car", "Bus", "Train"));
        System.out.println("HashSet: " + hashSet);

        Set<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet: " + treeSet);

        // --- Map examples ---
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Ram", 30);
        hashMap.put("Ravi", 25);
        hashMap.put("Guru", 35);
        System.out.println("HashMap entries: " + hashMap);

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("TreeMap entries: " + treeMap);


        // --- Collections utilities ---
        Collections.sort(arrayList);
        System.out.println("Sorted ArrayList: " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("Reversed ArrayList: " + arrayList);
        Collections.shuffle(arrayList, new Random(0));
        System.out.println("Shuffled ArrayList: " + arrayList);

    }
}
