import observer.Observer;

public class GasStation implements Observer{

	private double gasPrice;
	private LocalOffice localOffice;
	
	public GasStation(LocalOffice localOffice) {
		this.localOffice = localOffice;
		localOffice.add(this);
		this.gasPrice = localOffice.getGasPrice();
	}
	
	@Override
	public void update() {
		this.gasPrice = localOffice.getGasPrice();
	}

	@Override
	public void display() {
		System.out.println("Gas Price: " + gasPrice);
	}

}
