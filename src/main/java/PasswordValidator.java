public class PasswordValidator {
    public static void main(String[] args) {
        String[] passwords = {"asda1", "Pw1234", "CaseCopter2", "Password", "password", "Password1"};
        boolean valid;
        for (int i = 0; i < passwords.length; i++) {
            System.out.print("Password: "+ (i+1) + " (" + passwords[i] + ")");
            valid = validation(passwords[i]);
            System.out.println();
        }
    }

    public static boolean validation(String password) {
        boolean validate = true;
        if (!hasLength(password)) {
            System.out.println("is either too long or too short!");
            validate = false;
        }
        if (!containsDigit(password)) {
            System.out.println("doesn't contain a digit");
            validate = false;
        }
        if (!containsLowerCase(password)) {
            System.out.println("doesn't contain a lower case letter");
            validate = false;
        }
        if (!containsUpperCase(password)) {
            System.out.println("doesn't contain an upper case letter");
            validate = false;
        }
        return validate;
    }

    public static boolean hasLength(String password) {
        if (password.equals(null)) {
            return false;
        }
        if (password.length() >= 6 && password.length() <= 20) {
            return true;
        }
        return false;
    }

    public static boolean containsDigit(String password) {
        char c;
        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i);
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsLowerCase(String password) {
        char c;
        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i);
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;

    }

    public static boolean containsUpperCase(String password) {
        char c;
        for (int i = 0; i < password.length(); i++) {
            c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;

    }
}
