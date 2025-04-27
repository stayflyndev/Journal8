
import com.milestone.Task;
import com.milestone.TaskService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {

    private TaskService taskService;

    @BeforeEach
    public void setUp() {
        taskService = new TaskService();
        // Add a task for initial testing
        taskService.addTask("1", "Task One", "Description of Task One");
    }

    @Test
    public void testAddTask() {
        // Arrange
        String taskID = "2";
        String taskName = "Task Two";
        String taskDescription = "Description of Task Two";

        // Act
        taskService.addTask(taskID, taskName, taskDescription);

        // Assert
        Task addedTask = taskService.getTask(taskID); // Assuming you have a getter method in the service
        assertNotNull(addedTask, "The task should be added successfully.");
        assertEquals(taskID, addedTask.getTaskID(), "Task ID should match.");
        assertEquals(taskName, addedTask.getTaskName(), "Task name should match.");
        assertEquals(taskDescription, addedTask.getTaskDescription(), "Task description should match.");
    }


    @Test
    public void testRemovedTask() {
        // Act
        taskService.removeTask("1");

        // Assert
        assertThrows(IllegalArgumentException.class, () -> {
            taskService.getTask("1");
        });
        assertThrows(I)
        });
    }



    @Test
    public void testUpdatedTask() {
        // Arrange
        String taskID = "1";
        String newTaskName = "I am updating Task One";
        String newTaskDescription = "I have been updatdfssdxfdgfdgfgfgfhfghghgfhghghgghed description for Task One";

        // Act
        taskService.updateTask(taskID, newTaskName, newTaskDescription);

        // Assert
        Task updatedTask = taskService.getTask(taskID);
        assertEquals(newTaskName, updatedTask.getTaskName());
        assertEquals(newTaskDescription, updatedTask.getTaskDescription());
    }

}
