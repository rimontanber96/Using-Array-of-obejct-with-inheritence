public class Application {

    public static void main(String[] args) {

        BranchManager[] managers = new BranchManager[3];

        managers[0] = new BranchManager("Rahim", 101, 120000, "Sonali Bank", 250, "Dhaka Main", 25);
        managers[1] = new BranchManager("Karim", 102, 135000, "Sonali Bank", 300, "Chattogram", 30);
        managers[2] = new BranchManager("Sara", 103, 110000, "Sonali Bank", 180, "Sylhet", 18);

        for (int i = 0; i < managers.length; i++) {
            managers[i].display();
        }
    }
}