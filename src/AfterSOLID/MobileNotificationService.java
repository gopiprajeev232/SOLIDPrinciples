package AfterSOLID;

public class MobileNotificationService implements INotificationService {
    @Override
    public void sendNotification() {
        System.out.println("Sending OTP through SMS... Please check your mobile.");
    }
}
