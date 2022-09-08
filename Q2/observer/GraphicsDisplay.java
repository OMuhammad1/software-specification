import observer.Observer;

public class GraphicsDisplay implements Observer{

	private double temp;
	private double humidity;
	private double pressure;
	
	private WeatherStation ws;
	
	public GraphicsDisplay(WeatherStation ws) {
		this.ws = ws;
		ws.add(this);
	}
	
	public void update() {
		this.temp = ws.getTemp();
		this.pressure = ws.getPressure();
		display();
	}

	@Override
	public void display() {
		System.out.println("---- Graphics Display ----");
		//Just some ASCII graphics for demonstration
		String s = "";
		for(int i = 0; i < temp/5; i++) {
			s += "*";
		}
		System.out.println("temp: " + s);
		s = "";
		for(int i = 0; i < pressure/5; i++) {
			s += "*";
		}
		System.out.println("pressure: " + s + "\n");
	}
	
}
