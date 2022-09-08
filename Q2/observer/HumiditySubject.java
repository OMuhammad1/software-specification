public class HumiditySubject extends AbstractHumiditySubject{

	public void setHumidity(int humidity) {
		this.humidity = humidity;
		myNotify();
	}
	
}
