package BeforeSOLID;

public class MobileNotificationHandler extends NotificationHandler {

    @Override
    public void sendOTP() {
        System.out.println("Sending OTP through SMS... Please check your mobile.");
    }

    @Override
    public void sendTransactionReportPDF() {
        throw new UnsupportedOperationException();
    }
}
