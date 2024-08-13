package ComparatorDemo;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        Comparator<Student> com = (o1,o2)->(o1.age > o2.age)?1:-1;

        ArrayList al = new ArrayList<>();
        al.add(new Student(21,"AAAA"));
        al.add(new Student(31,"BB"));
        al.add(new Student(31,"A"));
        al.add(new Student(31,"BBB"));
        al.add(new Student(34,"AA"));
        al.add(new Student(28,"AAA"));
        al.add(new Student(31,"B"));

        //Collections.sort(stud,com); // With the help of comparator we are able to sort the list with own login
        //Collections.sort(al,SortByName());
        Collections.sort(al,new SortByName());
        for (Object s : al)
            System.out.println(s);

//        ArrayList al2 = new ArrayList<>();
//        al2.add(new Car(432,234,"Tesla"));
//        al2.add(new Car(275,223,"Maruti"));
//        al2.add(new Car(392,255,"BMW"));
//        al2.add(new Car(443,267,"Audi"));
//
//        Collections.sort(al2,new SortBySpeed());
//        System.out.println(al2);
    }
}
