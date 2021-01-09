package pagecomponents;

public class Main {
    public static void main(String[] args) {
        WebshopPage webshopPage = new WebshopPage();
        webshopPage.searchBar().search("T-Shirt");
        webshopPage.resultList().checkResultHeadline();
        webshopPage.resultList().checkResults();
    }
}
