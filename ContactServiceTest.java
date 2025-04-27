
import static org.junit.jupiter.api.Assertions.*;
import com.milestone.Contact;
import com.milestone.ContactService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    private ContactService contactService;

    @BeforeEach
    public void setUp() {
        //adding a contact obj for each test in case other data was already changed
        contactService = new ContactService();
        contactService.addContact("1", "Nicki", "Minaj", "1234567890", "Gag City");
    }

    @Test
    public void testAddingContact(){
        Contact contact = contactService.getContact("1");
        assertNotNull(contact);
        assertEquals("Nicki", contact.getFirstName());
        assertEquals("Minaj", contact.getLastName());
        assertEquals("1234567890", contact.getPhoneNumber());
        assertEquals("Gag City", contact.getAddress());
    }

    @Test
    public void testDeletingComment(){
        contactService.removeContact("1");

        // make sure that the contact has been removed
        assertThrows(IllegalArgumentException.class, () -> {
            contactService.getContact("1");
        });
    }

    @Test
    public void testUpdatedName(){
        // Update the contact's name
        contactService.updateName("1", "Lisa", "Simpson");

        // Verify that the name was updated
        Contact contact = contactService.getContact("1");
        assertEquals("Lisa", contact.getFirstName());
        assertEquals("Simpson", contact.getLastName());
    }

    @Test
    public void testUpdatedPhoneNumber() {
        // Update the contact's phone number
        contactService.updatePhone("1", "1253123698");

        // Verify that the phone number was updated
        Contact contact = contactService.getContact("1");
        assertEquals("1253123698", contact.getPhoneNumber());
    }

    @Test
    public void testUpdatedAddress() {

        // Update the contact's address
        contactService.updateAddress("1", "456 Elm St");

        // Verify that the address was updated
        Contact contact = contactService.getContact("1");
        assertEquals("456 Elm St", contact.getAddress());
    }





}
