package AfterSOLID.SRP;

public class NotificationService {
    public void sendOTP(String medium) {
        if(medium.equals("Email")) {
            System.out.println("Email is sent.");
        }

        else if(medium.equals("Mobile")) {
            System.out.println("SMS is sent to mobile.");
        }
    }
}
