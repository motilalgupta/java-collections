package Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
    int id;
    String name;
    Student(int id, String name){
        this.id=id;
        this.name=name;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
        // returns
        // +
        // -
        // 0
    }

    public static void main(String[] args) {
        List<Student> arrayList = new ArrayList<>();
        Student s = new Student(11, "Rahul");
        Student s1 = new Student(1, "Motilal");
        Student s2 = new Student(88, "Vishal");

        arrayList.add(s);
        arrayList.add(s1);
        arrayList.add(s2);
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}

