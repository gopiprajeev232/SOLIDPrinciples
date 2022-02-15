package BeforeSOLID.LSP;

public class EmailNotificationService implements INotificationService {

    @Override
    public void sendOTP() {
        System.out.println("Sending OTP through email... Please check your mail.");
    }

    @Override
    public void sendTransactionReportPDF() {
        System.out.println("Sending a PDF of transaction report through email... Please check your mail.");
    }
}
