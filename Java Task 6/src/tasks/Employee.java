package tasks;

public class Employee {

    // Attributes
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter methods
    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    // Raise salary by %
    public int raiseSalary(int percent) {
        salary = salary + (salary * percent / 100);
        return salary;
    }

    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }

    // Main method to test
    public static void main(String[] args) {
    	Employee emp = new Employee(145, "Alex", "Karev", 850);
        System.out.println(emp.toString());                 
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Raised Salary: " + emp.raiseSalary(10)); 
        System.out.println(emp.toString());                  
    }
}
