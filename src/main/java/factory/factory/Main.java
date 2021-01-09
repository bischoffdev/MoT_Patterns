package factory.factory;

public class Main {
    public static void main(String[] args) throws Exception {
        WebshopPage webshopPage = new WebshopPage();
        webshopPage.searchBar().search("Berlin");
        webshopPage.resultList().checkResultHeadline();
    }
}
