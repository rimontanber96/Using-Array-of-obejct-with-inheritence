public class Manager extends Employee {

    private String department;
    private int teamSize;

    public Manager() {
    }

    public Manager(String name, int employeeId, double salary,
                   String department, int teamSize) {
        super(name, employeeId, salary);
        this.department = department;
        this.teamSize = teamSize;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("-----------------------------");
    }
}