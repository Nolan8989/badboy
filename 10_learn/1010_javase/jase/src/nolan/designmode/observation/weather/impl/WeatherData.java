package nolan.designmode.observation.weather.impl;

import java.util.ArrayList;

import nolan.designmode.observation.weather.intf.Observer;
import nolan.designmode.observation.weather.intf.Subject;

public class WeatherData implements Subject {

	
	private ArrayList<Observer> observers; //观察者
	
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer obs : observers){
			obs.update(temp, humidity, pressure);
		}
	}
	
	
	public void measurementsChanged(){
		notifyObservers();
	}
	
	
	public void setMesurements(float temp,float humidity,float pressure){
		this.temp =temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	
}
