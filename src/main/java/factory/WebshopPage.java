package factory;

public class WebshopPage {

    public SearchBar searchBar() throws Exception {
        return (SearchBar) ComponentFactory.getComponent("SearchBar");
    }

    public ResultList resultList() throws Exception {
        return (ResultList) ComponentFactory.getComponent("ResultList");
    }
}