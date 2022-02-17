package AfterSOLID;

public class EmailNotificationService extends NotificationService {

    @Override
    public void sendNotification() {
        System.out.println("Sending notification through email... Please check your mail.");
    }

    @Override
    public void sendTransactionReportPDF() {
        System.out.println("Sending a PDF of transaction report through email... Please check your mail.");
    }
}
