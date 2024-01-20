public class MobileNotificationObserver implements NotificationObserver{
    public String mobileNumber;
    StocksObservable observable;

    public MobileNotificationObserver(StocksObservable observable, String mobileNumber) {
        this.mobileNumber = mobileNumber;
        this.observable = observable;
    }


    @Override
    public void update() {
        sendSMSNotification(this.mobileNumber);
    }

    private void sendSMSNotification(String mobileNumber) {
        System.out.println("SMS Sent to user : " + mobileNumber);
    }
}
