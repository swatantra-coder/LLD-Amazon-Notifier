package Observer;

import Observable.StockObservable;

public class EmailAlert implements NotificationAlert{

    String emailId;
    StockObservable stockObservable;

    public EmailAlert(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update(int stockCount) {
        semMail(emailId,"Stock is now available");
    }

    public void semMail(String emailId, String message) {
        System.out.println("Email sent to " + emailId + " with message: " + message);
    }

}
