public class TaskList {
    private Node head;

    public TaskList() {
        head = null;
    }

    public void addTask(String description) {
        Task newTask = new Task(description);
        Node newNode = new Node(newTask);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void markTaskAsDone(String description) {
        Node current = head;
        while (current != null) {
            if (current.task.getDescription().equalsIgnoreCase(task.description)) {
                current.task.markAsDone();
                return;
            }
            current = current.next;
        }
        System.err.println("Task not found: " + description);
    }

    public void printTasks() {
        if (head == null) {
            System.out.println("No tasks found.");
            return;
        }
        
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }
}
