package BeforeSOLID;

public class PaymentMethods {
    public static void main(String[] args) {
//        Single Responsibility Principle
        BankService bankService = new BankService();
        bankService.withdraw(5000, "1239394");
        bankService.deposit(6000, "1385778");
        bankService.sendOTP("Email");
        bankService.printPassbook();

        System.out.println();

//        Open/Closed Principle
        OTPService otpService = new OTPService();
        otpService.sendOTP("Mobile");

//        Liskov Substitution Principle
        NotificationHandler notificationHandler = new EmailNotificationHandler();
        notificationHandler.sendOTP();
        notificationHandler.sendTransactionReportPDF();

        NotificationHandler mobileNotificationHandler = new MobileNotificationHandler();
        mobileNotificationHandler.sendOTP();
//        mobileNotificationHandler.sendTransactionReportPDF(); This method throws an exception.

//        Interface Segregation Principle
        UPIPayment paytmPayment = new Paytm();
        paytmPayment.payMoneyThroughUPI(5000);
        paytmPayment.getCashBackAsCredit();

        UPIPayment googlePayPayment = new GooglePay();
        googlePayPayment.payMoneyThroughUPI(1000);
        googlePayPayment.getCashBackAsCredit();

//        Dependency Inversion Principle
        DebitCard debitCard = new DebitCard();
        Supermarket supermarket = new Supermarket(debitCard);
        supermarket.buyItems(1000);
    }
}
