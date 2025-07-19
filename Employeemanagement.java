package Collections;
public static void main (String[] args)
public class Employeemanagement {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    // Constructor
    public Employeemanagement(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    // Method to print employee details
    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------------");
    }
}
