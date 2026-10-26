public class Application {

    public static void main(String[] args) {

        Manager[] managers = new Manager[3];

        managers[0] = new Manager("Rahim", 101, 80000, "Sales", 10);
        managers[1] = new Manager("Karim", 102, 90000, "IT", 15);
        managers[2] = new Manager("Sara", 103, 85000, "HR", 6);

        for (int i = 0; i < managers.length; i++) {
            managers[i].display();
        }
    }
}