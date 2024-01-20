public class EmailNotificationObserver implements NotificationObserver{
    public String emailId;
    StocksObservable observable;

    EmailNotificationObserver(StocksObservable observable, String emailId) {
        this.observable = observable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmailNotification(this.emailId);
    }

    private void sendEmailNotification(String emailId) {
        System.out.println("Mail Sent to user : " + emailId);
    }
}
