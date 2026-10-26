public class Employee extends Person {

    private int employeeId;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Salary: " + this.salary);
        System.out.println("-----------------------------");
    }
}