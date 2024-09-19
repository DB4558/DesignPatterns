package org.example;

public interface WSObservable {
    void addObserver(DisplayObserver obj);
    void remove(DisplayObserver obj);
    void notifyObserver();
}
