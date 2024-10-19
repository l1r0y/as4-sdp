package Assignment4.Strategy;

public class CashOnDeliveryStrategy implements PaymentStrategy {
    private static final double DELIVERY_FEE = 300.0;

    @Override
    public double calculateTotal(double amount) {
        return amount + DELIVERY_FEE;
    }
}