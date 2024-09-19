package org.example.Observer;

import org.example.Observable.StockObservable;

public class EmailObserver implements NotificationObserver{

//    StockObservable observable;
//    public EmailObserver(StockObservable observable){
//       this.observable=observable;
//    }

    @Override
    public void updateObserver(StockObservable observable){
       int newStock= observable.getData();
       System.out.println("Email Notification:Stocks back for "+observable.getProductName());
    }
}
