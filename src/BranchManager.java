public class BranchManager extends Banker {

    private String branchName;
    private int staffCount;

    public BranchManager() {
    }

    public BranchManager(String name, int employeeId, double salary,
                         String bankName, int clientCount,
                         String branchName, int staffCount) {
        super(name, employeeId, salary, bankName, clientCount);
        this.branchName = branchName;
        this.staffCount = staffCount;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Branch Name: " + branchName);
        System.out.println("Staff Count: " + staffCount);
        System.out.println("-----------------------------");
    }
}