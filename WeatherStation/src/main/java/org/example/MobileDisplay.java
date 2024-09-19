package org.example;

public class MobileDisplay implements DisplayObserver{
    WSObservableImpl obj;
    public MobileDisplay(WSObservableImpl o){
        this.obj=o;
    }

    @Override
    public void update(){
        int temp=obj.getTemperature();
        int humidity=obj.getHumidity();
        int pressure=obj.getPressure();
        System.out.println("Current Weather Statistics in Mobile:"+"Temperature:"+temp+" Humidity:"+humidity+" Pressure:"+pressure);
    }
}
