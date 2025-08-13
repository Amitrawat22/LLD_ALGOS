package LLD.Patterns.ObserverDesignPattern.Observable;

import LLD.Patterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifyUsers();
    public void setStockCount(int newStockCount);
    public int getStockCount();
}

//if clicks on notifyme then its implementation is present in iphoneobservanleimple , where if the product wil
// again available then the user or subsctiber who tapped on notify me will eet mobilealert or emailalert that
//now product is available

