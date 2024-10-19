package Assignment4.Strategy;

public class CardPaymentStrategy implements PaymentStrategy {
    private static final double FEE_PERCENTAGE = 0.02;

    @Override
    public double calculateTotal(double amount) {
        return amount + (amount * FEE_PERCENTAGE);
    }
}