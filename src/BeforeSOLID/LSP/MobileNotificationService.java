package BeforeSOLID.LSP;

public class MobileNotificationService implements INotificationService {

    @Override
    public void sendOTP() {
        System.out.println("Sending OTP through SMS... Please check your mobile.");
    }

    @Override
    public void sendTransactionReportPDF() {
        System.out.println("Cannot send transaction report through SMS.");
        System.exit(0);
    }
}
