package BeforeSOLID.LSP;

public class WhatsAppNotificationService implements INotificationService {
    @Override
    public void sendOTP() {
        System.out.println("Sending OTP through WhatsApp... Please check your WhatsApp.");
    }

    @Override
    public void sendTransactionReportPDF() {
        System.out.println("Sending a PDF of transaction report through WhatsApp... Please check your WhatsApp.");
    }
}
