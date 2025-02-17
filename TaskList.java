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

    public void markTaskAsCompleted(String description) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        if (head.task.getDescription().equalsIgnoreCase(description)) {
            System.out.println("Task '" + description + "' marked as completed.");
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null && !current.task.getDescription().equalsIgnoreCase(description)) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Task not found: " + description);
            return;
        }

        prev.next = current.next;
        System.out.println("Task '" + description + "' marked as completed.");
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
