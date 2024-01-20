public interface StocksObservable {
    void add(NotificationObserver observer);
    void remove(NotificationObserver observer);
    void notifyUsers();
    void setStockQuantity(int newStocksAdded);
}
