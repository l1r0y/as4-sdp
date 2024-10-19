package Assignment4.Observer;

public class NewsSubscriberTablet implements Observer {
    private String device = "Tablet";

    @Override
    public void update(String category, String news) {
        System.out.println(device + " received news in category '" + category + "': " + news);
    }
}