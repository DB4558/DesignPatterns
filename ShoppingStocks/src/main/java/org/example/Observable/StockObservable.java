package org.example.Observable;

import org.example.Observer.NotificationObserver;

public interface StockObservable {
    void addObserver(NotificationObserver observer);
    void removeObserver(NotificationObserver observer);

    void notifyObserver();

    void setData(int newstock);
    int getData();

    String getProductName();
}
