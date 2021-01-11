package decorator;

public class BasicLoginComponent implements LoginComponent {
    @Override
    public void login(String user, String password) {
        System.out.println("Basic login: " + user + ", " + password);
    }
}
