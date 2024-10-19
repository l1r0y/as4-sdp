package Assignment4.Observer;

public class NewsSubscriberLaptop implements Observer {
    private String device = "Laptop";

    @Override
    public void update(String category, String news) {
        if (category.equalsIgnoreCase("Science")) {
            System.out.println(device + " received news in category 'Science': " + news);
        }
    }
}