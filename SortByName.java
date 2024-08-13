package ComparatorDemo;

import java.util.Comparator;

public class SortByName implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student std1 = (Student) o1;
        Student std2 = (Student) o2;
//        return std1.name.compareTo(std2.name);
//        return (std1.name.charAt(0)>std2.name.charAt(0)) ? 1 : -1; //sort by name
        return (std1.name.length()>std2.name.length()) ? 1 : -1; //sort by length
    }
}
