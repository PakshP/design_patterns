/**
 * TaskList class is a collection of tickets.
 * It is used to store tickets in a list.
 * 
 * @author Paksh Patel
 */
public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name;

    /**
     * Constructor for the TaskList class.
     * 
     * @param name The name of the task list.
     */
    public TaskList(String name) {
        this.name = name;
        this.tickets = new Ticket[10];
        this.count = 0;
    }

    /**
     * Adds a ticket to the task list.
     * 
     * @param name The name of the ticket.
     * @param teamMember The team member assigned to the ticket.
     * @param difficulty The difficulty of the ticket.
     */
    public void addTicket(String name, String teamMember, int difficulty) {
        Ticket ticket = new Ticket(name, teamMember, difficulty);
        this.tickets[count] = ticket;
        count++;
    }

    /**
     * Adds a ticket to the task list.
     * 
     * @param ticket The ticket to add to the task list.
     */
    public void addTicket(Ticket ticket) {
        this.tickets[count] = ticket;
        count++;
    }

    /**
     * Removes a ticket from the task list.
     * 
     * @param name The name of the ticket to remove.
     * @return The ticket that was removed, or null if the ticket was not found.
     */
    public Ticket getTicket(String name) {
        TaskListIterator iterator = this.createIterator();
        int i = 0;
        while (iterator.hasNext()) {
            Ticket ticket = iterator.next();
            if (ticket.getName().equalsIgnoreCase(name)) {
                while (i < count) {
                    tickets[i] = iterator.next();
                    i++;
                }
                count--;
                return ticket;
            }
            i++;
        }
        return null;
    }

    /**
     * Creates an iterator for the task list.
     * 
     * @return An iterator for the task list.
     */
    public TaskListIterator createIterator() {
        return new TaskListIterator(this.tickets);
    }

    /**
     * Returns a string representation of the task list.
     * 
     * @return A string representation of the task list.
     */
    public String toString() {
        String result = name + ":\n";
        for (int i = 0; i < count; i++) {
            result += tickets[i] + "\n";
        }
        return result;
    }
}