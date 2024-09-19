package org.example;

public class TVDisplay implements DisplayObserver{

    WSObservableImpl obj;
    public TVDisplay(WSObservableImpl o){
        this.obj=o;
    }

    public void update(){
        int temp=obj.getTemperature();
        int humidity=obj.getHumidity();
        int pressure=obj.getPressure();
        System.out.println("Current Weather Statistics in TV:"+"Temperature:"+temp+" Humidity:"+humidity+" Pressure:"+pressure);
    }
}
