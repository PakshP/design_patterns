import java.util.Iterator;

public class TaskListIterator {
    private Ticket[] tickets;
    private int position;

    public TaskListIterator(Ticket[] tickets) {
        this.tickets = tickets;
        this.position = 0;
    }

    public boolean hasNext() {
        return this.position < this.tickets.length;
    }

    public Ticket next() {
        return this.tickets[this.position++];
    }
}
