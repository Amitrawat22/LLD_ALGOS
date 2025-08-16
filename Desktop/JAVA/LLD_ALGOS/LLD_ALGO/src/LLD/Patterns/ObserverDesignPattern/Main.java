package LLD.Patterns.ObserverDesignPattern;

import LLD.Patterns.ObserverDesignPattern.Observable.IphoneObservableImpl;
import LLD.Patterns.ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import LLD.Patterns.ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import LLD.Patterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        IphoneObservableImpl observable = new IphoneObservableImpl();
        // stock count  = 0  starting , so when it tackels stock count more then zero soonly then it will send notifitcation
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz@gmail.com",observable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc@gmail.com",observable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("Amit Rawat", observable);

        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);

       observable.setStockCount(1);
    }
}
