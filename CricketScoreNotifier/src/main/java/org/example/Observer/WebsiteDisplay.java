package org.example.Observer;

import org.example.Observable.ScoreObservable;

public class WebsiteDisplay implements DisplayObserver{

    ScoreObservable observable;
   public  WebsiteDisplay(ScoreObservable observable){
        this.observable=observable;
        observable.addObserver(this);
    }

    @Override
    public void updateObserver(){
        int newscore=observable.getScore();
        System.out.println("Website Display is : Score= "+newscore);
    }
}
