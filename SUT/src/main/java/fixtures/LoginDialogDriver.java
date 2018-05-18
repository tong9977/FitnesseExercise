package fixtures;

public class LoginDialogDriver {
    private String userName;
    private String password;
    private String message;
    private int loginAttempts;

    public LoginDialogDriver(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean loginWithUsernameAndPassword(String userName, String password) {
        loginAttempts++;
        boolean result =
                this.userName.equals(userName)
                        && this.password.equals(password);
        if (result)
            message = userName + " logged in.";
        else
            message = userName + " not logged in.";
        return result;
    }

    public String loginMessage() {
        return message;
    }

    public int numberOfLoginAttempts() {
        return loginAttempts;
    }
}







