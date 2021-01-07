package decorator.components;

public class MobileLoginDecorator extends LoginDecorator {

    public MobileLoginDecorator(LoginComponent loginComponent) {
        super(loginComponent);
    }

    @Override
    public void login(String user, String password) {
        System.out.println("Mobile login: " + user + ", " + password);
    }
}
