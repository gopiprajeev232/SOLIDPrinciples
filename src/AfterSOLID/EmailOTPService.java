package AfterSOLID;

public class EmailOTPService implements IOTPService {

    @Override
    public void sendOTP() {
        System.out.println("Sending OTP through email... Please check your mail.");
    }
}
