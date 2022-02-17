package AfterSOLID;

public class WhatsAppNotificationService extends NotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Sending notification through WhatsApp... Please check your WhatsApp.");
    }

    @Override
    public void sendTransactionReportPDF() {
        System.out.println("Sending a PDF of transaction report through WhatsApp... Please check your WhatsApp.");
    }
}
