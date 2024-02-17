import java.util.Iterator;

/**
 * This class is an iterator for the TaskList class.
 * It iterates over the tickets in the TaskList.
 * 
 * @author Paksh Patel
 */
public class TaskListIterator implements Iterator{
    private Ticket[] tickets;
    private int position;

    /**
     * Constructor for the TaskListIterator class.
     * 
     * @param tickets The array of tickets to iterate over.
     */
    public TaskListIterator(Ticket[] tickets) {
        this.tickets = tickets;
        this.position = 0;
    }

    /**
     * Checks if there are more tickets to iterate over.
     * 
     * @return True if there are more tickets, false otherwise.
     */
    public boolean hasNext() {
        return this.position < this.tickets.length && this.tickets[this.position] != null;
    }

    /**
     * Returns the next ticket in the iteration.
     * 
     * @return The next ticket in the iteration.
     */
    public Ticket next() {
        if(!this.hasNext())
            return null;
        return this.tickets[this.position++];
    }

}
