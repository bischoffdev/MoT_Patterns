package decorator;

public class Main {
    public static void main(String[] args) {

        System.out.println("DECORATOR PATTERN");
        System.out.println("=================");

        // This is the basic login component
        LoginComponent loginComponent = new BasicLoginComponent();
        loginComponent.login("User", "PW");

        // Let's turn it into a mobile login component.
        loginComponent = new MobileLoginDecorator(loginComponent);
        loginComponent.login("User", "PW");

        // Finally, we can add a cancel functionality.
        loginComponent = new CancelButtonDecorator(loginComponent);
        ((CancelButtonDecorator) loginComponent).cancel();
    }
}
