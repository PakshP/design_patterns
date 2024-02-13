public class SCRUMBoard {
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;

    public SCRUMBoard(String projectName) {
        this.projectName = projectName;
        this.todo = new TaskList();
        this.doing = new TaskList();
        this.done = new TaskList();
    }

    public void addTicket(String name, String teamMember, int difficulty) {
        todo.addTicket(name, teamMember, difficulty);
    }

    public boolean startTicket(String name) {
        return false;
    }

    public boolean finishTicket(String name) {
        return false;
    }

    public String toString() {
        return "";
    }
}
