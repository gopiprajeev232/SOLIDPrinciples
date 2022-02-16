package AfterSOLID.OCP;

public class MobileNotificationService implements INotificationService {

    @Override
    public void sendOTP() {
        System.out.println("Sending OTP through SMS... Please check your mobile.");
    }

}
