public class Application {

    public static void main(String[] args) {

        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Rahim", 28, 101, 60000);
        employees[1] = new Employee("Karim", 30, 102, 65000);

        BranchManager[] managers = new BranchManager[2];
        managers[0] = new BranchManager("Sara", 40, "Dhaka Main", 25);
        managers[1] = new BranchManager("Nila", 38, "Sylhet", 18);

        System.out.println("===== Employees =====");
        for (int i = 0; i < employees.length; i++) {
            employees[i].display();
        }

        System.out.println("===== Branch Managers =====");
        for (int i = 0; i < managers.length; i++) {
            managers[i].display();
        }
    }
}