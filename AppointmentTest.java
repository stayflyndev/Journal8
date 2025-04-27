import com.milestone.Appointment;

import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AppointmentTest {

    @Test
    public void testValidAppointment() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000); // A future date
        Appointment appt = new Appointment("1234567890", futureDate, "Doctor's Appointment");
        assertNotNull(appt);
        assertEquals("1234567890", appt.getApptID());
        assertEquals(futureDate, appt.getApptDate());
        assertEquals("Doctor's Appointment", appt.getapptDescription());
    }

    @Test
    public void testNullApptID() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);
        assertThrows(IllegalArgumentException.class, () -> new Appointment(null, futureDate, "Description"));
    }

//    @Test
//    public void testEmptyApptID() {
//        Date futureDate = new Date(System.currentTimeMillis() + 100000);
//        assertThrows(IllegalArgumentException.class, () -> new Appointment("", futureDate, "Description"));
//    }

    @Test
    public void testApptIDTooLong() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);
        assertThrows(IllegalArgumentException.class, () -> new Appointment("1234567890101515", futureDate, "Description"));
    }

    @Test
    public void testNullApptDate() {
        assertThrows(IllegalArgumentException.class, () -> new Appointment("1234567890", null, "Description"));
    }

    @Test
    public void testApptDateInThePast() {
        Date pastDate = new Date(System.currentTimeMillis() - 100500);
        assertThrows(IllegalArgumentException.class, () -> new Appointment("1234567890", pastDate, "Description"));
    }

    @Test
    public void testNullDescription() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);
        assertThrows(IllegalArgumentException.class, () -> new Appointment("1234567890", futureDate, null));
    }

    @Test
    public void testDescriptionTooLong() {
        Date futureDate = new Date(System.currentTimeMillis() + 200000);
        assertThrows(IllegalArgumentException.class, () -> new Appointment("1234567890", futureDate, "A".repeat(51)));
    }

    @Test
    public void testSetDescriptionTooLong() {
        Date futureDate = new Date(System.currentTimeMillis() + 500000);
        Appointment appt = new Appointment("1234567890", futureDate, "Description");
        assertThrows(IllegalArgumentException.class, () -> appt.setapptDescription("A".repeat(51)));
    }
}
