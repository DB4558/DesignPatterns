package org.example;

public class Main {
    public static void main(String[] args) {

        WSObservableImpl observable=new WSObservableImpl();
        MobileDisplay observer1=new MobileDisplay(observable);
        MobileDisplay observer3=new MobileDisplay(observable);
        TVDisplay observer2=new TVDisplay(observable);
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);
        observable.setData(99,25,30);
        observable.setData(100,25,30);
    }
}