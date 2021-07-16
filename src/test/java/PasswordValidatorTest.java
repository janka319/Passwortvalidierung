import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    @DisplayName("Check password length, minimum 6 charcters")

    public void checkMinLength6() {
        // Given
        String password = "password";

        // When
        boolean actual = PasswordValidator.hasLength(password);

        // Then
        assertTrue(actual);
    }

    @Test
    @DisplayName("Check password length, maximum 20 charcters")

    public void checkMaxLength20() {
        // Given
        String password = "passwordpasswordpasswordpasswordpassword";

        // When
        boolean actual = PasswordValidator.hasLength(password);

        // Then
        assertFalse(actual);
    }


}