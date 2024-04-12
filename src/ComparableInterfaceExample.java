import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ComparableStudent implements Comparable<ComparableStudent> {
    int age;
    String name;

    ComparableStudent(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [Name=" + name + ", Age=" + age + "]";
    }

    @Override
    public int compareTo(ComparableStudent that) {
        return Integer.compare(this.age, that.age);
    }
}

public class ComparableInterfaceExample {
    public static void main(String[] args) {

        List<ComparableStudent> students = new ArrayList<>();

        students.add(new ComparableStudent(22, "Kiran"));
        students.add(new ComparableStudent(20, "John"));
        students.add(new ComparableStudent(21, "Anjoe"));

        System.out.println("Before sorting");
        for (ComparableStudent student : students) {
            System.out.println(student);
        }

        System.out.println("\nAfter sorting on age");
        Collections.sort(students);
        for (ComparableStudent student : students) {
            System.out.println(student);
        }

    }
}
