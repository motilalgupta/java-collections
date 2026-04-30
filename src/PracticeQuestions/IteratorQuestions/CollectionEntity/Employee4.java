package PracticeQuestions.IteratorQuestions.CollectionEntity;

import PracticeQuestions.IteratorQuestions.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee4 {
    // Store objects to	list until user quits
    int id;
    String name;
    double salary;
    Employee4(int id, String name, double salaray){
        this.id=id;
        this.name=name;
        this.salary=salaray;
    }
}
class Test{
    public static void main(String[] args) {
        List<Employee4> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Details:- ");

        while (true) {
            System.out.print("Enter Employee Id: ");
            Integer id = sc.nextInt();
            System.out.print("Enter Employee Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Enter Employee Salary: ");
            Double salary = sc.nextDouble();

            Employee4 e2 = new Employee4(id, name, salary);
            list.add(e2);

            System.out.println("Do you want to add more records (Yes/No)");
            System.out.print("Enter your choice: ");
            sc.nextLine();
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("No")) {
                break;
            }

        }
        System.out.println("Details are:- ");
        for(Employee4 e: list){
            System.out.println(e.id+","+e.name+","+e.salary);
        }
    }
}

