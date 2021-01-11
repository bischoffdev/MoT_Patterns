package dependencyinjection;

public class LoginDataFake implements LoginData {

    @Override
    public String getUserName() {
        return "Fake user";
    }

    @Override
    public String getPassword() {
        return "Fake password";
    }
}
