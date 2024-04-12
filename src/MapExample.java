import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        //Hashtable is depreciated, but has synchronization
        Map<String, Integer> map = new HashMap<>();

        //put
        map.put("Anjoe", 84);
        map.put("Ananthu", 92);
        map.put("Abel", 74);

        //put as update
        map.put("Anjoe", 89);

        //get
        System.out.println(map.get("Anjoe"));

        //keySet()
        for (String name : map.keySet()) {
            System.out.printf("Name: %s Marks: %d%n", name, map.get(name));
        }

        //remove()
        map.remove("Ananthu");

        //containsKey() and containsValue
        System.out.println(map.containsKey("Ananthu"));
        System.out.println(map.containsValue(92));

        //size()
        System.out.println("Size of map is " + map.size());

        //values()
        for(int value : map.values()) {
            System.out.println(value);
        }

        //entrySet()
        System.out.println(map.entrySet());

    }
}
