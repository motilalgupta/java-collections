package PracticeQuestions.IteratorQuestions.CollectionEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee6 {
    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class App{
    public static void main(String[] args) {
        List<Employee6> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter Employee Details: ");
            System.out.print("Enter the id: ");
            int id = sc.nextInt();
            System.out.print("Enter the name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Enter the salary: ");
            double salary = sc.nextDouble();

            Employee6 e = new Employee6();
            e.setId(id);
            e.setName(name);
            e.setSalary(salary);

            list.add(e);

            System.out.print("Do you want to add more: (Y/N) : ");
            if(sc.next().charAt(0) == 'N'){
                break;
            }
        }
        System.out.println("Details are: ");
        for(Employee6 e : list){
            System.out.println(e.getId()+" | "+e.getName()+" | "+e.getSalary());
        }
    }
}
