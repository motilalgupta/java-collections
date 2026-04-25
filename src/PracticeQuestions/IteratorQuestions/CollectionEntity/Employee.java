package PracticeQuestions.IteratorQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// Program to create and display List of Employees:

// 1. Employee.java: contains Employee class
// 2. Main.java: contains code of creating ArrayList with Employees and display.

// • Create Employee class with instance variables id, name, salary
// • Define parameterized constructor to initialize the object.

public class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp Id: "+id+","+" Name: "+name+","+" Salary: "+salary;
    }
}
class Main{
    public static void main(String[] args) {
        List<Employee> emplist = new ArrayList<>();

        emplist.add(new Employee(1,"Motilal",10000));
        emplist.add(new Employee(2,"Megha", 15000));
        emplist.add(new Employee(3,"Rahul",20000));

//        for(Employee e: emplist){
//            System.out.println(e);        // using for each loop
//        }

//        for(int i = 0; i<=emplist.size()-1; i++){ // using for loop
//            Employee e = emplist.get(i);
//            System.out.println(e);

            // Display Employee list in reverse order using ListIterator;

//        ListIterator listIterator = emplist.listIterator(emplist.size());
//        while (listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }

            // Display Employee list in reverse order using for loop

//        for(int i = emplist.size()-1; i>=0; i--){
//            Employee e = emplist.get(i);
//            System.out.println(e);

            // Display Employee list using iterator

        Iterator<Employee> iterator = emplist.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
