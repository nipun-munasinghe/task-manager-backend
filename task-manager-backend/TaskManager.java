import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> tasks = new ArrayList<>();

    //method to add a task
    public void addTask(String title, String description) {
        tasks.add(new Task(title, description));
        System.out.println("Task added successfully!\n");
    }

    //method to view task
    public void viewTask() {

        //if haven't any tasks
        if(tasks.isEmpty()) {
            System.out.println("No tasks available.\n");
        }
        else {
            System.out.println("\nYour tasks:");
            for (int i=0; i<tasks.size(); i++) {
                System.out.println((i+1) + ". " + tasks.get(i));
            }
            System.out.print("\n");
        }
    }

    //method to update a task
    public void updateTask(int taskIndex, String newTitle, String newDescription) {
        if (taskIndex < 0 || taskIndex>=tasks.size()) {
            System.out.println("Invalid task number:( \n");
        }
        else {
            Task task = tasks.get(taskIndex);
            task.setTitle(newTitle);
            task.setDescription(newDescription);
            System.out.println("Task updated successfully:)\n");
        }
    }

    //method to delete a task
    public void deleteTask(int taskIndex) {
        if(taskIndex < 0 || taskIndex >= tasks.size()) {
            System.out.println("Invalid task number:(\n");
        }
        else {
            tasks.remove(taskIndex);
            System.out.println("Task deleted successfully!\n");
        }
    }
}
