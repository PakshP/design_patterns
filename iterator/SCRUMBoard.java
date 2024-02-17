/**
 * SCRUMBoard is a class that represents a SCRUM board for a project. It has three TaskLists: todo, doing, and done.
 * 
 * @author Paksh Patel
 */
public class SCRUMBoard {
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;

    /**
     * Constructor for the SCRUMBoard class.
     * 
     * @param projectName The name of the project.
     */
    public SCRUMBoard(String projectName) {
        this.projectName = projectName;
        this.todo = new TaskList("To Do");
        this.doing = new TaskList("Doing");
        this.done = new TaskList("Done");
    }

    /**
     * Adds a ticket to the todo list.
     * 
     * @param name The name of the ticket.
     * @param teamMember The team member assigned to the ticket.
     * @param difficulty The difficulty of the ticket.
     */
    public void addTicket(String name, String teamMember, int difficulty) {
        this.todo.addTicket(new Ticket(name, teamMember, difficulty));
    }

    /**
     * Moves a ticket from the todo list to the doing list.
     * 
     * @param name The name of the ticket to start.
     * @return True if the ticket was found and moved, false otherwise.
     */
    public boolean startTicket(String name) {
        Ticket ticket = this.todo.getTicket(name);
        if (ticket != null) {
            this.doing.addTicket(ticket);
            return true;
        }
        return false;
    }

    /**
     * Moves a ticket from the doing list to the done list.
     * 
     * @param name The name of the ticket to finish.
     * @return True if the ticket was found and moved, false otherwise.
     */
    public boolean finishTicket(String name) {
        Ticket ticket = this.doing.getTicket(name);
        if (ticket != null) {
            this.done.addTicket(ticket);
            return true;
        }
        return false;
    }

    /**
     * toString method to represent the SCRUM board as a string.
     * 
     * @return string representation of the SCRUM board
     */
    public String toString() {
        return "***** " + this.projectName + "*****" + "\n" + this.todo + "\n" + this.doing + "\n" + this.done;
    }
}
