
interface PaymentMethod {
    void validate();
    void processTransaction(double amount);
}
class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void validate() {
        System.out.println("Validating Credit Card: " + cardNumber);
        // Simulate validation logic
        if (cardNumber.length() == 16) {
            System.out.println("Credit card validated successfully.");
        } else {
            System.out.println("Invalid credit card number.");
        }
    }

    @Override
    public void processTransaction(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount + " for " + cardHolderName);
        // Simulate transaction logic
        System.out.println("Credit Card transaction complete.");
    }
}
class PayPalPayment implements PaymentMethod {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void validate() {
        System.out.println("Validating PayPal account: " + email);
        // Simulate validation logic
        if (email.contains("@") && email.contains(".")) {
            System.out.println("PayPal account validated successfully.");
        } else {
            System.out.println("Invalid PayPal email.");
        }
    }

    @Override
    public void processTransaction(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " for " + email);
        // Simulate transaction logic
        System.out.println("PayPal transaction complete.");
    }
}
class BankTransferPayment implements PaymentMethod {
    private String accountNumber;
    private String bankName;

    public BankTransferPayment(String accountNumber, String bankName) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    @Override
    public void validate() {
        System.out.println("Validating Bank Transfer details for account: " + accountNumber + " at " + bankName);
        // Simulate validation logic
        if (accountNumber.length() >= 8 && accountNumber.length() <= 12) {
            System.out.println("Bank transfer details validated successfully.");
        } else {
            System.out.println("Invalid bank account number.");
        }
    }

    @Override
    public void processTransaction(double amount) {
        System.out.println("Processing Bank Transfer payment of $" + amount + " to account: " + accountNumber);
        // Simulate transaction logic
        System.out.println("Bank Transfer transaction complete.");
    }
}
public class task2 {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment("1234567890123456", "John Doe");
        PaymentMethod payPal = new PayPalPayment("john.doe@example.com");
        PaymentMethod bankTransfer = new BankTransferPayment("9876543210", "MyBank");

        System.out.println("--- Credit Card Payment ---");
        creditCard.validate();
        creditCard.processTransaction(150.75);

        System.out.println("\n--- PayPal Payment ---");
        payPal.validate();
        payPal.processTransaction(75.20);

        System.out.println("\n--- Bank Transfer Payment ---");
        bankTransfer.validate();
        bankTransfer.processTransaction(200.00);
    }
}