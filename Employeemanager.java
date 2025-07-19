package Collections;

import java.util.*;

class Employee {
 private int id;
 private String name;
 private String department;
 private double salary;

 public Employee(int id, String name, String department, double salary) {
     this.id = id;
     this.name = name;
     this.department = department;
     this.salary = salary;
 }
 public int getId() {
     return id;
 }
 public String getName() {
     return name;
 }
 public String getDepartment() {
     return department;
 }
 public double getSalary() {
     return salary;
 }
 public void display() {
     System.out.println("ID: " + id +
             ", Name: " + name +
             ", Department: " + department +
             ", Salary: ₹" + salary);
 }
}

public class Employeemanager {
 public static void main(String[] args) {
     
     List<Employee> employeeList = new ArrayList<>();

    
     employeeList.add(new Employee(101, "Alice", "HR", 40000));
     employeeList.add(new Employee(102, "Bob", "IT", 50000));
     employeeList.add(new Employee(103, "Charlie", "Finance", 45000));

     
     System.out.println("All Employees:");
     for (Employee emp : employeeList) {
         emp.display();
     }

     
     Scanner scanner = new Scanner(System.in);
     System.out.print("\nEnter employee ID to search: ");
     int searchId = scanner.nextInt();

     boolean found = false;
     for (Employee emp : employeeList) {
         if (emp.getId() == searchId) {
             System.out.println("Employee Found:");
             emp.display();
             found = true;
             break;
         }
     }

     if (!found) {
         System.out.println("Employee with ID " + searchId + " not found.");
     }

     scanner.close();
 }
}

