import observer.Observer;

public class ProblemDisplay implements Observer{

	private AbstractHumiditySubject hs;
	private double temp;
	
	public ProblemDisplay(AbstractHumiditySubject hs) {
		this.hs = hs;
		hs.add(this);
		temp = hs.getHumidity();
	}
	
	@Override
	public void update() {
		temp = hs.getHumidity();
		display();
	}

	@Override
	public void display() {
		System.out.println("I'm a problem");
	}

}
