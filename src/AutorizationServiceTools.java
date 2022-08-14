public class AutorizationServiceTools {
    public static boolean cheakLoginCharContains(String massage) {
        if (cheakCharContains(massage)) {
            return true;
        } else {
            throw new WrongLoginException();
        }
    }

    public static boolean cheakPasswordCharContains(String massage) {
        if (cheakCharContains(massage)) {
            return true;
        } else {
            throw new WrongPasswordException();
        }
    }

    public static boolean loginLength(int length) {
        if (length <= 20) {
            return true;
        } else {
            throw new WrongLoginException();
        }
    }

    public static boolean passwordLength(int length) {
        if (length < 20) {
            return true;
        } else {
            throw new WrongPasswordException();
        }
    }

    public static boolean cheakConfirmPassword(String password, String confirmPassword) {
        if (password.equals(confirmPassword)) {
            return true;
        } else {
            throw new WrongPasswordException();
        }
    }

    private static boolean cheakCharContains(String massage) {
        return massage.matches("[a-zA-Z0-9_]+");
    }
}
