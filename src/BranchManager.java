public class BranchManager extends Person {

    private String branchName;
    private int staffCount;

    public BranchManager() {
    }

    public BranchManager(String name, int age, String branchName, int staffCount) {
        super(name, age);
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
        System.out.println("Branch Name: " + this.branchName);
        System.out.println("Staff Count: " + this.staffCount);
        System.out.println("-----------------------------");
    }
}