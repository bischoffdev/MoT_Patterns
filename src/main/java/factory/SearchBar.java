package factory;

public class SearchBar extends Component {
    public void search(final String queryString) {
        System.out.println("Enter " + queryString);
        System.out.println("Click search button");
    }
}
