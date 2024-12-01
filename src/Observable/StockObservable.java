package Observable;

import Observer.NotificationAlert;

public interface StockObservable {
    public void addObserver(NotificationAlert notificationAlert);
    public void removeObserver(NotificationAlert notificationAlert);
    public void notifyObservers();

    public void setStockCount(int stockCount);
}
