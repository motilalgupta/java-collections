package PracticeQuestions.IteratorQuestions.CollectionEntity;

import PracticeQuestions.IteratorQuestions.Employee;

import java.util.ArrayList;
import java.util.List;

public class Employee2 {
    int id;
    String name;
    double salary;
    Employee2(int id, String name, double salary){
        this.id = id;
        this.name=name;
        this.salary=salary;
    }
}
class Main{
    public static void main(String[] args) {
        int id[] = {1,2,3};
        String name[] = {"Motilal","Megha","Rahul"};
        double salary[] = {1000,15000,20000};
        List<Employee> list = new ArrayList<>();
        for(int i = 0; i<=id.length-1; i++){
            Employee e = new Employee(id[i],name[i],salary[i]);
            list.add(e);
        }
        System.out.println("Details are: ");
        for(Employee e: list){
            System.out.println(e);
        }
    }
}
