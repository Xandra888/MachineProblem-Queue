public class Ticket {
    private static int nextTicketID = 1; 

    int ticketID;
    String userName;
    String issueDescription;

    public Ticket(String userName, String issueDescription) {
        this.ticketID = nextTicketID++; 
        this.userName = userName;
        this.issueDescription = issueDescription;
    }

    @Override
    public String toString() {
        return "Ticket #" + ticketID + " [User: " + userName + ", Issue: " + issueDescription + "]";
    }
}
