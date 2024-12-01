import Observable.IphoneObservable;
import Observable.StockObservable;
import Observer.EmailAlert;
import Observer.MobileAlert;
import Observer.NotificationAlert;

public class Main {
    public static void main(String[] args) {

        StockObservable iphoneObservable = new IphoneObservable("Iphone 12", 0);

        NotificationAlert ob1= new EmailAlert("swaingh@gmail.com",iphoneObservable);
        NotificationAlert ob2= new EmailAlert("jjcomm@gmail.com",iphoneObservable);
        NotificationAlert ob3= new MobileAlert("swaSingh",iphoneObservable);

        iphoneObservable.addObserver(ob1);
        iphoneObservable.addObserver(ob2);
        iphoneObservable.addObserver(ob3);

        iphoneObservable.setStockCount(1);
        iphoneObservable.setStockCount(19);


    }
}