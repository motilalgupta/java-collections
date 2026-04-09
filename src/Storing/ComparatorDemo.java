package Storing;

import Set.TreeSetDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {

        Comparator<Student> byroll = (s1, s2) -> s1.roll - s2.roll;
        Comparator<Student> studentComparator = Comparator.comparing(Student::getName)
                .thenComparing(Student::getRoll);

        TreeSet<Student> students = new TreeSet<>(studentComparator);

        students.add(new Student(4, 80, "Abhinav"));
        students.add(new Student(2, 90, "Bablu"));
        students.add(new Student(3, 70, "Rahul"));
        students.add(new Student(1, 60, "Rahul"));

        System.out.println(students);

//        TreeSet<Student> students = new TreeSet<>(new MyComparator());

//        students.add(new Student(4, 80, "Abhinav"));
//        students.add(new Student(2, 90, "Bablu"));
//        students.add(new Student(3, 70, "Rahul"));
//        students.add(new Student(1, 60, "Rahul"));
//
//        System.out.println(students);
    }
}
