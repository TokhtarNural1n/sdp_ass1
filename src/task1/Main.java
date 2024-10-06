package task1;

public class Main {
    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment();
        PaymentProcessor processor = new PaymentProcessor(creditCardPayment);
        processor.process(100.00);

        Payment paypalPayment = new PayPalPayment();
        processor = new PaymentProcessor(paypalPayment);
        processor.process(200.00);
    }
}
