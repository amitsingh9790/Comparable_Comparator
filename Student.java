package ComparatorDemo;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
        int age;
        String name;

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public String toString() {
            return "Student{" +"name='" + name + '\'' +", age=" + age +'}';
        }
}