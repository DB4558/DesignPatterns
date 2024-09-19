package org.example.Observer;

import org.example.Observable.StockObservable;

public interface NotificationObserver {
    void updateObserver(StockObservable observable);
}
