package Storing;

public class Student {
    int roll;
    double marks;
    String name;

    Student(int roll, double marks, String name){
        this.roll=roll;
        this.marks=marks;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + roll +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.name.compareTo(o.name);   // we can do with comparable as well
        // can we put multiple logic here? No
        // only one logic
        // fixed logic
        // one at a time
        // we can't use multiple sorting logic
//    }
}
