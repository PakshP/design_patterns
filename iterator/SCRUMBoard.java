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
        todo.addTicket(name, teamMember, difficulty);
    }

    public boolean startTicket(String name) {
        Ticket ticket = todo.getTicket(name);
        if (ticket != null) {
            doing.addTicket(ticket);
            return true;
        }
        return false;
    }

    public boolean finishTicket(String name) {
        Ticket ticket = doing.getTicket(name);
        if (ticket != null) {
            done.addTicket(ticket);
            return true;
        }
        return false;
    }

    public String toString() {
        return projectName + "\n" + todo + "\n" + doing + "\n" + done;
    }
}
