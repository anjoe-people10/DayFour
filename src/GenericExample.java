import java.util.ArrayList;
import java.util.Arrays;

class GenericTest<T> {
    //Declaring object reference of Type T
    T object;

    GenericTest(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public <U> void display(U element) {
        //get appropriate article
        String article = ("AEIOU".contains("" + element.getClass().getSimpleName().charAt(0))) ? "an" : "a";
        System.out.printf("%s is %s %s%n", element, article, element.getClass().getSimpleName());
    }
}

public class GenericExample {
    public static void main(String[] args) {
        GenericTest<Integer> number = new GenericTest<>(5);
        GenericTest<String> string = new GenericTest<>("Hello World!");
        System.out.println(number.getObject());
        System.out.println(string.getObject());
        number.display("Hello");
        number.display(1);
        number.display(true);
        number.display(1.5F);
        number.display(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
    }
}
