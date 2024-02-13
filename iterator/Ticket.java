public class Ticket {
    private String name;
    private String teamMember;
    private int difficulty;
    
    public Ticket(String name, String teamMember, int difficulty) {
        this.name = name;
        this.teamMember = teamMember;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Ticket: " + name + ", assigned to: " + teamMember + ", difficulty: " + difficulty;
    }
}
