import observer.Observer;
import subjects.AbstractSubject;

public class LocalOffice extends AbstractSubject implements Observer{

	private double gasPrice;
	private HeadOffice headOffice;
	
	public LocalOffice(HeadOffice headOffice) {
		this.headOffice = headOffice;
		headOffice.add(this);
		this.gasPrice = headOffice.getGasPrice();
	}
	
	@Override
	public void update() {
		gasPrice = headOffice.getGasPrice();
		myNotify();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
	}

	public double getGasPrice() {
		return gasPrice;
	}

}
