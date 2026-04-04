package ArrayList;

import java.util.ArrayList;
import java.util.List;

class Student{
    int id;
    String name;
    String course;
    Student(int id, String name, String course){
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Id: "+ id +", Name: "+name+", Course: "+course+" | ";
    }
}
public class CustomList {
    public static void main(String[] args) {
        Student s = new Student(1,"Motilal", "Java");
        Student s1 = new Student(2,"Megha", "DSA");
        Student s2 = new Student(3,"Rahul", "DevOps");

        List<Student> studentList = new ArrayList<>();
        studentList.add(s);
        studentList.add(s1);
        studentList.add(s2);
        System.out.println(studentList);

    }
}
