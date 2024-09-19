package org.example.Observable;

import org.example.Observer.DisplayObserver;

public interface ScoreObservable {
    void addObserver(DisplayObserver observer);
    void removeObserver(DisplayObserver observer);

    void notifyObserver();

    void setScore(int score);

    int getScore();
}
