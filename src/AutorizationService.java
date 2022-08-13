public class AutorizationService {
    public static boolean confirmPassword(String login, String password, String confirmPassword) {
        String a = login + password + confirmPassword;
        if (cheakCharContains(login) == false) {
            throw new RuntimeException("WrongLoginException");
        }
        if (login.length() > 20) {
            throw new RuntimeException("WrongLoginException");
        }

        if (cheakCharContains(password) == false) {
            throw new RuntimeException("WrongPasswordException");
        }

        if (password.length() > 19) {
            throw new RuntimeException("WrongPasswordException");
        }

        if (password.equals(confirmPassword)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean cheakCharContains(String massage) {
        String charsForCheak = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
        for (int i = 0; i < massage.length(); i++) {
            char currentCharacter = massage.charAt(i);
            if (charsForCheak.contains(String.valueOf(currentCharacter)) == false) {
                return false;
            }
        }
        return true;
    }
}


