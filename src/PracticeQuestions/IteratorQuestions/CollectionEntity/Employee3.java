package PracticeQuestions.IteratorQuestions.CollectionEntity;

import PracticeQuestions.IteratorQuestions.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee3 {
    // Construct objects by reading using Scanner
    int id;
    String name;
    double salary;
    Employee3(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
class Driver {
    public static void main(String[] args) {
        List<Employee3> empList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five Employee details: ");

        for(int i = 0; i<5; i++){
            System.out.print("Enter Employee Id: ");
            Integer id = sc.nextInt();
            System.out.print("Enter Employee name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Enter employee salary: ");
            Integer salary = sc.nextInt();

            Employee3 e = new Employee3(id,name,salary);
            empList.add(e);
        }
        System.out.print("Employee Details: ");
        for(Employee3 e: empList){
            System.out.println(e);
        }
    }
}

