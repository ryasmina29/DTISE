package Module1.Day9;

import java.util.HashMap;
import java.util.Scanner;

public class Task {
    private HashMap<Integer, String> tasks;

    public Task() {
        this.tasks = new HashMap<>();
    }

    public void addTask() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter task number: ");
        int newTaskNum = sc.nextInt();
        System.out.println("Enter task name: ");
        String newTaskName = sc.next();
        tasks.put(newTaskNum, newTaskName);
        System.out.println("Task added successfully");
    }



    public void removeTask() {
        Scanner sc = new Scanner(System.in);
        displayTasks();
        System.out.println("Which task do you want to remove? (Put number only!): ");
        int deleteTaskNum = sc.nextInt();
        tasks.remove(deleteTaskNum);
        System.out.println("Task removed successfully");
    }

    public void displayTasks() {
        System.out.println("Here is the list of your tasks: ");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ". " + tasks.get(i));
        }
    }
}
