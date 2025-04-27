import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import com.milestone.AppointmentService;
import com.milestone.Appointment;
import com.milestone.TaskService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class AppointmentServiceTest {
    private AppointmentService apptService;

    @BeforeEach
    public void setUp() {
        apptService = new AppointmentService();
    }

    @Test
    public void testAddAppointment() {
        // Arrange
        String apptID = "2";
        Date apptDate = new Date();
        String apptDescription = "Description of Task Two";

        // Act to add a new appt
        apptService.addAppointment(apptID, apptDate, apptDescription);

        // Assert
        Appointment addedAppt = apptService.getAppt(apptID); // Assuming you have a getter method in the service

        //getheAppID to use for testing
        assertNotNull(addedAppt, "The appointment has been added successfully.");
        assertEquals(apptID, addedAppt.getApptID(), "Appointment ID should match.");
        assertEquals(apptDescription, addedAppt.getapptDescription(), "Appointment description should match.");
    }


    @Test
    public void testRemovedTask() {
        // Act
        apptService.removeAppointment("1");

        // Assert
        assertThrows(IllegalArgumentException.class, () -> {
            apptService.getAppt("1");
        });
    }
}
