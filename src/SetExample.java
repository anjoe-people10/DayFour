import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class MyHashSet<T> extends HashSet<T> {
    @Override
    public String toString() {
        String setAsString = super.toString();
        return setAsString.replace(", " , " | ");
    }
}

//No order of elements, so no get()
public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new MyHashSet<Integer>();
        set.add(10);
        set.add(32);
        set.add(83);
        set.add(27);
        set.add(27);

        System.out.println(set);

        //remove()
        set.remove(83);

        System.out.println(set.toString());
        for(int number : set) {
            System.out.println(number);
        }
    }
}
