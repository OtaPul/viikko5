import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Anna tehtaalle nimi: ");
        String factoryName = scanner.nextLine();
        Factory factory = new Factory(factoryName);

        while (true) {
            System.out.println("1) Lisää kone");
            System.out.println("2) Listaa kaikki koneet");
            System.out.println("0) Lopeta ohjelma");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("Kiitos ohjelman käytöstä.");
                break;
            } else if (choice == 1) {
                System.out.print("Anna koneen tyyppi: ");
                String type = scanner.nextLine();
                System.out.print("Anna koneen malli: ");
                String model = scanner.nextLine();
                System.out.print("Anna työntekijän nimi: ");
                String workerName = scanner.nextLine();
                System.out.print("Anna työntekijän ammattinimike: ");
                String workerRole = scanner.nextLine();

                Worker worker = new Worker(workerName, workerRole);
                Machine machine = new Machine(type, model, worker);
                factory.addMachine(machine);
                System.out.println("Kone lisätty!");
            } else if (choice == 2) {
                System.out.println("Tehtaasta " + factory.getName() + " löytyy seuraavat koneet:");
                for (Machine machine : factory.getMachines()) {
                    System.out.println("Koneen tiedot: " + machine.getMachineDetails());
                    System.out.println("Työntekijän tiedot: " + machine.getWorkerDetails());
                }
            }
        }

        scanner.close();
    }
}
