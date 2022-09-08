import subjects.AbstractSubject;

public class TempSubject extends AbstractSubject{

	protected int temp;

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
		myNotify();
	} 

}
