package com.milestone;

//require a uniqueUD > 10 or null
//require description
//description cannot be > 20 or null
//description cannot be > 50 or null

public class Task {
    private final String taskID;
    private String taskName;
    private String taskDescription;


    //constructor
    public Task(String taskID, String taskName, String taskDescription){

        if (taskID == null || taskID.length() > 10) {
            throw new IllegalArgumentException("Invalid Task Id");
        }

        if (taskName == null || taskName.length() > 20) {
            throw new IllegalArgumentException("Invalid Task Name");
        }
        if (taskDescription == null || taskDescription.length() > 50) {
            throw new IllegalArgumentException("Invalid description");
        }

        this.taskID = taskID;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }
    //getters and setters
    public String getTaskID(){
        return taskID;
    }

    public String getTaskName(){
        return taskName;
    }
    public void setTaskName(String taskName){
        this.taskName = taskName;
        if (taskName == null || taskName.length() > 20) {
            throw new IllegalArgumentException("Invalid Task Name");
        }
    }
    public String getTaskDescription(){
        return taskDescription;
    }
    public void setTaskDescription(String taskDescription){
        this.taskDescription = taskDescription;
        if (taskDescription == null || taskDescription.length() > 50) {
            throw new IllegalArgumentException("Invalid Task Name");
        }
    }
}
