package Observable;

import Observer.NotificationAlert;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{
    private List<NotificationAlert> notificationAlerts;
    int stockCount;

    public IphoneObservable(String productName, int stockCount) {
        this.notificationAlerts = new ArrayList<>();
        this.stockCount = stockCount;
    }

    @Override
    public void addObserver(NotificationAlert notificationAlert) {
        notificationAlerts.add(notificationAlert);
    }

    @Override
    public void removeObserver(NotificationAlert notificationAlert) {
        notificationAlerts.remove(notificationAlert);
    }

    @Override
    public void notifyObservers() {
        for (NotificationAlert notificationAlert : notificationAlerts) {
            notificationAlert.update(stockCount);
        }
    }

    @Override
    public void setStockCount(int stockCount) {
        if(this.stockCount == stockCount){
            return;
        }
        this.stockCount = stockCount;
        notifyObservers();
    }

    public int getStockCount() {
        return stockCount;
    }
}
