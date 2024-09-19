package org.example;

import org.example.Observable.IphoneObservable;
import org.example.Observable.LaptopObservable;
import org.example.Observable.StockObservable;
import org.example.Observer.EmailObserver;
import org.example.Observer.SMSObserver;

public class Main {
    public static void main(String[] args) {

        StockObservable iphoneobservable=new IphoneObservable();
        StockObservable laptopObservable=new LaptopObservable();
        EmailObserver observer1=new EmailObserver();
        SMSObserver observer2=new SMSObserver();
        EmailObserver observer3=new EmailObserver();
        iphoneobservable.addObserver(observer2);
        iphoneobservable.addObserver(observer1);
        laptopObservable.addObserver(observer3);
        laptopObservable.addObserver(observer1);
        iphoneobservable.setData(5);
        laptopObservable.setData(1);

    }
}