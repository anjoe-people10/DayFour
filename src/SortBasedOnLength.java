import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBasedOnLength {
    public static void main(String[] args) {
        //sort using the length of the string
        Comparator<String> sortUsingStringLength = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()) {
                    return 0;
                } else if(s1.length() > s2.length()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        List<String> list = new ArrayList<String>();

        list.add("LongerString");
        list.add("Word");
        list.add("Tester");
        list.add("Hi");

        Collections.sort(list, sortUsingStringLength);

        System.out.println(list);
    }
}
