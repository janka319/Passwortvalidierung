public class PasswordValidator {

    public static boolean hasLength(String password) {
        if (password.equals(null)) {
            return false;
        }
        if (password.length() >= 6 && password.length() <= 20) {
            return true;
        }
        return false;
    }
}
