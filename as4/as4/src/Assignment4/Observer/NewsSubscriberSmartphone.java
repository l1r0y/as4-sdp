package Assignment4.Observer;

public class NewsSubscriberSmartphone implements Observer {
    private String device = "Smartphone";

    @Override
    public void update(String category, String news) {
        if (category.equalsIgnoreCase("Sport")) {
            System.out.println(device + " received news in category 'Sport': " + news);
        }
    }
}