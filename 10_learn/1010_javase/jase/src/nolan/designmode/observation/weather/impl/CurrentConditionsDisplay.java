package nolan.designmode.observation.weather.impl;

import nolan.designmode.observation.weather.intf.DisplayElement;
import nolan.designmode.observation.weather.intf.Observer;
import nolan.designmode.observation.weather.intf.Subject;

public class CurrentConditionsDisplay implements Observer,DisplayElement {
	private Subject sb;
	private float temp;
	private float humidity;
	private float pressure; 
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temp =temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditons : " + temp +"F degrees and " + humidity + "% humidity");
		
	}
	
	public CurrentConditionsDisplay(Subject sb) {
		this.sb= sb;
		sb.registerObserver(this);
	}
	
	

}
