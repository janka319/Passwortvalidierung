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

    public static boolean containsDigit(String password) {
        char c;
        for (int i=0;i<password.length();i++){
            c = password.charAt(i);
            if (Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }
}
