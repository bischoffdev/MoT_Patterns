package pageobjects;

public class Main {
    public static void main(String[] args) {
        WebshopPage webshopPage = new WebshopPage();
        webshopPage.search("T-Shirt");
        webshopPage.checkResultHeadline();
        webshopPage.checkResults();
    }
}
