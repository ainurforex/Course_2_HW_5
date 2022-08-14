public class AutorizationService {
    public static boolean confirmPassword(String login, String password, String confirmPassword) {
        try {
            if (AutorizationServiceTools.cheakLoginCharContains(login) &&
                    AutorizationServiceTools.loginLength(login.length()) &&
                    AutorizationServiceTools.cheakPasswordCharContains(password) &&
                    AutorizationServiceTools.passwordLength(password.length()) &&
                    AutorizationServiceTools.cheakConfirmPassword(password, confirmPassword)) {
                return true;
            }
        } catch (WrongLoginException e) {
            return false;
        } catch (WrongPasswordException e) {
            return false;
        }
        return false;
    }
}


