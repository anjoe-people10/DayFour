import java.util.Collections;
import java.util.Comparator;
import  java.util.List;
import java.util.ArrayList;

public class CollectionsAndComparatorExample {
    public static void main(String[] args) {
        //sort using the last digit
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10 == j%10) {
                    return 0;
                }
                else if(i%10 > j%10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        List<Integer> list = new ArrayList<>();

        list.add(53);
        list.add(10);
        list.add(71);
        list.add(19);
        list.add(47);

        System.out.println(list);

        //sort() default
        Collections.sort(list);
        System.out.println(list);

        //sort with custom comparator
        Collections.sort(list, comparator);
        System.out.println(list);
    }
}
