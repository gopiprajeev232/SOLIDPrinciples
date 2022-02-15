package AfterSOLID.OCP;

public class EmailNotificationService implements INotificationService {

    @Override
    public void sendOTP() {
        System.out.println("Sending OTP through email... Please check your mail.");
    }

    @Override
    public void sendTransactionReport() {
        System.out.println("Sending transaction report through email... Please check your mail.");
    }
}
