package pagecomponents;

public class Main {
    public static void main(String[] args) {

        System.out.println("PAGE COMPONENTS");
        System.out.println("===============");

        WebshopPage webshopPage = new WebshopPage();
        webshopPage.searchBar().search("T-Shirt");
        webshopPage.resultList().checkResultHeadline();
        webshopPage.resultList().checkResults();
    }
}
