import java.util.*;

public class CollectionsClassExample {
    public static void main(String[] args) {
        //Same as Collections.reverseOrder()
        Comparator<Integer> comparator = (i, j) -> Integer.compare(j, i);

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);

        //reverse()
        Collections.reverse(list);
        System.out.println(list);

        //shuffle()
        Collections.shuffle(list);
        System.out.println(list);

        //sort() in reverse order
        Collections.sort(list, comparator);
        System.out.println(list);
    }
}
