public class User {
    private String username;
    public Node head;
    public Node tail;
    public int size;

    public User(String username) {
        this.username = username;
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Node createLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void addTask(Task task) {
        Node newNode = new Node();
        newNode.task = task;
        newNode.next = null;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void markTaskAsDone(Task task) {
        Node current = head;
        while (current != null) {
            if (current.task.equals(task)) {
                current.task.markAsCompleted(true);
                break;
            }
            current = current.next;
        }
    }

    public void seeAllTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }
}
