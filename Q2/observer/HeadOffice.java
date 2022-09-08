import subjects.AbstractSubject;

public class HeadOffice extends AbstractSubject{

	private double gasPrice;

	public double getGasPrice() {
		return gasPrice;
	}

	public void setGasPrice(double gasPrice) {
		this.gasPrice = gasPrice;
		myNotify();
	}
	
}
