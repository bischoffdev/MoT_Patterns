package dependencyinjection;

public class LoginDataReal implements LoginData {

    @Override
    public String getUserName() {
        return "Real user";
    }

    @Override
    public String getPassword() {
        return "Real password";
    }
}
