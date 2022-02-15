package AfterSOLID.OCP;

public class WhatsAppNotificationService implements INotificationService {
    @Override
    public void sendOTP() {
        System.out.println("Sending OTP through WhatsApp... Please check your WhatsApp.");
    }

    @Override
    public void sendTransactionReport() {
        System.out.println("Sending OTP through WhatsApp... Please check your WhatsApp.");
    }
}
