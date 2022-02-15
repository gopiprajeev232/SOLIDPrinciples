package AfterSOLID.ISP;

import java.util.Random;

public class Paytm implements CashbackManager, UPIPayment {
    @Override
    public void payMoney(int amount) {
        System.out.printf("%d has been paid", amount);
    }

    @Override
    public void getScratchCard() {
        System.out.println("Congratulations! You've earned a scratch card.");
    }

    @Override
    public void getCashBackAsCredit() {
        int cashBackAmount = new Random().nextInt(500);
        System.out.printf("You have received a cashback of %d rupees.", cashBackAmount);
    }
}
