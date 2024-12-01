package Observer;

import Observable.StockObservable;

public class MobileAlert implements NotificationAlert{

    String username;
    StockObservable stockObservable;

    public MobileAlert(String username, StockObservable stockObservable) {
        this.username = username;
        this.stockObservable = stockObservable;
    }


    @Override
    public void update(int stockCount) {
        sendNotification(username, "Stock is now available");
    }

    public void sendNotification(String username, String message) {
        System.out.println("Notification sent to " + username + " with message: " + message);
    }
}
