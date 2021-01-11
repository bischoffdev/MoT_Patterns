package dependencyinjection;

public class Main {

    public static void main(String[] args) {

        System.out.println("DEPENDENCY INJECTION");
        System.out.println("====================");

        LoginPage loginPageReal = new LoginPage(new LoginDataReal());
        loginPageReal.login();

        LoginPage loginPageFake = new LoginPage(new LoginDataFake());
        loginPageFake.login();
    }
}
