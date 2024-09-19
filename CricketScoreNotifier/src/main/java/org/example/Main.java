package org.example;

import org.example.Observable.CricketScoreImpl;
import org.example.Observable.ScoreObservable;
import org.example.Observer.MobileDisplay;
import org.example.Observer.WebsiteDisplay;

public class Main {
    public static void main(String[] args) {
        ScoreObservable observable=new CricketScoreImpl();
        MobileDisplay user1=new MobileDisplay(observable);
        WebsiteDisplay user2=new WebsiteDisplay(observable);
        observable.setScore(67);
        observable.setScore(67);
        observable.setScore(99);
    }
}