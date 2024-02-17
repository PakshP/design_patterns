/**
 * Ticket class to represent a ticket in a SCRUM board
 * 
 * @author Paksh Patel
 */
public class Ticket {
    private String name;
    private String teamMember;
    private int difficulty;
    
    /**
     * Constructor for the Ticket class
     * 
     * @param name name of the ticket
     * @param teamMember team member assigned to the ticket
     * @param difficulty difficulty of the ticket
     */
    public Ticket(String name, String teamMember, int difficulty) {
        this.name = name;
        this.teamMember = teamMember;
        this.difficulty = difficulty;
    }

    /**
     * Getter for the name of the ticket
     * 
     * @return name of the ticket
     */
    public String getName() {
        return this.name;
    }

    /**
     * toString method to represent the ticket as a string
     * 
     * @return string representation of the ticket
     */
    public String toString() {
        return "- " + this.name + "(" + this.difficulty + ")" + " - " + this.teamMember;
    }
}
