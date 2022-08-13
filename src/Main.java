public class Main {
    public static void main(String[] args) {
        String login = "java_skypro";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";
        System.out.println("Confirm password is " + AutorizationService.confirmPassword(login, password, confirmPassword));
    }
}