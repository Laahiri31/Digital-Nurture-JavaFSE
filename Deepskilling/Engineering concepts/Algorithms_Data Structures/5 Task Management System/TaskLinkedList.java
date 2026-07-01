public class TaskLinkedList {

    private Task head;

    // Add Task
    public void addTask(Task newTask) {

        if (head == null) {

            head = newTask;
            return;
        }

        Task temp = head;

        while (temp.next != null) {

            temp = temp.next;
        }

        temp.next = newTask;
    }

    // Search Task
    public Task searchTask(int id) {

        Task temp = head;

        while (temp != null) {

            if (temp.taskId == id) {

                return temp;
            }

            temp = temp.next;
        }

        return null;
    }

    // Traverse Tasks
    public void displayTasks() {

        if (head == null) {

            System.out.println("No Tasks Available.");
            return;
        }

        Task temp = head;

        while (temp != null) {

            System.out.println(temp);

            temp = temp.next;
        }
    }

    // Delete Task
    public void deleteTask(int id) {

        if (head == null) {

            System.out.println("Task List is Empty.");
            return;
        }

        if (head.taskId == id) {

            head = head.next;
            System.out.println("Task Deleted Successfully.");
            return;
        }

        Task current = head;

        while (current.next != null && current.next.taskId != id) {

            current = current.next;
        }

        if (current.next == null) {

            System.out.println("Task Not Found.");

        } else {

            current.next = current.next.next;
            System.out.println("Task Deleted Successfully.");
        }
    }
}