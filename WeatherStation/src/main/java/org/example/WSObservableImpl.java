package org.example;

import java.util.ArrayList;
import java.util.List;

public class WSObservableImpl implements WSObservable {
  List<DisplayObserver> observerList;
  int temperature;
  int humidity;
  int pressure;
  public WSObservableImpl(){
    observerList=new ArrayList<DisplayObserver>();
  }

  @Override
  public void addObserver(DisplayObserver o) {
    observerList.add(o);
  }

  @Override
  public void remove(DisplayObserver o) {
    observerList.remove(o);
  }

  @Override
  public void notifyObserver() {
    for (DisplayObserver observer : observerList) {
      observer.update();
    }
  }

  public int getTemperature() {
    return temperature;
  }

  public int getHumidity() {
    return humidity;
  }

  public int getPressure() {
    return pressure;
  }

  public void setData(int temperature, int humidity, int pressure) {
    Boolean flag=false;
    if(this.temperature!=temperature){
      this.temperature = temperature;
      flag=true;}
    if(this.humidity!=humidity) {
      this.humidity = humidity;
      flag = true;
    }
    if(this.pressure!=pressure){
      this.pressure=pressure;
      flag=true;
    }
    if(flag==true)
      notifyObserver();
  }
}