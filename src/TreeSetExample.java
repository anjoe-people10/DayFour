import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

//Similar to HashSet, but sorted according to natural order
public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int valueToAdd = random.nextInt(100);
            set.add(valueToAdd);
            System.out.println(set);
        }

        //Custom comparator passed to the tree-set which orders elements in the descending order
        System.out.println("\nReverse ordered TreeSet");
        set = new TreeSet<Integer>((i, j) -> Integer.compare(j, i));
        for (int i = 0; i < 10; i++) {
            int valueToAdd = random.nextInt(100);
            set.add(valueToAdd);
            System.out.println(set);
        }
    }
}
