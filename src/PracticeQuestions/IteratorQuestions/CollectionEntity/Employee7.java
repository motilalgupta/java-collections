package PracticeQuestions.IteratorQuestions.CollectionEntity;

import java.util.ArrayList;
import java.util.List;

public class Employee7 {
    private int id;
    private String name;
    private double salary;
    private String location;

    Employee7(int id, String name, double salary,String location){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.location=location;
    }

    public Employee7() {

    }

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static void main(String[] args) {
        int[] ids = {101,102,103,104,105,106};
        String[] names = {"Amar","Hareen","Sathya","Annie","Raji","Harsha",};
        double[] salaries = {30000,35000,40000,45000,42000,50000};
        String[] locations = {"Hyderabad","Chennai","Bangalore","Hyderabad","Pune","Bangelore"};
        List<Employee7> list = new ArrayList<>();
        for(int i = 0; i<=ids.length-1; i++){
            Employee7 e = new Employee7();
            e.setId(ids[i]);
            e.setName(names[i]);
            e.setSalary(salaries[i]);
            e.setLocation(locations[i]);
            list.add(e);
        }
        System.out.println("Show Details: ");
        for(Employee7 e: list){
            System.out.println(e.getId()+" | "+e.getName()+" | "+e.getSalary()+" | "+e.getLocation());
        }
    }
}
