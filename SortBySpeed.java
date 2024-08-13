package ComparatorDemo;

import java.util.Comparator;

public class SortBySpeed implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Car c1 = (Car) o1;
        Car c2 = (Car) o2;
        return (c1.speed>c2.speed)?1:-1;
    }
}
