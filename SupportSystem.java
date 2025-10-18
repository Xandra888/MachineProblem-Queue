import java.util.*;

public class SupportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Ticket> queue = new LinkedList<>();

        System.out.println("Welcome to the IT Support Ticketing System!\n");

        System.out.println("--- Enter Ticket Details ---");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Please enter details for ticket " + i + " of 3.");
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Describe your issue: ");
            String issue = scanner.nextLine();

            queue.add(new Ticket(name, issue));
            System.out.println();
        }

        System.out.println("-------------------------------------------");
        System.out.println("All tickets have been logged.");
        System.out.println("There are " + queue.size() + " tickets waiting in the queue.");
        System.out.println("-------------------------------------------\n");

        System.out.println("--- Processing Tickets ---");
        for (int i = 0; i < 2; i++) {
            Ticket current = queue.remove();
            System.out.println("Resolving: " + current);
        }

        System.out.println("-------------------------------------------");
        System.out.println("\nAll done for now.");
        System.out.println("Remaining tickets in queue: " + queue);
    }
}
