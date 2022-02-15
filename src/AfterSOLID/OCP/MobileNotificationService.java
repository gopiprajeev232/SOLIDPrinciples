package AfterSOLID.OCP;

public class MobileNotificationService implements INotificationService {

    @Override
    public void sendOTP() {
        System.out.println("Sending OTP through SMS... Please check your mobile.");
    }

    @Override
    public void sendTransactionReport() {
        System.out.println("Sending transaction report through SMS... Please check your mobile.");
    }
}
