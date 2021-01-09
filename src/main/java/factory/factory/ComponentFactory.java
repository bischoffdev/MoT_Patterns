package factory.factory;

public class ComponentFactory {
    public static <T extends Component> Component getComponent(final Class<T> componentClass) throws Exception {
        System.out.println("Creating component " + componentClass);
        Component component;
        switch (componentClass.getSimpleName()){
            case "SearchBar":
                component = new SearchBar();
                break;
            case "ResultList":
                component = new ResultList();
                break;
            default:
                throw new Exception("Component unknown: " + componentClass);
        }
        component.initialize();
        return component;
    }
}
