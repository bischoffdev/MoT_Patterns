package pageobjects;

public class Main {
    public static void main(String[] args) {

        System.out.println("PAGE OBJECTS");
        System.out.println("============");

        WebshopPage webshopPage = new WebshopPage();
        webshopPage.search("T-Shirt");
        webshopPage.checkResultHeadline();
        webshopPage.checkResults();
    }
}
