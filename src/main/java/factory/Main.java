package factory;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("FACTORY PATTERN");
        System.out.println("===============");

        WebshopPage webshopPage = new WebshopPage();
        webshopPage.searchBar().search("Berlin");
    }
}
