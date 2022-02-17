package AfterSOLID;

public class PaymentMethod {
    public static void main(String... args) {
//        Single Responsibility Principle
        BankService bankService = new BankService();
        bankService.withdraw(1000, "2893938475");

        PrinterService printerService = new PrinterService();
        printerService.printTransactions();

//        Open/Closed Principle
        System.out.println();
        WhatsAppOTPService whatsAppOTPService = new WhatsAppOTPService();
        whatsAppOTPService.sendOTP();

//        Liskov Substitution Principle
        System.out.println();
        NotificationService emailNotificationService = new EmailNotificationService();
        emailNotificationService.sendNotification();
        emailNotificationService.sendTransactionReportPDF();

        INotificationService mobileNotificationService = new MobileNotificationService();
        mobileNotificationService.sendNotification();

//      Interface Segregation Principle
        GooglePay googlePay = new GooglePay();
        googlePay.payMoneyThroughUPI(1000);
        googlePay.getScratchCard();

        Paytm paytm = new Paytm();
        paytm.payMoneyThroughUPI(3040);
        paytm.getCashBackAsCredit();

//        Dependency Inversion Principle
        System.out.println();
        IBankCard bankCard = new CreditCard();
        Supermarket supermarket = new Supermarket(bankCard);
        supermarket.buyItems(4500);
    }
}
