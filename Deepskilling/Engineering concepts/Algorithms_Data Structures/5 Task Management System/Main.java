public class Main {

    public static void main(String[] args) {

        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(101, "Design Homepage", "Pending"));
        taskList.addTask(new Task(102, "Develop Login Module", "In Progress"));
        taskList.addTask(new Task(103, "Test Application", "Pending"));

        System.out.println("Task List:");

        taskList.displayTasks();

        System.out.println("\nSearching Task:");

        Task task = taskList.searchTask(102);

        if (task != null)

            System.out.println(task);

        else

            System.out.println("Task Not Found.");

        taskList.deleteTask(103);

        System.out.println("\nAfter Deletion:");

        taskList.displayTasks();
    }
}