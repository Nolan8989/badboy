package nolan.designmode.observation.weather.app;

import nolan.designmode.observation.weather.impl.CurrentConditionsDisplay;
import nolan.designmode.observation.weather.impl.WeatherData;

public class WeatherStaion {

	
	
	public static void main(String[] args) {
		
		
		WeatherData wd = new WeatherData();
		
		CurrentConditionsDisplay currentCD = new CurrentConditionsDisplay(wd);
		
		
		wd.setMesurements(80, 65, 30.4f);
	}
}
