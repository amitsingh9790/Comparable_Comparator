package ComparatorDemo;

import java.util.Comparator;

public class SortByAge implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        return (s1.age>s2.age)?1:-1;
    }
}
