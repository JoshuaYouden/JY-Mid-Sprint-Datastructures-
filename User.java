public class User {
    private String username;
    private TaskList taskList;

    public User(String username) {
        this.username = username;
        this.taskList = new TaskList();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void addTask(String taskDescription) {
        taskList.addTask(taskDescription);
    }

    public void markTaskAsDone(String taskDescription) {
        taskList.markTaskAsCompleted(taskDescription);
    }

    public void seeAllTasks() {
        System.out.println("Tasks for " + username + ":");
        taskList.printTasks();
    }
}
