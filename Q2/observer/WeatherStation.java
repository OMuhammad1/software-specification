import java.util.ArrayList;

import observer.Observer;

public class WeatherStation implements Subject{
	
	private double temp;
	private double humidity;
	private double pressure;
	
	private ArrayList<Observer> displays = new ArrayList<Observer>();

	public WeatherStation() {
		temp = 0;
		humidity = 0;
		pressure = 0;
	}
	
	public void myNotify() {
		for(Observer display : displays) {
			display.update();
		}
	}
	
	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
		myNotify();
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
		myNotify();
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
		myNotify();
	}

	public void add(Observer display) {
		displays.add(display);
	}

	@Override
	public void remove(Observer display) {
		displays.remove(display);
		
	}

	

	
	
	
}
