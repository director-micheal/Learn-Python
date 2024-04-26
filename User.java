public class User {
    String username = "King";
    String password = "Pass";
    String login() {
        if (username.equals("King") && password.equals("Pass")) {
            return "Logged in";
        } else {
            return "Failed";
        }
    }
    public static void main(String[] args) {
        User jane = new User();
        System.out.println(jane.login());
    }
}
