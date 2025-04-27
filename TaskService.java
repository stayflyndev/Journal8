package com.milestone;
import java.util.HashMap;
import java.util.Map;

//service class encaps logic for data
//APIs and components
//its middleware for UI and the data layer
//methods to manage contacts
public class TaskService {

    //an instance called contactMap with type Map
    //keys as String and Contact as values
    private Map<String, Task> taskMap;

    public TaskService() {
        taskMap = new HashMap<>();
    }

    // Add a new contact
    public void addTask(String taskID, String taskName, String taskDescription) {
        if (taskMap.containsKey(taskID)) {
            throw new IllegalArgumentException("Contact with this ID already exists.");
        }

        Task newTask = new Task(taskID, taskName, taskDescription);
        taskMap.put(taskID, newTask);
    }

    // Remove an existing contact by ID
    public void removeTask(String taskID) {
        if (!taskMap.containsKey(taskID)) {
            throw new IllegalArgumentException("Contact not found.");
        }

        taskMap.remove(taskID);
    }

    public Task getTask(String taskID) {
        Task task = taskMap.get(taskID);
        if (task == null) {
            throw new IllegalArgumentException("Task not found.");
        }
        return task;
    }

    // Update name using the name method
    // verify name exists first
    // which then checks if the number entered is valid
    public void updateTask(String taskID, String newTaskName, String newTaskDescription) {
        Task task = taskMap.get(taskID);

        if (task == null) {
            throw new IllegalArgumentException("Task not found.");
        }

        task.setTaskName(newTaskName);
        task.setTaskDescription(newTaskDescription);

    }

}
