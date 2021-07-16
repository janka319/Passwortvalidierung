public class PasswordValidator {
    public static void main(String[] args) {
        String[] passwords = {"asda1", "Pw1234", "CaseCopter2", "Password", "password", "Password1"};
        for (int i = 0; i < passwords.length; i++) {
            System.out.print("Password: " + (i + 1) + " (" + passwords[i] + ") ");
            boolean valid = validation(passwords[i]);
            if (valid) {
                System.out.print("is valid - hurray!");
            }
            System.out.println();
        }
    }

    public static boolean validation(String password) {
        return hasLength(password) &&
                containsDigit(password) &&
                containsLowerCase(password) &&
                containsUpperCase(password);
    }

    public static boolean hasLength(String password) {
        if (password == null) {
            System.out.print("please enter a password");
            return false;
        }
        if (password.length() >= 6 && password.length() <= 20) {
            return true;
        }
        System.out.print("is either too long or too short!");
        return false;
    }

    public static boolean containsDigit(String password) {

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                return true;
            }
        }
        System.out.print("doesn't contain a digit!");
        return false;
    }

    public static boolean containsLowerCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        System.out.print("doesn't contain a lower case letter!");
        return false;
    }

    public static boolean containsUpperCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        System.out.print("doesn't contain an upper case letter!");
        return false;
    }
}
