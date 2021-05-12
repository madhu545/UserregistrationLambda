import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenNotValid_ShouldThrowException() throws UserRegistrationException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.firstNameValidation("Madhu");
            Assert.assertTrue(result);
        }
        catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenLastName_WhenNotValid_ShouldThrowException() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.lastNameValidation("Sudhan");
            Assert.assertTrue(result);
        }
        catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_WhenNotValid_ShouldThrowException() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.emailValidation("abc.xyz@mail.com");
            Assert.assertTrue(result);
        }
        catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPhoneNo_WhenNotValid_ShouldThrowException() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.phoneNoValidation("91 8247473242");
            Assert.assertTrue(result);
        }
        catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassword_WhenNotValid_ShouldThrowException() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.passwordValidation("Madhu@123");
            Assert.assertTrue(result);
        }
        catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }
}


