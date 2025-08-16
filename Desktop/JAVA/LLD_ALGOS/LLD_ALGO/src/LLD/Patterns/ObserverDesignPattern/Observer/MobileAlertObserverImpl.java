package LLD.Patterns.ObserverDesignPattern.Observer;

import LLD.Patterns.ObserverDesignPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String username;
    StocksObservable observable;

    public MobileAlertObserverImpl(String username, StocksObservable observable){
        this.username = username;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(username, "product is in stock!!");
    }

    public void sendMsgOnMobile(String username, String message){
        System.out.println("Message sent to "+ " "+ username);
    }
}
