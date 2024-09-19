package org.example.Observer;

import org.example.Observable.StockObservable;

public class SMSObserver implements NotificationObserver{

//    StockObservable observable;
//    public SMSObserver(StockObservable observable){
//        this.observable=observable;
//    }

    @Override
    public void updateObserver(StockObservable observable){
        int newStock= observable.getData();
        System.out.println("SMS Notification:Stocks back for "+observable.getProductName());
    }
}
