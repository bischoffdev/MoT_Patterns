package factory.factory;

public class Component {
    public void initialize() {
        System.out.println("This would initialize " + getClass().getName());
    }
}
