package factory.factory;

public class WebshopPage {

    public SearchBar searchBar() throws Exception {
        return (SearchBar) ComponentFactory.getComponent(SearchBar.class);
    }

    public ResultList resultList() throws Exception {
        return (ResultList) ComponentFactory.getComponent(ResultList.class);
    }
}