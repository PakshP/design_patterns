public class SCRUMBoard {
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;

    public SCRUMBoard(String projectName) {
        this.projectName = projectName;
        this.todo = new TaskList("To Do");
        this.doing = new TaskList("Doing");
        this.done = new TaskList("Done");
    }

    public void addTicket(String name, String teamMember, int difficulty) {
        this.todo.addTicket(name, teamMember, difficulty);
    }

    public boolean startTicket(String name) {
        Ticket ticket = this.todo.getTicket(name);
        if (ticket != null) {
            this.doing.addTicket(ticket);
            return true;
        }
        return false;
    }

    public boolean finishTicket(String name) {
        Ticket ticket = this.doing.getTicket(name);
        if (ticket != null) {
            this.done.addTicket(ticket);
            return true;
        }
        return false;
    }

    public String toString() {
        return "***** " + this.projectName + "*****" + "\n" + this.todo + "\n" + this.doing + "\n" + this.done;
    }
}
