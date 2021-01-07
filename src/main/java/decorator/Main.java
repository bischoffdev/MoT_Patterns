package decorator;

import decorator.components.BasicLoginComponent;
import decorator.components.CancelButtonDecorator;
import decorator.components.LoginComponent;
import decorator.components.MobileLoginDecorator;

public class Main {
    public static void main(String[] args) {

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
