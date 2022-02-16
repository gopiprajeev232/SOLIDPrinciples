package AfterSOLID;

import AfterSOLID.DIP.DebitCard;
import AfterSOLID.DIP.IBankCard;
import AfterSOLID.DIP.Supermarket;
import AfterSOLID.ISP.Paytm;
import AfterSOLID.LSP.EmailNotificationService;
import AfterSOLID.OCP.INotificationService;
import AfterSOLID.OCP.WhatsAppNotificationService;
import AfterSOLID.SRP.BankService;
import AfterSOLID.SRP.NotificationService;
import AfterSOLID.SRP.PrinterService;

public class MainMethod {
    public static void main(String... args) {
//        Single Responsibility Principle
        BankService b = new BankService();
        b.withdraw(500, "1929384585");
        b.deposit(5990, "1824775967");

        NotificationService notificationService = new NotificationService();
        notificationService.sendOTP("Email");

        PrinterService printerService = new PrinterService();
        printerService.printTransactions();

        System.out.println();
//        Open/Closed Principle
        INotificationService iNotificationService = new WhatsAppNotificationService();
        iNotificationService.sendOTP();

        System.out.println();
//        Liskov Substitution Principle
        EmailNotificationService emailNotificationService = new EmailNotificationService();
        emailNotificationService.sendOTP();
        emailNotificationService.sendTransactionReportPDF();

        System.out.println();
//        Interface Segregation Principle
        Paytm paytmUPI = new Paytm();
        paytmUPI.getCashBackAsCredit();
        paytmUPI.payMoney(5000);

        System.out.println();
//        Dependency Inversion Principle
        IBankCard debitCard = new DebitCard();
        Supermarket s = new Supermarket(debitCard);
        s.buyItems(500);
    }
}
