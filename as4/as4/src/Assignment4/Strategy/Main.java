package Assignment4.Strategy;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1000.0); // Order amount is 1000

        // Оплата банковской картой
        order.setPaymentStrategy(new CardPaymentStrategy());
        System.out.println("Total with Card Payment: " + order.calculateTotal());

        // Оплата электронным кошельком
        order.setPaymentStrategy(new WalletPaymentStrategy());
        System.out.println("Total with Wallet Payment: " + order.calculateTotal());

        // Наложенный платёж
        order.setPaymentStrategy(new CashOnDeliveryStrategy());
        System.out.println("Total with Cash on Delivery: " + order.calculateTotal());
    }
}