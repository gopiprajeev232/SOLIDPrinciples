package AfterSOLID.ISP;


public class GooglePay implements UPIPayment {
    public void payMoney(int amount) {
        System.out.printf("%d has been paid", amount);
    }

    @Override
    public void getScratchCard() {
        System.out.println("Congratulations! You've earned a scratch card.");
    }
}
