import observer.Observer;

public class StatsDisplay implements Observer{

	private double temp;
	private double humidity;
	private double pressure;
	
	public void update(double temp, double humidity, double pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure; 
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
}
