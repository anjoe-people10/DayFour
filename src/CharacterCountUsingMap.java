import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CharacterCountUsingMap {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String terminalInput = "teststring";
        for (char character : terminalInput.toCharArray()) {
            map.put(character, map.getOrDefault(character, 0) + 1);
        }
        System.out.println(map);
    }
}
