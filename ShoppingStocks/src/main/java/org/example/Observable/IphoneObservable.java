package org.example.Observable;

import org.example.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{
    List<NotificationObserver> observerList=new ArrayList<NotificationObserver>();
    int stockCount=0;

    @Override
    public void addObserver(NotificationObserver observer){
        observerList.add(observer);
    }

    @Override
    public void removeObserver(NotificationObserver observer){
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(){
        for(NotificationObserver observer:observerList){
            observer.updateObserver(this);
        }
    }

    @Override
    public int getData() {
        return stockCount;
    }

    @Override
    public void setData(int stockCount) {
        if(this.stockCount==0 && stockCount>0) {
            notifyObserver();
        }
        this.stockCount = this.stockCount + stockCount;
    }

    @Override
    public String getProductName(){
        return "Iphone";
    }
}
