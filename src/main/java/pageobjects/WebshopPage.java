package pageobjects;

public class WebshopPage {

    public void search(final String queryString) {
        System.out.println("Enter " + queryString);
        System.out.println("Click search button");
    }

    public void checkResultHeadline() {
        System.out.println("Check if the headline is correct.");
    }

    public void checkResults() {
        System.out.println("Check if there are search results.");
    }
}