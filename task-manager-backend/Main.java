import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        boolean run = true;

        System.out.println("Welcome to Task Manager!\n");

        while (run) {
            System.out.print("Task Manager - Menu:\n" +
                    "1. Add a Task\n" +
                    "2. View Tasks\n" +
                    "3. Update Task\n" +
                    "4. Delete a Task\n" +
                    "5. Exit\n" +
                    "Enter your choice please: ");
            int choice = getValidIntegerInput(scanner);

            switch (choice) {
                case 1:
                    scanner.nextLine(); // Clear the buffer
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(title, description);
                    break;
                case 2:
                    taskManager.viewTask();
                    break;
                case 3:
                    System.out.print("Enter the task number you want to update: ");
                    int updateIndex = getValidIntegerInput(scanner) - 1;
                    scanner.nextLine(); // Clear the buffer
                    System.out.print("Enter new title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter new description: ");
                    String newDescription = scanner.nextLine();
                    taskManager.updateTask(updateIndex, newTitle, newDescription);
                    break;
                case 4:
                    System.out.print("Enter the task number you want to delete: ");
                    int deleteIndex = getValidIntegerInput(scanner) - 1;
                    taskManager.deleteTask(deleteIndex);
                    break;
                case 5:
                    run = false;
                    System.out.println("Exited successfully. Have a nice day!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again!\n");
                    break;
            }
        }
        scanner.close();
    }

    // Helper method to get valid integer input
    private static int getValidIntegerInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }
}