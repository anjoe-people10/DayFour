import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [Name=" + name + ", Age=" + age + "]";
    }
}

public class CollectionsWithObjects {
    public static void main(String[] args) {
        Comparator<Student> compareUsingAge = new Comparator<Student>() {

            @Override
            public int compare(Student student1, Student student2) {
                if(student1.age == student2.age) {
                    return 0;
                } else if(student1.age > student2.age) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        List<Student> students = new ArrayList<>();

        students.add(new Student(22, "Kiran"));
        students.add(new Student(20, "John"));
        students.add(new Student(21, "Anjoe"));

        System.out.println("Before sorting");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nAfter sorting on age");
        Collections.sort(students, compareUsingAge);
        for (Student student : students) {
            System.out.println(student);
        }

        //using List.sort(comparator) instead of Collections.sort(list, comparator)
        students.sort((student1, student2) ->  student1.name.compareTo(student2.name));
        System.out.println("\nAfter sorting on name");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
