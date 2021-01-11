package dependencyinjection;

public class LoginPage {

    private final LoginData loginData;

    public LoginPage(LoginData loginData) {
        this.loginData = loginData;
    }

    public void login(){
        System.out.println("Logging in with " + loginData.getClass());
        System.out.println("- user: " + loginData.getUserName());
        System.out.println("- password: " + loginData.getPassword());
    }
}
