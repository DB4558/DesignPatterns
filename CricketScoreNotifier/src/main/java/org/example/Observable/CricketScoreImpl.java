package org.example.Observable;

import org.example.Observer.DisplayObserver;

import java.util.ArrayList;
import java.util.List;

public class CricketScoreImpl implements ScoreObservable{

    List<DisplayObserver> observerList=new ArrayList<DisplayObserver>();
    int score;

    @Override
    public void addObserver(DisplayObserver observer){
        observerList.add(observer);
    }

    @Override
    public void removeObserver(DisplayObserver observer){
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(){
        for(DisplayObserver observer:observerList){
            observer.updateObserver();
        }
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void setScore(int score) {
        if(this.score!=score) {
            this.score = score;
            notifyObserver();
        }
        else
            this.score=score;
    }
}
