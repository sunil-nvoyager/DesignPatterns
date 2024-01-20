public class ObserverMain {
    public static void main(String[] args) {
        StocksObservable iphoneStocksObservable = new IphoneStocksObservable();
        NotificationObserver observer1 = new EmailNotificationObserver(iphoneStocksObservable, "farhanahmad091@gmail.com");
        NotificationObserver observer2 = new MobileNotificationObserver(iphoneStocksObservable, "8539062684");

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);

        iphoneStocksObservable.setStockQuantity(10);
        iphoneStocksObservable.setStockQuantity(0);
        iphoneStocksObservable.setStockQuantity(100);
    }
}