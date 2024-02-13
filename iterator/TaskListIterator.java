import java.util.Iterator;

public class TaskListIterator {
    private Ticket[] tickets;
    private int position;

    public TaskListIterator(Ticket[] tickets) {
        this.tickets = tickets;
        this.position = 0;
    }

    public boolean hasNext() {
        return position < tickets.length && tickets[position] != null;
    }

    public Ticket next() {
        return tickets[position++];
    }
}
