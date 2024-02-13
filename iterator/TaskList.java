public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name;

    public TaskList(String name) {
        this.name = name;
        this.tickets = new Ticket[10];
        this.count = 0;
    }

    public void addTicket(String name, String teamMember, int difficulty) {
        Ticket ticket = new Ticket(name, teamMember, difficulty);
        this.tickets[count] = ticket;
        count++;
    }

    public void addTicket(Ticket ticket) {
        this.tickets[count] = ticket;
        count++;
    }

    public Ticket getTicket(String name) {
        for (int i = 0; i < count; i++) {
            if (this.tickets[i].getName().equals(name)) {
                return this.tickets[i];
            }
        }
        return null;
    }

    public TaskListIterator createIterator() {
        return new TaskListIterator(this.tickets);
    }

    public String toString() {
        String result = name + ":\n";
        for (int i = 0; i < count; i++) {
            result += tickets[i] + "\n";
        }
        return result;
    }
}