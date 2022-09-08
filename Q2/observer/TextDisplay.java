import observer.Observer;

public class TextDisplay implements Observer{

	private double temp;
	private double humidity;
	private double pressure;
	
	private WeatherStation ws;
	
	public TextDisplay(WeatherStation ws) {
		this.ws = ws;
		ws.add(this);
	}
	
	public void update() {
		temp = ws.getTemp();
		humidity = ws.getHumidity();
		display();
	}

	public void display() {
		System.out.println("----- Text Display -----");
		System.out.println("temp: " + temp);
		System.out.println("humidity: " + humidity + "\n");
	}
	
	public void unsub() {
		ws.remove(this);
	}
	
	public void resub() {
		ws.add(this);
	}
}
