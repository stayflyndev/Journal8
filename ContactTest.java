
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.milestone.Contact;
import com.milestone.ContactService;
import static org.junit.jupiter.api.Assertions.*;
public class ContactTest {
    private Contact contact;

    @BeforeEach
    public void setUp() {
        // Set up the contact object before each test
        contact = new Contact("1", "Nicki", "Minaj", "1234567890", "Gag City");
    }

    @Test
    public void testConstructorAndGetters() {
        // Test the constructor and getter methods
        assertEquals("1", contact.getContactID());
        assertEquals("Nicki", contact.getFirstName());
        assertEquals("Minaj", contact.getLastName());
        assertEquals("1234567890", contact.getPhoneNumber());
        assertEquals("Gag City", contact.getAddress());
    }

    @Test
    public void testSetters() {
        // Test the setters with test values
        contact.setFirstName("Louis");
        contact.setLastName("Smith");
        contact.setPhoneNumber("1111111111");
        contact.setAddress("Loops St");

        // check test values were updated correctly
        assertEquals("Louis", contact.getFirstName());
        assertEquals("Smith", contact.getLastName());
        assertEquals("1111111111", contact.getPhoneNumber());
        assertEquals("Loops St", contact.getAddress());
    }

}
