package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee implements Comparator<Employee> {
    int id;
    String name;
    String dept;

    public Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    Employee(){

    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.id - o2.id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        Employee e1 = new Employee(11, "Mohit","Engineering");
        Employee e2 = new Employee(8, "Rohit","Engineering");
        Employee e3 = new Employee(25, "Sunny","Engineering");

        emp.add(e1);
        emp.add(e2);
        emp.add(e3);

        System.out.println(emp);
        Collections.sort(emp, new Employee());
        System.out.println(emp);
    }
}
