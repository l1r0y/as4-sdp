package Assignment4.Observer;

public class Main {
    public static void main(String[] args) {
        NewsPublisherImpl publisher = new NewsPublisherImpl();

        Observer smartphoneSubscriber = new NewsSubscriberSmartphone();
        Observer laptopSubscriber = new NewsSubscriberLaptop();
        Observer tabletSubscriber = new NewsSubscriberTablet();

        publisher.subscribe(smartphoneSubscriber);
        publisher.subscribe(laptopSubscriber);
        publisher.subscribe(tabletSubscriber);

        publisher.publishNews("Sport", "Local team wins the championship!");
        publisher.publishNews("Science", "New discovery in quantum physics!");
        publisher.publishNews("Politics", "Election results announced.");
    }
}